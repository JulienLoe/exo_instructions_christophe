import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();
        int j = 1;
        int i = 1;
        List num = new ArrayList();


        while (i < nombre){

            i++;
            j = j * i;
            System.out.println(j);
            num.add(i);

        }
        for (Object number : num) {
            System.out.println( number );
        }
    }
}
