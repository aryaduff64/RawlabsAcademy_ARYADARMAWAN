public class Main {

    public static void main(String[] args) {

        //Counting vowel, cononat, total char
        countChar("Rawlabs Academy");

        //checking palindrome
        checkPalindrome("katak");
        checkPalindrome("mister");
        checkPalindrome("kasur rusak");
    }

    public static void countChar(String str) {

        int counterVowels = 0;
        int counterConsonants = 0;
        int total = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == i || ch == 'e' || ch == 'o') {
                counterVowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                counterConsonants++;
            }
        }

        total = counterConsonants + counterVowels;

        System.out.println("Vowels: " + counterVowels);
        System.out.println("Consonants: " + counterConsonants);
        System.out.println("Total: " + total);

    }

    public static void checkPalindrome(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }if (str.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
