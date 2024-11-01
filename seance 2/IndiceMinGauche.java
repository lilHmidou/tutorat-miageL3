public class IndiceMinGauche {
    
    static int indice_min_gauche(float [] tableau){
        int imin = 0;
        if(tableau.length>0) { //tableau non null
        for (int i=0 ; i<tableau.length ; i++){
            if(tableau[i] < tableau[imin]){ // si la valeur courante du tableau est petite strictement que tab[imin] alors on mets a jour imin avec l'indice i 
                imin = i;
            }
        }
        }
        return imin;
        
    }
    public static void main(String[] args) {
        float [] tab = new float [] {-20.0f,2.0f,-1.0f,4.0f,-5.0f,-20.0f,16.0f};
        System.out.println(indice_min_gauche(tab));
    }
}
