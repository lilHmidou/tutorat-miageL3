public class EXO_plusPetiteValeurQuiSeRepete {

    public static int plusPetiteValeurQuiSeRepete(int[] tab) {
        // de ce que j'ai compris si on a tab={4,2,4,7,2,4}
        // ça doit renvoyer 4 car c'est la plus petite valeur qui se répète le + de
        // fois
        int count;
        int maxCount = 0;
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            count = 1;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                min = tab[i];
            }
            if (count == maxCount) {
                if (tab[i] < min) {
                    min = tab[i];
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        //int[] tab = { 1, 5, 4, 4, 2, 2, 2 };
        int[] tab={4,2,2,4,7,2,4};
        System.out.println(EXO_plusPetiteValeurQuiSeRepete.plusPetiteValeurQuiSeRepete(tab));
    }

}