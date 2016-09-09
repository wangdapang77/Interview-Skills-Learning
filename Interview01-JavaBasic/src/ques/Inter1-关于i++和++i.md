#Inter1-关于i++和++i


###
Q：关于i++和++i计算以下公式的结果

```
public static void main(String[] args) {
    int i = 1;
    System.out.println("i+++i++: " + (i+++i++));
    System.out.println("i: " + (i));
    System.out.println("i+++++i: " + ((i++)+(++i)));
    System.out.println("i: " + (i));
    System.out.println("i+++i+++i++: " + (i+++i+++i++));
    System.out.println("i: " + (i));
}
执行结果：
i+++i++: 3
i: 3
i+++++i: 8
i: 5
i+++i+++i++: 18
i: 8
```