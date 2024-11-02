public class EXO_occurrenceN {

    public static int occurrenceN(int[] tab, int valeur, int n) {
        int occurrence = 0;
        int indice = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                occurrence++;
                if (occurrence == n) {
                    indice = i;
                }
            }
        }

        if (n > occurrence) {
            return -1;
        }

        return indice;
    }

    public static void main(String[] args) {
        int[] tab = { 0, 2, 5, 6, 2, 2 };
        System.out.println(EXO_occurrenceN.occurrenceN(tab, 2,2));
    }
    
}
