package input;

import lombok.experimental.var;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author chzhyu at 18-4-9 上午1:41
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int c = super.read(b, off, len);

        IntStream.range(off, off + c)
                .forEach(e -> b[e] = (byte) Character.toLowerCase((char) b[e]));

        return c;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? -1 : Character.toLowerCase(c);
    }

    public static void main(String[] args) {
        try (var in = new LowerCaseInputStream(new FileInputStream("test.txt"))) {
            int c = -1;
            while ((c = in.read()) != -1){
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
