package labs;

import java.util.Random;
import java.util.concurrent.*;

public class JavaLab1 {

    static void gen0_9() {

        int b = 0;
        while (b < 9) {
            int a = (int) (Math.random() * 9);
            switch (a) {
                case 0:
                    System.out.println(a + " : Zero");
                    break;
                case 1:
                    System.out.println(a + " : One");
                    break;
                case 2:
                    System.out.println(a + " :Two");
                    break;
                case 3:
                    System.out.println(a + " :Three");
                    break;
                case 4:
                    System.out.println(a + " :Four");
                    break;
                case 5:
                    System.out.println(a + " :Five");
                    break;
                case 6:
                    System.out.println(a + " :Six");
                    break;
                case 7:
                    System.out.println(a + " :Seven");
                    break;
                case 8:
                    System.out.println(a + " :Eight");
                    break;
                case 9:
                    System.out.println(a + " :Nine");
                    break;
                default:
                    System.out.println(a + " :Out of range, try again");
            }
            b++;
        }
    }

    static void genCont() {
        Random nm = new Random();
        int b = nm.nextInt(100);
        if (b == 0) {
            System.out.println("Frozen");
        } else if ( b <= 14) {
            System.out.println("Cold");
        } else if ( b <= 24) {
            System.out.println("cool");
        } else if ( b <= 40) {
            System.out.println("Cold");
        } else if (b <= 60) {
            System.out.println("cool");
        } else if (b <= 80) {
            System.out.println("Cold");
        } else if (b <= 99) {
            System.out.println("cool");
        } else if (b == 100) {
            System.out.println("boiling");
        }
    }

    static void genRand() {
        Random nm = new Random();
        int b = nm.nextInt(100);
        if (b % 2 == 0) {
            System.out.println(b + " :  Even");
        } else {
            System.out.println(b + " : Odd");
        }
    }

    public static void main(String[] args) {
        int a = ThreadLocalRandom.current().nextInt();
        System.out.println(a);
        genRand();
        genCont();
        gen0_9();
    }

}
