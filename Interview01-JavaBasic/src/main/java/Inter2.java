import org.junit.Test;

/**
 * Inter2-关于String的那些问题
 * @auther mynawang
 * @create 2016-09-20 20:40
 */
public class Inter2 {

    @Test
    public void compareEqual() {
        // 编译期能确定
        String a0 = "mynawang";
        // 编译期能确定
        String a = "mynawang";
        // 编译期不能确定，运行时重新实例化
        String b = new String("mynawang");
        // 编译期能确定
        String c = "myna" + "wang";
        // http://blog.csdn.net/liucheng2009/article/details/6656940
        // 以上四个变量都指向常量池内的"mynawang"

        System.out.println(a0 == a);
        System.out.println(a0 == b);
        System.out.println(a0 == c);
        System.out.println(a0.equals(b));
        System.out.println(a0.equals(c));
        System.out.println(a0.intern() == b.intern());
    }



}
