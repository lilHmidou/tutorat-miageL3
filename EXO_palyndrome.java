public class EXO_palyndrome {
    
    public static boolean palyndrome(int[] tab) {
        for (int i = 0, j = tab.length - 1; i < j; i++, j--) {
            if (tab[i] != tab[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] tab = {1,2,2,1};
        int [] tab2 = {1,2,3};
        System.out.println(EXO_palyndrome.palyndrome(tab));
    }

}
