public class NbOccurences {
    static int nb_occurences(float [] tab , float v){
        int occ = 0; // on initialise le compteur a 0
        for (int i = 0 ; i<tab.length ; i++){
            if (tab[i] == v){ // si la valeur est egale a v on incremente 
                occ++; 
            }
        }
        return occ;
    }
    public static void main(String[] args) {
        float [] table = new float [] {2.0f, 1.0f, -3.0f, 7.0f, 3.0f, 7.0f, 1.0f};
        System.out.println(nb_occurences(table, 2.0f)); 
        System.out.println(nb_occurences(table, 7.0f)); 
        System.out.println(nb_occurences(table, 9.0f));
    }
}
