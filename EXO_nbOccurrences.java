public class EXO_nbOccurrences {

    public static int nbOccurrences(int[] tab, int v) {
        int occurrence = 0;
        for (int val : tab) {
            if (val == v) {
                occurrence++;
            }
        }
        return occurrence;
    }

    public static void main(String[] args) {
        int[] tab = {0,2,5,4,5,2,6};
        System.out.println(EXO_nbOccurrences.nbOccurrences(tab,5));
    }
    
}
