import java.util.*;

public class Exo_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Combien de notes souhaitez-vous saisir : ");
        int nombreNote = scanner.nextInt();
        scanner.nextLine();
        List<Integer> list = new ArrayList();
        for (int i = 1; i <= nombreNote; i++){

            System.out.println("Saisir note" + i +" :");

            int note  = scanner.nextInt();
            list.add(note);


        }

        double moy = 0;
        for (int note : list) {
            moy += note;
        }
        double moyenne = moy / list.size();

        System.out.println("La note la plus haute est : " + Collections.max(list));
        System.out.println("La note la plus basse est : " + Collections.min(list));
        System.out.println("La moyenne est de : " +  moyenne);
    }
}
