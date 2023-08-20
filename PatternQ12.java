import java.util.*;

public class PatternQ12 {
//                                 *
//                         *       !       *
//                 *       !       *       !       *
//         *       !       *       !       *       !       *
// *       !       *       !       *       !       *       !       *
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print("\t");
            }

            // Print asterisks and exclamation marks
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
                if (j < i) {
                    System.out.print("!\t");
                }
            }

            // Print a new line
            System.out.println();
        }

    }
}