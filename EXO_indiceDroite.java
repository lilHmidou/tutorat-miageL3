public class EXO_indiceDroite {

    public static int indiceDroite(int[] tab, int valeur) {
        int indice = -1;
        for (int i = 0; i < tab.length; i++) { // on peut le faire aussi avec la décrémentation
            if (tab[i] == valeur) {
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {

        int[] tab = { 0, 2, 5, 6, 2, 2 };

        System.out.println(EXO_indiceDroite.indiceDroite(tab, 2));

    }

}
