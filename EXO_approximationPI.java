public class EXO_approximationPI {

    public static double approximationPI(int n){
        double a =-1;
        double c =3;
        double b =0;
        double somme = 1;
        for(int i =1 ;i<n;i++){
            b=2*i+1;
            double terme = a/(b*c);
            somme+=terme;
            a*=-1;
            c*=3;
        }
        double pi = Math.sqrt(12)*somme;
        return pi;
    }

    public static void main(String[] args) {
        System.out.println(EXO_approximationPI.approximationPI(1000));
    }
    
}
