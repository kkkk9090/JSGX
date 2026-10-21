public class Data_basic {
    public static void main(String[] args) {
        int i  = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000;
        int i4 = 0xff000;
        int i5 = 0b1000000000; // 二进制表示的512

        long n1 = 9000000000000000000L; // long型的结尾需要加L
        long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
//        int i6 = 900L; // 错误：不能把long型赋值给int

//      浮点数：
        float f1 = 3.14f;
        float f2 = 3.14e38f;//科学计数法表示的3.14x10^38(最大)
//      float f3 = 1.0; // 错误：不带f结尾的是double类型，不能赋值给float

        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324;

//      布尔类型(通常JVM内部会把boolean表示为4字节整数)
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3;
        int age = 12;
        boolean isAdult = age>=18;

//      字符类型,char使用单引号''，且仅有一个字符
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);

//      常量:定义变量时候,加上final修饰符,变量变成了常量;
//      常量在定义时进行初始化后不可再次赋值，否则编译出错
        final double PI =3.14;
        double r = 5.0;
        double are = PI *r *r;

//      var关键字
//      当类型的名字太长时候写起来会比较麻烦
//        StringBuilder sb = new StringBuilder();
        var sb = new StringBuilder();
//      编译器根据赋值语句自动推断sb的类型为StringBuilder

//      定义变量时，遵循作用域最小化，将变量定义在尽可能小的作用域，不要重复使用变量名

    }
}
