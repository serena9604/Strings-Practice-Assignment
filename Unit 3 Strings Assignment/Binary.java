
public class Binary
{
    public static void main (String args[]) {
        System.out.println("10");
        System.out.print("1010: ");
        System.out.println(convert(10));
        System.out.println("25");
        System.out.print("11001: ");
        System.out.println(convert(25));
        System.out.println("36");
        System.out.print("100100: ");
        System.out.println(convert(36));

    }

    public static String convert (int n) {
        String newStr = "";
        int remainder = 0;
        while (n > 0) {
            remainder = n % 2;
            n = n/2;
            newStr = remainder + newStr;
        }
        return newStr;
    }
}
