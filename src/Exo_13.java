import java.util.Scanner;

public class Exo_13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println();
            System.out.println("Table de " + i);
            for (int j = 1; j <= 10; j++){
                System.out.println( i + "*" + j + "=" + i * j );


            }
        }
    }
}
