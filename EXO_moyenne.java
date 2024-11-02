public class EXO_moyenne {

    public static double moyenne(double[] tab) {
        double somme = 0.0;
        for (double v : tab) {
            somme += v;
        }
        // double somme2 = somme(tab); // on appelle la fonction somme juste en
        // au-dessus
        double moyenne = somme / tab.length;
        return moyenne;
    }

    public static void main(String[] args) {
        double[] tab = {1,2,3,7,8,9,11,12,13};
        System.out.println(EXO_moyenne.moyenne(tab));
    }


    
}
