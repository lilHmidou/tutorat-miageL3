public class Tableaux {

    public static boolean tableauxEgaux(int[] tab1, int[] tab2) {
        if (tab1.length == tab2.length) {
            for (int i = 0; i < tab1.length; i++) {
                if (tab1[i] != tab2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean tableauPrefixe(int[] tab1, int[] tab2) {
        if (tab1.length >= tab2.length) {
            for (int i = 0; i < tab2.length; i++) {
                if (tab1[i] != tab2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean palyndrome(int[] tab) {
        for (int i = 0, j = tab.length - 1; i < j; i++, j--) {
            if (tab[i] != tab[j]) {
                return false;
            }
        }
        return true;
    }

    public static int indiceMin(int[] tab) {
        int min = tab[0];
        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) { // ou tab[i]<=min
                index = i;
            }
        }
        return index;
    }

    public static int indiceMinGauche(int[] tab) {
        int min = tab[0];
        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                index = i;
            }
        }
        return index;
    }

    public static int indiceMinDroite(int[] tab) {
        int min = tab[0];
        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] <= min) {
                index = i;
            }
        }
        return index;
    }

    public static int indiceMax(int[] tab) {
        int indiceMax = 0;
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                indiceMax = i;
            }
        }
        return indiceMax;
    }

    public static int indiceDroite(int[] tab, int valeur) {
        int indice = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                indice = i;
            }
        }
        return indice;
    }

    public static int indiceGauche(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static int occurrenceN(int[] tab, int valeur, int n) {
        int occurrence = 0;
        int indice = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                occurrence++;
                if (occurrence == n) {
                    indice = i;
                }
            }
        }

        if (n > occurrence) {
            return -1;
        }

        return indice;
    }

    public static int nbOccurrences(int[] tab, int v) {
        int occurrence = 0;
        for (int val : tab) {
            if (val == v) {
                occurrence++;
            }
        }
        return occurrence;
    }

    public static double somme(double[] tab) {
        double somme = 0.0;
        for (double val : tab) {
            somme += val;
        }
        return somme;
    }

    public static double moyenne(double[] tab) {
        double somme = 0.0;
        for (double v : tab) {
            somme += v;
        }
        // double somme2 = somme(tab); // on appelle la fonction somme juste en
        // au-dessus
        double moyenne = somme / tab.length;
        return moyenne;
    }

    public static double moyennePonderee(double[] tab, double[] poids) {
        double somme = 0.0;
        if (tab.length == poids.length) {
            for (int i = 0; i < tab.length; i++) {
                somme += tab[i] * poids[i];
            }
        }
        return somme / tab.length;
    }

    public static void premiers(int n) {
        int[] tab = new int[n];
        int index = 0;
        for (int x = 2; x < Integer.MAX_VALUE; x++) {
            boolean nombrePremier = true;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    nombrePremier = false;
                    break;
                }
            }
            if (nombrePremier) {
                tab[index++] = x;
            }
            if (index == n) {
                break;
            }
        }
        /*
         * for (int i = 0; i < n; i++) {
         * System.out.print(tab[i] + " ");
         * }
         */
        // System.out.println();
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void inverse(int[] tab) {
        for (int i = 0, j = tab.length - 1; i < j; i++, j--) {
            int aux = tab[i];
            tab[i] = tab[j];
            tab[j] = aux;
        }
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void inserVal(int[] tab, int valeur, int position) {
        for (int i = tab.length - 1; i >= position; i--) {
            tab[i] = tab[i - 1];
        }
        tab[position - 1] = valeur;
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void fibonnacci(int n) {
        int[] tab = new int[n];
        tab[0] = 1;
        if (n >= 2) {
            tab[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void eratosthene(int n) {
        boolean[] tab = new boolean[n];
        for (int i = 2; i < tab.length; i++) {
            boolean nombrePremier = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    nombrePremier = false;
                    break;
                }
            }
            if (nombrePremier) {
                tab[i] = true;
            }
        }
        System.out.println(java.util.Arrays.toString(tab));
    }

    public static void tableauInverse(int[] tab) {
        int[] tab2 = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[tab.length - 1 - i];
        }
        System.out.println(java.util.Arrays.toString(tab2));
    }

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

        int[] tab = { 0, 2, 5, 6, 2, 2 };

        int[] tab2 = { 1, 2, 2, 1 };

        int[] tab3 = { 1, 2, 3, 4, 5 };

        double[] notes = { 11, 9, 10, 15, 16, 2, 3, 4 };
        int[] nbEtu = { 3, 2, 3 };

        double[] notes2 = {11.0, 15.0, 9.0, 3.0, 10.0, 16.0, 2.0, 4.0};
        int [] groupes =  {   0,    1,   0,   2,    0,    1,   2,   2};

        // System.out.println(Tableaux.occurrenceN(tab, 2, 1));
        // System.out.println(Tableaux.palyndrome(tab));
        // System.out.println(Tableaux.indiceGauche(tab,22));
        // System.out.println(Tableaux.nbOccurrences(tab, 2));
        // Tableaux.premiers(30);

        // Tableaux.inverse(tab3);

        // Tableaux.inserVal(tab3, 8, 3);

        // Tableaux.fibonnacci(1);

        // Tableaux.eratosthene(10);

        // Tableaux.tableauInverse(tab3);

        //Tableaux.moyennesParGroupe(notes, nbEtu);

        Tableaux.moyennesParGroupe2(notes2, groupes, 3);

    }
}