public class EXO_inverse {

    public static void inverse(int[] tab) {
        for (int i = 0, j = tab.length - 1; i < j; i++, j--) {
            int aux = tab[i];
            tab[i] = tab[j];
            tab[j] = aux;
        }
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void main(String[] args) {
        int[] tab3 = { 1, 2, 3, 4, 5 };
        EXO_inverse.inverse(tab3);
    }
    
}
