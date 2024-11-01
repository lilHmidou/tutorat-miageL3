public class IndiceMin {
    
    static int indice_min(float[] tab){
        int imin = 0; //on initialise imin a 0
        if (tab.length > 0){ // condition pour eviter les tab null
            for (int i = 0 ; i<tab.length ; i++){
                if (tab[imin] >= tab[i]){ // condition pour savoir si la valeur courante est plus petite a la valeur min 
                    imin=i; // on mets a jour imin avec le nv indice
                }
            }
            
        }
        return imin ;
    }
    public static void main(String[] args) {
        float [] tab = new float [] {2.0f,4.0f,-5.0f,-20.0f,16.0f};
        System.out.println(indice_min(tab));
    }
}
