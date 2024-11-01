public class TableauPrefixe {

    static boolean tableau_prefixe(int [] a , int [] b){
        if(a.length >= b.length){
            for (int i=0 ; i<b.length;i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] tab1 = new int [] {1,2,4,2,1};
        int [] tab2 = new int [] {1,2,4};
        int [] tab3 = new int [] {2,4,6,10};
        int [] tab4 = new int [] {2,7,9,10};
        boolean result = tableau_prefixe(tab1, tab2);
        boolean result1 = tableau_prefixe(tab3, tab4);
        System.out.println(result);
        System.out.println(result1);
    }
}
