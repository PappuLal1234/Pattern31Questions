import java.util.*;

//                                                                         0
//                                                                 8       0       8
//                                                         7       8       0       8       7
//                                                 6       7       8       0       8       7       6
//                                         5       6       7       8       0       8       7       6       5
//                                 4       5       6       7       8       0       8       7       6       5       4       
//                         3       4       5       6       7       8       0       8       7       6       5       4      3
//                 2       3       4       5       6       7       8       0       8       7       6       5       4      2
//         1       2       3       4       5       6       7       8       0       8       7       6       5       4      1
 public class PatternQ33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j + "\t");
            }
            System.out.print(0 + "\t");
            for (int j = n - 1; j >= i; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();

        }
    }
}
