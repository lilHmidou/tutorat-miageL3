public class EXO_inserVal {

    public static void inserVal(int[] tab, int valeur, int position) {
        for (int i = tab.length - 1; i >= position; i--) {
            tab[i] = tab[i - 1];
        }
        tab[position - 1] = valeur;
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void main(String[] args) {
        int[] tab3 = { 1, 2, 3, 4, 5,6,7,8,9 };
        EXO_inserVal.inserVal(tab3, 15, 3);
    }
    
}
