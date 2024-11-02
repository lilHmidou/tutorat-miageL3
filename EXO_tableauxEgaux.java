public class EXO_tableauxEgaux {

    public static boolean tableauxEgaux(int[] tab1, int[] tab2) {
        if (tab1.length == tab2.length) {
            for (int i = 0; i < tab1.length; i++) {
                if (tab1[i] != tab2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] tab =  {1,2,3,4,5};
        int [] tab2 =  {1,2,3,4,5};
        int [] tab3 =  {1,2,3,4,4};
        System.out.println(EXO_tableauxEgaux.tableauxEgaux(tab,tab2));
    }


    
}
