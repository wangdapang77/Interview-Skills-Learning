/**
 * 关于i++和++i
 * @auther mynawang
 * @create 2016-09-09 11:13
 */
public class Inter1 {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("i+++i++: " + (i+++i++));
        System.out.println("i: " + (i));
        System.out.println("i+++++i: " + ((i++)+(++i)));
        System.out.println("i: " + (i));
        System.out.println("i+++i+++i++: " + (i+++i+++i++));
        System.out.println("i: " + (i));
    }
    // 执行
}
