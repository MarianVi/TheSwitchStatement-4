import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO

        int numar = scanner.nextInt();

        for (int i = 0; i <= numar; i++) {
            switch (i % 10) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 9:
                    System.out.print(i + " ");
                    break;
            }
        }
        scanner.close();
    }
}