public class Char_String {
    public static void main(String[] args) {
//       字符类型
        int n1 = '中';//20013
        int n2 = 'A';//65
        System.out.println(n1);
        System.out.println(n2);
        char b1 = '\u0041';//十六进制0041为65
        char b2 = '\u4e2d';
//      通过sb来进行字符串的拼接
        var sb = new StringBuilder();
        sb.append(b1);
        sb.append(b2);
        System.out.println(sb);

//       String类型
        String s = "";
        String s1 = "A";
        String s2 = "ABC";
        String s3 = "中文 ABC";//6个字符，其中有一个空格
        String S = "abc\"def"; //通过转义字符来输入“
        String S1 = "abc\\ \"def"; //通过转义字符来输入“
//      常见转义字符 \n换行  \r回车 \t表示tab
//      字符串连接 A+B+C
        String s_sum = s + s1 + s2 + s3;
        System.out.println(s_sum);
        int num = 12;
        s_sum += num;//将整形变为字符串类型进行拼接
        System.out.println(s_sum);
//      多行字符串：“”“ ”“”
//      这样为四行字符串，末尾有个回车，不需要则把三引号回上面
        String s_mul = """
                AAA
                BBB
                CCC
                """;
        System.out.println(s_mul);
//      字符串不可变性，变的不是字符串，而是变量s的“指向”。
        String s6 = "hello";
        String t = s6;
        s6 = "world";
        System.out.println(t); // t是"hello"还是"world"?  hello


        int a = 72;
        int b = 105;
        int c = 65281;

//        进行数据类型转换(类型名称)
        String s11 = "" + (char) a + (char) b + (char) c;
        System.out.println(s11);

    }
}
