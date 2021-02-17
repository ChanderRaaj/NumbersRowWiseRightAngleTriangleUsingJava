import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Value: ");
        int value = input.nextInt();
        for (int i = 1; i <=value ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}