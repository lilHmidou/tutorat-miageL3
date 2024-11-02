public class EXO_moyennesParGroupe {

    public static void moyennesParGroupe(double[] notes, int[] nbEtu) {
        int somme = 0;
        for (int etu : nbEtu) {
            somme += etu;
        }
        if (somme == notes.length) {
            
            int index = 0;
            double somme2 = 0; // somme qui parcourt notes
            double moyenne = 0;
            int somme3 = nbEtu[index] - 1; //somme qui parcourt nbEtu 
            double[] moyennes = new double[nbEtu.length]; 
            
            for (int i = 0; i < notes.length; i++) {
                somme2 += notes[i];

                if (i == somme3) {
                    moyenne = somme2 / nbEtu[index];
                    moyennes[index++] = moyenne;
                    somme2 = 0;
                    if (index == 3) {
                        break;
                    }
                    somme3 += nbEtu[index];
                }
            }
            System.out.println(java.util.Arrays.toString(moyennes));
        }
    }

    public static void main(String[] args) {
        double[] notes = { 11, 9, 10, 15, 16, 2, 3, 4 };
        int[] nbEtu = { 3, 2, 3 };
        EXO_moyennesParGroupe.moyennesParGroupe(notes,nbEtu);
    }
    
}
