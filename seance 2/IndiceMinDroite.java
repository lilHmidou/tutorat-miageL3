public class IndiceMinDroite {
    static int indice_min_droite(float [] tab){
        int imin = 0;
        if (tab.length>0){
            for(int i = 0 ; i<tab.length ; i++){
                if(tab[i]<= tab[imin]){
                    imin = i ;
                }
            }
        }
        return imin;
    }
// la difference avec le code IndiceMinGauche c'est que indice_min_gauche retourne l'indice de la première valeur minimale tandis que indice_min_droite retourne la dernière valeur minimale
    public static void main(String[] args) {
        float [] tab = new float [] {-100.0f,2.0f,4.0f,-5.0f,-20.0f,16.0f,-100.0f};
        System.out.println(indice_min_droite(tab));
    }
}
