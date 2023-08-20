import java.util.*;
public class PatternQ10 {
    // * * * * * * *
    //   * * * * *
    //     * * *
    //       *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 2 * n - 1;
        for (int i = n; i >= 1; i--) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            st -= 2;
            System.out.println();
        }
    }
}