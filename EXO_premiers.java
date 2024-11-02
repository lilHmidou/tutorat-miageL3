public class EXO_premiers {

    public static void premiers(int n) {
        int[] tab = new int[n];
        int index = 0;
        for (int x = 2; x < Integer.MAX_VALUE; x++) {
            boolean nombrePremier = true;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    nombrePremier = false;
                    break;
                }
            }
            if (nombrePremier) {
                tab[index++] = x;
            }
            if (index == n) {
                break;
            }
        }
        /*
         * for (int i = 0; i < n; i++) {
         * System.out.print(tab[i] + " ");
         * }
         */
        // System.out.println();
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void main(String[] args) {
        EXO_premiers.premiers(10);
    }
    
}
