package diamond;

public class DiamondWithName {

    public static void draw(Integer n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("Bill");
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");

            for (int j = 2 * (n - 1) - 1; j >= 2 * i - 1; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
