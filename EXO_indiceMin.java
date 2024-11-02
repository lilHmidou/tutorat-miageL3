public class EXO_indiceMin {

    public static int indiceMin(int[] tab) {
        int min = tab[0];
        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) { // ou tab[i]<=min
                index = i;
                min=tab[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] tab = { 5,1,  6, 2,0, 2 };

        System.out.println(EXO_indiceMin.indiceMin(tab));

    }


    
}
