public class EXO_fibonnacci {

    public static void fibonnacci(int n) {
        int[] tab = new int[n];
        tab[0] = 1;
        if (n >= 2) {
            tab[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void main(String[] args) {
        
        EXO_fibonnacci.fibonnacci(8);
        
    }
    
}
