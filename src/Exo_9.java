import java.util.Scanner;

public class Exo_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir une température : ");
        int temperature = scanner.nextInt();

        if(temperature < 0) {
            System.out.println("SOLIDE");
        } else if (temperature >= 0 && temperature <= 100) {
            System.out.println("LIQUIDE");
        }
        else
            System.out.println("GAZEUX");

        scanner.close();
    }

}
