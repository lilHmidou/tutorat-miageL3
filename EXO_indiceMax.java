public class EXO_indiceMax {

    public static int indiceMax(int[] tab) {
        int indiceMax = 0;
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                indiceMax = i;
                max=tab[i];
            }
        }
        return indiceMax;
    }

    public static void main(String[] args) {

        int[] tab = { 22, 2, 5, 6, 265, 2 };

        System.out.println(EXO_indiceMax.indiceMax(tab));
        

    }


    
}
