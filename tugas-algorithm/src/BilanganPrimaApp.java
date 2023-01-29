import java.util.Scanner;

public class BilanganPrimaApp {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int ch;
        do {
            System.out.println("Silahkan masukan angka : ");
            ch = s.nextInt();
            String hasilnya = prosesBilanganPrima(ch);
            System.out.println("hasil :" + " " + hasilnya);
            break;
        } while (ch != 0);

    }

    public static String prosesBilanganPrima(int nmbr) {
        String result = null;

        int i, m = 0, flag = 0;
        int n = nmbr; //it is the number to be checked

        m = n / 2;

        if (n == 0 || n == 1) {
            result = "is not prime numbers";
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    result = "is not prime numbers";
                    flag = 1;
                }
            }
            if (flag == 0) {
                result = "is prime numbers";
            }
        }
        return result;
    }
}

