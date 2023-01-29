import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Counting vowel, cononat, total char
        countChar("Rawlabs Academy");

        //checking palindrome
        checkPalindrome("katak");
        checkPalindrome("mister");
        checkPalindrome("kasur rusak");

//        checkPalindrome2("katak");
//        checkPalindrome2("kasur rusak");
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
            } else if (2 >= 'a' && ch <= 'z') {
                counterConsonants++;
            }
        }

        total = counterConsonants + counterVowels;

        System.out.println("Vowels: " + counterVowels);
        System.out.println("Consonants: " + counterConsonants);
        System.out.println("Total: " + total);

    }

    public static void checkPalindrome(String strs) {

        String reverse = "";
        for (int i = strs.length() - 1; i >= 0; i--){
            reverse = reverse + strs.charAt(i);
        }

        if (strs.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

//    public static void checkPalindrome2(String str2){
//        String[] strArray = null;
//        strArray = str2.split(" ");
////        System.out.println(Arrays.asList(strArray));
////        Collections.reverse(Arrays.asList(strArray));
////        System.out.println(Arrays.asList(strArray));
//
//        List<String> list = Arrays.asList(strArray);
//        String str1 = String.join(" ", list);
//        System.out.println(str1);
//
//        for (int i = 0; i < strArray.length; i++ ){
//            System.out.println(strArray[i]);
//        }
//
//    }
}
