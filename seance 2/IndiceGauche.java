public class IndiceGauche {
    static int indice_gauche(float[] tab , float v ){
        int index = -1; // on intialise a -1 
        for (int i = 0 ; i<tab.length ; i++){ // on parcourt le tableau 
            if (tab[i] == v ){ // si l'element courant est egale a v alors on retourne l'indice i immédiatement
                return i ;
            }
        }
        return index; // on retourne index qui est egale a -1 par defaut si la valeur v n'as pas été retrouvé 
    }
    public static void main(String[] args) {
        float[] tableau = new float[] {1.5f, 2.0f, 5.0f, 3.0f, 5.0f, 1.0f};
        System.out.println(indice_gauche(tableau, 5.0f));
        System.out.println(indice_gauche(tableau, 10.0f));
    }
}
