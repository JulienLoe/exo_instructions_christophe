import java.util.Scanner;

public class Exo_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir un jour de la semaine : ");
        int jour = scanner.nextInt();

        switch ( jour){
            case 1 :
                System.out.println("Lundi");
                break;
            case 2 :
                System.out.println("Mardi");
                break;
            case 3 :
                System.out.println("Mercredi");
                break;
            case 4 :
                System.out.println("Jeudi");
                break;
            case 5 :
                System.out.println("Vendredi");
                break;
            case 6 :
                System.out.println("Samedi");
                break;
            case 7 :
                System.out.println("Dimanche");
                break;

            default:
                System.out.println("Erreur");


        }
        scanner.close();
    }
}
