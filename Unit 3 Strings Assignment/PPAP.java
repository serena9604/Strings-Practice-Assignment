
public class PPAP
{
    public static String nextLine (String prevLine) {
        String objectOne = "";
        String objectTwo = "";
        String returnString = "";
        int startingPoint = 9; //9 = index of first character after String "I have a "
        String firstLetter = "";

        //objectOne loop
        int i = startingPoint;
        if (i == startingPoint) { //capitalize first letter
            firstLetter = prevLine.substring(startingPoint, startingPoint + 1);
            firstLetter = firstLetter.toUpperCase();
            objectOne += firstLetter;
            i ++;
        }

        while (i < prevLine.indexOf(",",startingPoint)) { //spell out first word
            objectOne += prevLine.charAt(i);
            i ++;
        }
        startingPoint = prevLine.indexOf(",") + 11;

        //objectTwo loop
        int j = startingPoint; //spell out second word
        while (j < prevLine.length()) {
            objectTwo += prevLine.charAt(j);
            j ++;
        }

        returnString = "Uh!" + " " + objectOne + " " + objectTwo;
        return returnString;
    }

    public static void main (String args[]) {
        String one = nextLine("I have a pen, I have a apple");
        String two = nextLine("I have a null, I have a pointer");
        String three = nextLine("I have a sea, I have a lion");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }
}
