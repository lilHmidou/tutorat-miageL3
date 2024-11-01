public class IndiceMax {
    static int indice_max (float [] a ){
        int imax = 0; // on intialise imax au premier index 
        if(a.length>0){ // on verifie que le tableau est non null
            for(int i=0;i<a.length ; i++){ // on parcourt le tableau 
                if(a[imax]<a[i]){ // si la valeur d'index imax est inferieur a la valeur d'indice courant i alors on mets a jour la valeur de imax avec i 
                    imax = i ;
                }
            }
        }
        return imax;
    }

    public static void main(String[] args) {
        float[] tab = new float[] {1.5f, 2.0f, 5.0f, 3.0f, 5.0f, 1.0f , 10.0f};
        System.out.println(indice_max(tab));
    }
}
