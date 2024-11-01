public class IndiceN {
    static int indice_n(float [] tab , float v , int n ){
        int occ = 0; //on initialise le compteur a 0
        for (int i = 0 ; i<tab.length ; i++){ // on parcourt le tableau
            if(tab[i] == v){ // ici si la valeur est egale a v alors on incrémente le compteur
                occ++;
                if(occ==n){ // ici si le compteur est egale a n alors on retourne l'indice 
                    return i;
                }
            }
        }
        return -1; // sinon si on trouve pas la n-ième occurence on retourne -1
        
    }
    public static void main(String[] args) {
        float [] tableau = new float [] {2.0f,1.0f,-3.0f,7.0f,3.0f,7.0f,1.0f};
        System.out.println(indice_n(tableau, 2.0f, 1));
        System.out.println(indice_n(tableau, 2.0f, 2));
        System.out.println(indice_n(tableau, 7.0f, 1));
        System.out.println(indice_n(tableau, 7.0f, 2));
        System.out.println(indice_n(tableau, 7.0f, 3));
    }
}
