package test;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * @author chzhyu at 18-4-6 下午6:39
 */
public class DuplicateTest {
    @Test
    public void test (){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1,4,7);
        Map<Integer,Integer> map = new HashMap<>();
        list.stream()
                .collect(groupingBy(e -> e))
                .forEach((key, value) -> map.put(key, value.size()));

        System.out.println(map);
    }
}
