import java.util.Scanner;

public class Exo_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir un caractère : ");
        String letter = scanner.nextLine();
        char caractere = letter.charAt(0);

        if(Character.isDigit(caractere)){
            System.out.println( caractere + " est un nombre");
        } else if (Character.isLetter(caractere)) {
            System.out.println( caractere + " est une lettre de l'alphabet ");
        }
        else
        System.out.println( caractere + " est un caractére spécial");

        scanner.close();
    }
}
