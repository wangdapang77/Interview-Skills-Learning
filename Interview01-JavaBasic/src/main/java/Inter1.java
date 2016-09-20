/**
 * Inter1-关于i++和++i
 * @auther mynawang
 * @create 2016-09-09 11:13
 */
public class Inter1 {

     /* i++处理步骤 */
    /*
    // 保存初始值
    int temp = i;
    // 做自增操作
    i = i + 1;
    // 返回初始值
    return temp;
    */

    /* ++i处理步骤 */
    /*
    // 做自增操作
    i = i + 1;
    // 返回自增后的值
    return i;
    */

    public static void main(String[] args) {

        //test1();
        //test2();
        //test3();
        //test4();
        test5();

        /*


        System.out.println("i: " + (i));*/
    }

    // i++ 先赋值再加   http://www.importnew.com/17056.html
    private static void test1() {
        int i = 0;

        // 执行1
        /*
        System.out.println("i++: " + (i++));            // 0 【返回的是temp值】
        */

        // 执行2
        /*
        i++;
        System.out.println("i++: " + i);                // 1【i++完成后，i为1】
        */
    }

    // ++i先加再赋值
    private static void test2() {
        int i = 0;

        // 执行1
        /*
        System.out.println("++i: " + (++i));            // 1 【返回自增后的i值】
        */

        // 执行2
        /*
        ++i;
        System.out.println("++i: " + i);                // 1 【返回自增后的i值】
        */
    }

    private static void test3() {
        int i = 0;

        // 公式从左向右进行计算
        // 先算前面i++，根据test1解释，返回0
        // 再计算后面的i++，而此时的i已经为1，根据test1解释，返回1
        // 最后为0 + 1 = 1，结果为1，而此时的i为2
        System.out.println("i+++i++: " + ((i++)+(i++)));
        System.out.println("i: " + i);
    }

    private static void test4() {
        int i = 0;
        // 公式从左向右进行计算
        // 先算前面i++，根据test1解释，返回0
        // 再计算后面的++i，而此时的i已经为1，根据test2解释，执行++1返回2
        // 最后为0 + 2 = 2，结果为2，此时i为2
        System.out.println("i+++++i: " + ((i++)+(++i)));
        System.out.println("i: " + i);
    }

    private static void test5() {
        int i = 0;
        // 公式从左向右进行计算
        // 先算前面i++，根据test1解释，返回0
        // 再计算中间的i++，而此时的i已经为1，根据test1解释，返回1
        // 此时i为2，等式为0 + 1 + i++ = 1 + i++
        // 执行最后的i++，根据test1解释返回2
        // 最后执行1 + 2 = 3
        System.out.println("i+++i+++i++: " + (i+++i+++i++));
        System.out.println("i: " + i);
    }

}
