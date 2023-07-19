import java.util.Scanner;

public class Exo_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir nombre 1 : ");
        int nombre1 = scanner.nextInt();
        System.out.println("Saisir nombre 2 : ");
        int nombre2 = scanner.nextInt();
        System.out.println("Saisir nombre 3 : ");
        int nombre3 = scanner.nextInt();

        if(nombre1 > nombre2 && nombre1 > nombre3){
            System.out.println("Le nombre 1 est le plus grand ");
        } else if (nombre2 > nombre1 && nombre2 > nombre3) {
            System.out.println("Le nombre 2 est le plus grand ");
        }
        else
            System.out.println("Le nombre 3 est le plus grand");

        scanner.close();
    }
}
