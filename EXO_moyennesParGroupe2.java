public class EXO_moyennesParGroupe2 {

    public static void moyennesParGroupe2(double[] notes, int[] groupes, int nbGroupe){
        double[] moyennes = new double [nbGroupe];
        for(int j = 0;j<nbGroupe;j++){
            double somme = 0;
            int occurrence = 0;
            for(int i=0;i<notes.length;i++){
                if(groupes[i]==j){
                    somme+=notes[i];
                    occurrence++;
                }
            }
            double moyenne = somme / occurrence;
            moyennes[j]=moyenne;
        }
        System.out.println(java.util.Arrays.toString(moyennes));
    }

    public static void main(String[] args) {
        double[] notes2 = {11.0, 15.0, 9.0, 3.0, 10.0, 16.0, 2.0, 4.0};
        int [] groupes =  {   0,    1,   0,   2,    0,    1,   2,   2};
        EXO_moyennesParGroupe2.moyennesParGroupe2(notes2, groupes, 3);
    }
    
    
}
