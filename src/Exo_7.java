import java.util.Scanner;

public class Exo_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir une année : ");
        int annee = scanner.nextInt();

        if(annee % 2 == 0 && annee % 100 != 0){
            System.out.println(annee + " est une année bissextile");
        }
        else
            System.out.println(annee + " n'est pas une année bissextile");

        scanner.close();
    }

}
