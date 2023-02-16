import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Unesite broj");

        Scanner imput = new Scanner(System.in);

        int broj = imput.nextInt();

        if (broj % 2 == 0) {
            System.out.println("Uneti broj " + broj + " je paran");

        } else {
            System.out.println("Uneti broj " + broj + " je neparan");

        }

    }

}
