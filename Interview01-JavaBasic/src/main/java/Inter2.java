import org.junit.Test;

/**
 * Inter2-关于String的那些问题
 * @auther mynawang
 * @create 2016-09-20 20:40
 */
public class Inter2 {

    @Test
    public void compareEqual() {
        String a = "mynawang";
        String b = new String("mynawang");
        String c = "myna" + "wang";
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.intern() == b.intern());
    }

}
