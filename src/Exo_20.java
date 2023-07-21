import java.util.Scanner;

public class Exo_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Saisir un nombre : ");
        int nombre = scanner.nextInt();
        System.out.println(nombre);
        int nombreDep = nombre;
        int i = 1;
        int fact = 1;
        int somme = 0;

        while(nombre!=0) {
            int mod = nombre%10;
            System.out.println(mod);

            nombre/=10;


            i = 1;
            fact = 1;
            while (i <= mod){


                fact = fact * i;
                i++;


                }

            somme += fact;



                System.out.println(somme);
            System.out.println("\n");




        }

        if (somme == nombreDep){
            System.out.println(nombreDep + "  est un nombre fort");
        }
//        System.out.println(String.valueOf(sommeNbFort));

    }
}
