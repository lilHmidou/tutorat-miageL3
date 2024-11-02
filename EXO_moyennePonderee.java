public class EXO_moyennePonderee {

    public static double moyennePonderee(double[] tab, double[] poids) {
        double somme = 0.0;
        if (tab.length == poids.length) {
            for (int i = 0; i < tab.length; i++) {
                somme += tab[i] * poids[i];
            }
        }
        return somme / tab.length;
    }

    public static void main(String[] args) {
        double[] notes2 = { 11.0, 8.0, 9.0, 3.0, 10.0, 16.0, 2.0, 4.0 };
        double[] groupes = { 0, 1, 0, 0, 0, 0, 0, 0 };
        System.out.println(EXO_moyennePonderee.moyennePonderee(notes2, groupes));
    }

}
