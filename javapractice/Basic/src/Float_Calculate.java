import java.util.Scanner;

public class Float_Calculate {
    public static void main(String[] args) {
//        浮点数运算和正式运算只能进行加减乘除，不能进行位运算和移位运算
//        浮点数经常无法精确表示:十进制0.1换成2进制位无限循环小数

        double x = 1.0 / 10;    //0.1
        double y = 1 - 9.0 / 10;    //0.09999999999999998
        System.out.println(x);
        System.out.println(y);

//       那如何比较两个浮点数大小呢，可以比较两个数的差值是否比小于一个很小的数
        double r = Math.abs(x - y);
        if (r < 0.00001) {
            System.out.println("x 和 y相等");
        } else {
            System.out.println("二者不相等");

        }
        int n = 5;
        //24/5=4（按两个整数进行运算）    24.0/5=4.8
        double d = 1.2 + 24.0 / n; // 6.0
        System.out.println(d);

//        强制转型:可以将浮点数强制转型为整数。在转型时，浮点数的小数部分会被丢掉。如果转型后超过了整型能表示的最大范围，将返回整型的最大值。
        int n1 = (int) 12.3;//12
        int n2 = (int) 12.7;//12
        int n3 = (int) -12.7; //-12
        int n4 = (int) (12.7 + 0.5); //13
        int n5 = (int) 1.2e20;//2147483647

//       四舍五入：可以对浮点数加0.5，再强制转型
        double d1 = 2.6;
        int nd = (int) (d1 + 0.5);
        System.out.println(nd);

        System.out.println("输入一元二次方程的a，b,c三个参数");
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        if (Math.sqrt(b1 * b1 - 4 * a1 * c1) >= 0) {
            double result1 = (-b1 + Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
            double result2 = (-b1 - Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
            System.out.println("result1:" + result1);
            System.out.println("result2:" + result2);
        } else {
            System.out.println("方程无解");
        }


    }
}
