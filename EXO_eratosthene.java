public class EXO_eratosthene {

    public static void eratosthene(int n) {
        boolean[] tab = new boolean[n];
        for (int i = 2; i < tab.length; i++) {
            boolean nombrePremier = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    nombrePremier = false;
                    break;
                }
            }
            if (nombrePremier) {
                tab[i] = true;
            }
        }
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void main(String[] args) {
        
        EXO_eratosthene.eratosthene(10);

    }

}
