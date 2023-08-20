import java.util.*;
public class PatternQ31 {
// 5       4       3       2       *
// 5       4       3       *       1
// 5       4       *       2       1
// 5       *       3       2       1
// *       4       3       2       1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i==j)
                    System.out.print("*\t");
                else
                    System.out.print(j + "\t");
            }
         System.out.println();
        }
        System.out.println();
    }
}
