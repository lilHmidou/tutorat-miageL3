public class EXO_occurrenceN {

    public static int occurrenceN(int[] tab, int valeur, int n) {
        int occurrence = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                occurrence++;
                if (occurrence == n) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tab = { 0, 2, 5, 6, 2, 2 };
        System.out.println(EXO_occurrenceN.occurrenceN(tab, 6,1));
    }
    
}
