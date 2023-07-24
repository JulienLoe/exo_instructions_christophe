

import java.util.Scanner;

public class Exo_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();
        int i = 0;
        int j = 1;
        int k = 1;
        int somme = 1;
        int count = 0;
        int s = 0;
        while (nombre != i) {
            somme = k;
            s = k;
            while (nombre != somme) {
                if (j == nombre ){
                    break;
                }
                somme = (j + 1) + somme;
                j++;
                count++;

                if(somme == nombre && count != nombre){
                    somme = -1;
                    System.out.print(nombre + " = ");
                    while(  somme <nombre){
                        somme = (s + 1) + somme;
                        if(somme < nombre){
                        System.out.print(s + " + ");}


                        if (somme >= nombre){
                            System.out.println(s);
                            break;
                        }
                        s++;
                    }


                }

            }

            count = 0;
            i++;
            k++;
            j= k;

        }
    }


}