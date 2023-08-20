import java.util.*;
public class PatternQ25 {
    //          1
    //       2  3  4
    //    5  6  7  8  9
    //10 11 12  13 14 15 16
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
                print++;
            }

            st += 2;
            System.out.println();
        }
    }
}