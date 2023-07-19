import java.util.Scanner;

public class Exo_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir un âge : ");
        int age = scanner.nextInt();
        System.out.println("Saisir le salaire souhaité : ");
        int salaire = scanner.nextInt();
        System.out.println("Saisir le nombre d'années d'expériences : ");
        int experience = scanner.nextInt();

        if (age < 31 ){
            System.out.println("Vous êtes trop jeune");
        }

        if (experience <= 4 ) {
            System.out.println("Vous manquez d'expérience");
        }
        if(salaire > 40000){
            System.out.println("Salaire trop élevé");
        }
        else
            System.out.println("Profil accepté");
    }
}
