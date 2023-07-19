import java.util.Scanner;

public class Exo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir age : ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Vous êtes majeur, vous pouvez rentrer dans le club.");
        } else
            System.out.println("Vous êtes mineur !");

        scanner.close();
    }
}
