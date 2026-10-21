import java.util.Scanner;

public class Boolean_Calculate {
    public static void main(String[] args) {
//短路运算：如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。
        boolean a = 5 < 3;
        boolean result = a && (5 / 0 > 0); //不会执行5/0
        System.out.println(result);

//      三元运算符：b?x:y    b为boolean表达式 如果为真则计算x，否则计算y
        int n = -100;
        int x = n >= 0 ? n : -n;
        System.out.println(x);
        System.out.println("输入你的年龄");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean isPrimaryStudent = age >= 6 && age <= 12 ? true : false;
        System.out.println(isPrimaryStudent);

    }
}
