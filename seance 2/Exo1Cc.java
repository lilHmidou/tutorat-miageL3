public class Exo1Cc {

    static int petiteValeurQuiseRepete(int [] tableau){
        int minvalue = tableau[0]; // ici par défaut j'ai initialisé la petite valeur a la première valeur du tableau 
        // boucle for-each afin de parcourir chaque élément du tableau
        for (int valeur : tableau ){
            int occ = 0 ; // j'ai initialisé mon compteur à zéro il sert a compter les occurences de valeur
            // une boucle qui permet de compter combien de fois la valeur apprait dans le tableau 
            for(int val : tableau){
                if(val == valeur){
                    occ++;
                }
            }
            if(occ>=2){
                if(valeur<minvalue){
                    minvalue = valeur;
                }
            }

        }
            return minvalue;
        
    }
    public static void main(String[] args) {
        int[] tableau = {5, 2, 5, 10, 2, 5}; 
        int resultat = petiteValeurQuiseRepete(tableau);
        System.out.println(resultat);
    }
}
