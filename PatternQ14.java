import java.util.*;
public class PatternQ14 {
    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * * 
    //   * * * * 
    //     * * *
    //       * *
    //         * 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sp = n - 1;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
        int sp1 = 1;
        int st1 = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp1; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st1; k++) {
                System.out.print("*\t");
            }
            sp1++;
            st1--;
            System.out.println();
        }
    }
}