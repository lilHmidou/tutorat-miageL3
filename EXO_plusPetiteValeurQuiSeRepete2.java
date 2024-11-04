public class EXO_plusPetiteValeurQuiSeRepete2 {

    // si on a {0,4,4,4,5,2,2} ça renvoie 2

    public static int plusPetiteValeurQuiSeRepete2(int[] tab) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            int count = 1;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    count++;
                }
            }
            if (count >= 2) {
                if (tab[i] <= min) {
                    min = tab[i];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] tab = { 0, 4, 4, 4, 5, 2, 2 };
        System.out.println(plusPetiteValeurQuiSeRepete2(tab));
    }

}
