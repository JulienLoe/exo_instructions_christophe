import java.util.Random;
import java.util.Scanner;

public class Exo_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");


        int min = 1;
        int max = 100;

        Random random = new Random();

        int value = random.nextInt(max + min) + min;

        System.out.println(value);
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();
        if(nombre < value){
            System.out.println("Le nombre est plus grand");
        }
        if(nombre > value){
            System.out.println("Le nombre est plus petit");
        }
        int tentative = 0;
        while (value != nombre){
            System.out.println("Saisir un nombre : ");
            nombre = scanner.nextInt();
            tentative++;

            if(nombre < value){
                System.out.println("Le nombre est plus grand");
            }
            if(nombre > value){
                System.out.println("Le nombre est plus petit");
            }
        }


        System.out.println("Vous avez gagné en " + tentative + " tentative(s)");

        scanner.close();
    }
}
