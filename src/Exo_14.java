public class Exo_14 {
    public static void main(String[] args) {
        double population = 96809;
        int annee = 2015;
        double calculPopulation = 0;

        while (calculPopulation < 120000 ){

            annee++;
            population = population + (population * 0.0089);
            calculPopulation = population;



            if(calculPopulation > 120000){
                System.out.printf("La population de Tourcoing dépassera les 120 000 habitants en " + annee + " pour environ ");
                calculPopulation = Math.ceil(calculPopulation);
                String str = String.valueOf(calculPopulation);
                System.out.printf(str.substring(0, str.length()-2));

            }
        }

    }
}
