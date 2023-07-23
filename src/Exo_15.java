import java.util.Scanner;

public class Exo_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();
        int i = 0;
        int j = 1;
        int k = 1;
        int l = 1;
        int somme = 1;
        int count = 0;
        int n = 0;
        while (nombre != i) {
            somme = k;
            System.out.println(nombre + " " + somme);

            while (nombre != somme) {

//                System.out.print(somme + " somme ");
                if (j == nombre ){
//                    System.out.println("ok");
                    break;

                }
                somme = (j + 1) + somme;
//                System.out.print(j + " + ");

                j++;
                count++;
                n = j-1;
                if(somme == nombre && count != 45){
                    somme = 0;
                    while(  somme <nombre){
//                        System.out.println("-" + l + "-");
                    somme = (n + 1) + l;
                    System.out.print(n + " + " );
//                    System.out.println("count = " + count);
//                        System.out.println(somme);
                    l++; }
                }
                n = 0;

//                System.out.println(somme);
//                System.out.println(j + " ");
            }


            System.out.println(j);
            count = 0;
            i++;
            k++;
            j= k;

        }
        }


    }

