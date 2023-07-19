import java.util.Scanner;

public class Exo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();

        if(nombre % 2 == 0){
            System.out.println("Le nombre saisi est pair");
        }
        else
            System.out.println("Le nombre saisi est impair");

        scanner.close();
    }
}
