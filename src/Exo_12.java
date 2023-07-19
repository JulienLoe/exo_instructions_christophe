import java.util.Scanner;

public class Exo_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir un nombre de chapitres : ");
        int chapitre = scanner.nextInt();
        System.out.println("Saisir un nombre de sous-partie : ");
        int sous_partie = scanner.nextInt();

        for(int a=1; a < sous_partie; a++ ) {
            System.out.println("Chapitre " + a);
            for (int i = 1; i < sous_partie; i++) {
                System.out.println("Sous-partie " + chapitre + "." + i);
            }
        }

    }
}
