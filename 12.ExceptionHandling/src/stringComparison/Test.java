package stringComparison;

public class Test {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = new String("Hello World");
        String str4 = new String("Hello World");



        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str4));

        System.out.println(str1 == str3);
        System.out.println(str3 == str4);

        String str5 = "hello world";
        System.out.println(str1==str5);
        System.out.println(str1.equals(str2));
    }
}
