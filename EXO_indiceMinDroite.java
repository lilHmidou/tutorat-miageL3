public class EXO_indiceMinDroite {

    public static int indiceMinDroite(int[] tab) {
        int min = tab[0];
        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] <= min) {
                index = i;
                min=tab[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] tab = { 0, -22, 5, 6, 2,-6, 2 };

        System.out.println(EXO_indiceMinDroite.indiceMinDroite(tab));

    }
    
}
