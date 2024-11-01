public class TableauPalindrome {
    
    static boolean tableau_palindrome(int [] a){
        for(int i=0 ; i<a.length ; i++) {
            if (a[i] != a[a.length  -1 -i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] tab1 = new int [] {1,2,3,2,1};
        int [] tab2 = new int [] {1,2,3,4,5};
        System.out.println(tableau_palindrome(tab1));
        System.out.println(tableau_palindrome(tab2));
    }
}
