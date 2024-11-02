public class EXO_tableauInverse {

    public static void tableauInverse(int[] tab) {
        int[] tab2 = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[tab.length - 1 - i];
        }
        System.out.println(java.util.Arrays.toString(tab2));
    }

    public static void main(String[] args) {
        int [] tab ={1,2,3,4,5};
        EXO_tableauInverse.tableauInverse(tab);
    }
}