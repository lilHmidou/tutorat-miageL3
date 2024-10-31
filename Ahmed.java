public class Ahmed {

    public static void tableMult() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void carrePlein(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void contourCarre(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ahmed.tableMult();
        System.out.println();
        Ahmed.carrePlein(7);
        System.out.println();
        Ahmed.contourCarre(7);
    }
}