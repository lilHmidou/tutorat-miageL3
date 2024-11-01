
public class TableauEgaux {
    static boolean tableau_egaux(int[] tab1 , int [] tab2){
        if (tab1.length==tab2.length){ // on verifie s'il sont la mm taille
            for(int i=0 ; i<tab1.length ; i++){ // on parcourt le tableau 
                if(tab1[i]!= tab2[i]){ 
                    return false;
                }
            }
            return true;
        }
        return false;
        
        
    }
    public static void main(String[] args) {
        int [] tab1 = new int [] {1,2,3,4};
        int [] tab2 = new int [] {1,2,3,4};
        int [] tab3  = new int [] {2,4,6,8,10};
        int [] tab4 = new int [] {2,10,8,5,9};
        boolean result = tableau_egaux(tab1, tab2);
        boolean result1 = tableau_egaux(tab3, tab4);
        System.out.println(result);
        System.out.println(result1);
    }
}
