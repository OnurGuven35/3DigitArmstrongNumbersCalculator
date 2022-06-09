import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {

        int k = 999;

        for (int number = 1; number <= k; number++) {
            int a = number;
            int b = 0;
            int c;
            int d;
            int total = 0;

            while (a != 0) {
                a /= 10;
                b++;
            }

            a = number;

            while (a != 0) {
                c = a % 10;
                d = 1;
                for (int i = 1; i <= b; i++) {
                    d *= c;
                }
                total += d;
                a /= 10;
            }

            if (total == number) {
                System.out.println(number + " " + "Sayisi Bir Armstrong Sayisidir ! ");
            }
        }
    }
}
