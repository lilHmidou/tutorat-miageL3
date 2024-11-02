import java.util.Scanner;

public class EXO_maxMoyenneTroisConsécutifs {

    public static double maxMoyenneTroisConsécutifs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une valeur : ");
        int a = sc.nextInt();
        System.out.print("Entrez une valeur : ");
        int b = sc.nextInt();
        System.out.print("Entrez une valeur : ");
        int c = sc.nextInt();
        
        double somme = 0;
        double sommeMax=a+b+c;

        while(c>=0){
            System.out.print("Entrez une valeur : ");
            int x = sc.nextInt();
            somme=b+c+x;
            if(somme>sommeMax){
                sommeMax=somme;
            }
            b=c;
            c=x;
        }
        return sommeMax/3;

    
    }

    public static void main(String[] args) {
        System.out.println(EXO_maxMoyenneTroisConsécutifs.maxMoyenneTroisConsécutifs());
    }

    
    
}
