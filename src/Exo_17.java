import java.util.Scanner;

public class Exo_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir un nombre ( > 1) : ");
        int nombre = scanner.nextInt();

        if (nombre%nombre ==0 && nombre%1 == 0 && nombre%2 == 1){
            System.out.println(nombre + " est un nombre premier ");
        }
        else{
            System.out.println(nombre + " n'est pas un nombre premier");
        }

        scanner.close();
    }
}
