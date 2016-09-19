#Inter2-关于String的那些问题

###
[查看String源码阅读笔记](https://github.com/mynawang/Java-Source-Code-Learning/blob/master/src/main/java/com/sedion/mynawang/java8/lang/TString.java)

Q1：String类能被继承吗，为什么？
A1：String类不能被继承，String类被final修饰所以不能被继承
```
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence {
```
延伸：
若某个类继承String，会提示Cannot inherit from final "java.lang.String"异常

final：能修饰类,方法,属性。
final修饰类时：该类不能被继承。
final修饰方法时：该方法不能被重写。
final修饰类的成员属性时：声明时就要赋值，或者在构造方法中给它赋值。
final修饰类的属性时：必须在声明时赋值。
final修饰局部变量：如果在声明时没有赋值，则在后面的代码中可以有一次给它赋值的机会，一旦赋值则该变量的值不可更改。
final修饰的变量是引用类型时指引用不能更改，引用指向的对象的属性值是可以更改的。
String被设计成不变的类(不变模式)；String内部一些性能处理，如hashCode只算一次；String Pool(字符串常量池)等。