package test;

import org.junit.Test;

/**
 * @author chzhyu at 18-4-6 下午5:52
 */
public class InheritanceTest {


    @Test
    public void test (){
        new B().hi();
        B a = (B)null;
        a.hi();
    }
}
class A {
    public static String str = "A_str";

    public void say(){
        System.out.println(str);
    }

    static void hi(){
        System.out.println(str);
    }
}

class B extends A{
    public static String str = "B_str";

    @Override
    public void say() {
        System.out.println(str);
    }
    static void hi(){
        System.out.println(str);
    }
}