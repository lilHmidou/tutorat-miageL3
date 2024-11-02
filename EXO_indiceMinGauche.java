public class EXO_indiceMinGauche {

    public static int indiceMinGauche(int[] tab) {
        int min = tab[0];
        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                index = i;
                min=tab[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] tab = { 10, 5, 6, 2,-6,-22, 2 };

        System.out.println(EXO_indiceMinGauche.indiceMinGauche(tab));

    }
    
}
