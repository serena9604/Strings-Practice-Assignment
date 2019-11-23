
public class PigLatin {
    public static String convert(String word) {
        String newWord = "";
        if (word.length() < 2) return word;
        String front = word.substring(0,1);
        String back = word.substring(1);
        newWord = back + front + "ay";
        return newWord;
    }

    public static String newSentence(String sentence) {
        String newSentence = "";
        if (sentence.length() < 3) return sentence;
        while (sentence.length() > 2) {
            if (sentence.indexOf(" ") == -1) {
                newSentence = convert(sentence);
                sentence = "";
            } else {
                sentence += " ";
                String word = sentence.substring(0, sentence.indexOf(" "));
                newSentence += convert(word) + " ";
                sentence = sentence.substring(sentence.indexOf(" ") + 1);
            }
        }
        newSentence = newSentence.substring(0, newSentence.length() - 1);
        return newSentence;
    }

    public static void main (String[] args) {
        System.out.print("ti: ");
        System.out.println(newSentence("ti"));
        System.out.print("Zana Nimani: ");
        System.out.println(newSentence("Zana Nimani"));
        System.out.print("Dodirni mi kolena: ");
        System.out.println(newSentence("Dodirni mi kolena"));
    }

}
