
public class Palindromes
{
    public static void main (String args[]) {
        System.out.print("abba: ");
        System.out.println(isPalindrome("abba"));
        System.out.print("racecar: ");
        System.out.println(isPalindrome("racecar"));
        System.out.print("tarcraftsay: ");
        System.out.println(isPalindrome("tarcraftsay"));
        System.out.print("A man, a plan, a canal: Panama: ");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.print("Amy, must I jujitsu my ma?: ");
        System.out.println(isPalindrome("Amy, must I jujitsu my ma?"));

    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String newStr = "";
        String frontHalf = "";
        String backHalf = "";
        for (int i = 0; i < str.length(); i ++) {
         if (Character.isLetter(str.charAt(i)) ) {
             newStr += str.charAt(i);
            }
        }
        if (newStr.length() % 2 == 0) {
            for (int i = 0; i < newStr.length()/2; i ++) {
                frontHalf += newStr.charAt(i);
            }
            for (int i = newStr.length() - 1; i >= newStr.length()/2; i --) {
                backHalf += newStr.charAt(i);
            }
            if (frontHalf.equals(backHalf)) return true;
        } else {
            for(int i = 0; i < newStr.length()/2; i ++) {
                frontHalf += newStr.charAt(i);
            }
            for (int i = newStr.length() - 1; i >= (newStr.length()/2) + 1; i --) {
                backHalf += newStr.charAt(i);
            }
            if (frontHalf.equals(backHalf)) return true;
        }

        
        return false;
    }
}
