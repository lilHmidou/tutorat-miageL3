public class EXO_somme {

    public static double somme(double[] tab) {
        double somme = 0.0;
        for (double val : tab) {
            somme += val;
        }
        return somme;
    }

    public static void main(String[] args) {
        double [] tab = {1,2,3,4,5};
        System.out.println(EXO_somme.somme(tab));

    }
}
