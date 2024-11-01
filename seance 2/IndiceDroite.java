public class IndiceDroite {
    
    static int indice_droite(float[] tab , float v ){
        int index = -1;// on initialise a -1 par defaut 
        for (int i = tab.length - 1 ; i>=0 ; i--){ // ici on parcourt le tableau en commencant par la fin de droite a gauche
            if (tab[i] == v ){  // si l'element courant est egale a v on retourne l'index i 
                return i ;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        float[] tableau = new float[] {1.5f, 2.0f, 5.0f, 3.0f, 5.0f, 1.0f};
        System.out.println(indice_droite(tableau, 5.0f));
        System.out.println(indice_droite(tableau,   10.0f));
    }
}
