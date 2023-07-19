import java.util.Scanner;

public class Exo_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir un caractère : ");
        String letter = scanner.nextLine().toLowerCase();
        char caractere = letter.charAt(0);

        if(caractere == 'a'|| caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ){
            System.out.println("Le caractère saisi est une voyelle");
        }
        else
            System.out.println("Le caractère saisi est une consonne");

        scanner.close();
    }
}
