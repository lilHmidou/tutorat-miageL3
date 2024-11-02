public class EXO_indiceGauche {

    public static int indiceGauche(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] tab = { 0, 2, 5, 6, 2, 2 };

        System.out.println(EXO_indiceGauche.indiceGauche(tab,2));
        

    }
    
}
