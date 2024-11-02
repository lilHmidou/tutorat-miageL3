public class EXO_tableauxPrefixe {
    
    public static boolean tableauPrefixe(int[] tab1, int[] tab2) {
        if (tab1.length >= tab2.length) {
            for (int i = 0; i < tab2.length; i++) {
                if (tab1[i] != tab2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int [] tab1 = {1,2,3,4,5};
        int [] tab2 = {1,2,3};
        System.out.println(EXO_tableauxPrefixe.tableauPrefixe(tab1, tab2));
    }
}
