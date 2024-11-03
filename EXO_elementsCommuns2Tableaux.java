public class EXO_elementsCommuns2Tableaux {

    public static int elementsCommuns2Tableaux(int[] tab1, int[] tab2) {

        java.util.Arrays.sort(tab1); // d'abord on trie les 2 tableaux
        java.util.Arrays.sort(tab2);

        int m = 0;
        int count = 0;
        for (int i = 0; i < tab1.length; i++) { // je parcours les éléments de tab1
            for (int j = m; j < tab2.length; j++) { // je parcours les éléments de tab2 pour comparer tab1[i] avec tous
                                                    // les éléments de tab2 avec la condition de départ j=m
                if (tab1[i] == tab2[j]) { // si je trouve 2 éléments qui sont égaux
                    count++; // j'incrémente mon compteur
                    m = j + 1;// comme mes tableaux sont triés, si tab1[i]==tab2[j], alors tous les éléments
                              // avant
                              // tab2[j+1] ne m'intéressent plus,donc la boucle qui parcourt tab2 doit
                              // repartir à j+1;
                    break; // break car il peut y avoir un élément commun entre les 2 tableaux mais qui se
                           // répète 2 fois dans tab2, or on veut seulement le compter une
                           // fois
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] tab1 = { 1, 2, 3, 5, 5 };
        int[] tab2 = { 2, 4, 5, 5, 5, 8, 9 };
        System.out.println(EXO_elementsCommuns2Tableaux.elementsCommuns2Tableaux(tab1, tab2));
    }

}
