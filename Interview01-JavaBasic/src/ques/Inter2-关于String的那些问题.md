#Inter2-关于String的那些问题

###
[查看String源码阅读笔记](https://github.com/mynawang/Java-Source-Code-Learning/blob/master/src/main/java/com/sedion/mynawang/java8/lang/TString.java)

Q1：String类能被继承吗，为什么？
--------------------------------
A1：String类不能被继承，String类被final修饰所以不能被继承
```
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence {
```
延伸：
若某个类继承String，会提示Cannot inherit from final "java.lang.String"异常
String被设计成不变的类(不变模式)；String内部一些性能处理，如hashCode只算一次；String Pool(字符串常量池)等。

final：能修饰类,方法,属性。

final修饰类时：该类不能被继承。

final修饰方法时：该方法不能被重写。

final修饰类的成员属性时：声明时就要赋值，或者在构造方法中给它赋值。

final修饰类的属性时：必须在声明时赋值。

final修饰局部变量：如果在声明时没有赋值，则在后面的代码中可以有一次给它赋值的机会，一旦赋值则该变量的值不可更改。

final修饰的变量是引用类型时：指引用不能更改，引用指向的对象的属性值是可以更改的。

Q2：老生常谈的String 和StringBuilder、StringBuffer的区别？
--------------------------------
A2：Java平台提供了两种类型的字符串：String和StringBuffer / StringBuilder，它们可以储存和操作字符串。

其中String是只读字符串，也就意味着String引用的字符串内容是不能被改变的。

而StringBuffer和StringBuilder 类表示的字符串对象可以直接进行修改。

StringBuilder是JDK 1.5中引入的，它和StringBuffer的方法完全相同，区别在于它是在单线程环境下使用的，

因为它的所有方面都没有被synchronized修饰，因此它的效率也比StringBuffer略高。

面试题目1：有一个面试题问：有没有哪种情况用+做字符串连接比调用StringBuffer / StringBuilder对象的append方法性能更好？

如果连接后得到的字符串在静态存储区中是早已存在的（如常量的拼接），那么用+做字符串连接是优于StringBuffer / StringBuilder的append方法的。

面试题目2：下面也是一个面试题，问程序的输出，看看自己能不能说出正确答案。
```
public class StringEqualTest {
    public static void main(String[] args) {
        String a = "Programming";
        String b = new String("Programming");
        String c = "Program" + "ming";
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.intern() == b.intern());
    }
}
```