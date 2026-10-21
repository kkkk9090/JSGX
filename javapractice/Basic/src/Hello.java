public class Hello {
    public static void main(String[] args) {
        int x = 100;
//      使用
        System.out.println(String.format("hello world %s", x));
        System.out.println("hello world " + x);
        x = 200;
        System.out.println(x);

    }
}
