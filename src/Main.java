import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int[] home = {1, 2, 3};
        double[] casa = {1.57, 7.654, 9.986};
        char[] pul = {'a','b','c', 'd','e',};
        // Задание 2
        System.out.println("Задание 2 ");
        for (int i = 0; i < home.length; i++) {
            System.out.print(home[i]);
            if (i != home.length - 1) {
                System.out.print(",");
            }


        }
        System.out.println();
        for (int i = 0; i < casa.length; i++) {
            System.out.print(casa[i]);
            if (i != casa.length - 1) {
                System.out.print(",");
            }


        }
        System.out.println();
        for (int i = 0; i < pul.length; i++) {
            System.out.print(pul[i]);
            if (i != pul.length - 1) {
            }
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3 ");
        for (int i = home.length - 1; i >= 0; i--) {
            System.out.print(home[1]);
            if (i <= 0) {
                System.out.print(",");
            }
        }
        for (int i = casa.length - 1; i >= 0; i--) {
            System.out.print(home[1]);
            if (i <= 0) {
                System.out.print(",");


            }
        }
        for (int i = pul.length - 1; i >= 0; i--) {
            System.out.print(home[1]);
            if (i <= 0) {
                System.out.print(",");

            }
        }
        // Задание 4
        System.out.println(" Задание 4");
        for (int i = 0; i < home.length ; i++) {
            if (home[i] % 2 != 0) {
                home[i] += 1 ;


            }
            }
        System.out.print(Arrays.toString(home));
        }
    }
