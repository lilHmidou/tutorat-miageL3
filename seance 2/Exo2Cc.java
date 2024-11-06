public class Exo2Cc {
    // ici on doit renvoyer le nombre d'éléments communs entre deux tableaux (pas besoin de les afficher)
    static int  nbElementcommun(int [] tab1 , int [] tab2){
        // ici j'ai initialisé un compteur a zéro
        int compteur = 0 ;
        // boucle for qui parcourt le tableau 1
        for (int i = 0 ; i<tab1.length ; i++){
            // boucle for qui  va nous permettre de verifier si l'element est present dans le tableau 2 
            for (int j=0 ; j<tab2.length ; j++){
                if (tab1[i]==tab2[j]){
                    compteur++; // on incremente
                    break; // le break va nous permetre de sortir de la boucle  des qu'on a trouvé un element commun
                }
            }
        }
        return compteur;
    }
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4,6,9,10}; 
        int[] tab2 = {3, 4, 5, 6,10}; 
        int resultat = nbElementcommun(tab1, tab2); 
        System.out.println(resultat);
    }
}
