import java.util.*;
public class PatternQ24 {
    //       1
    //     2 2 2
    //   3 3 3 3 3
    // 4 4 4 4 4 4 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int print = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(print + "\t");
            }
            print += 1;

            st += 2;
            System.out.println();
        }
    }
}