import java.util.*;

public class PatternQ16 {
    public static void main(String[] args) {

//                                 *       *       *       *       *
//                         *       *       *       *
//                 *       *       *
//         *       *
// *
//         *       *
//                 *       *       *
//                         *       *       *       *
//                                 *       *       *       *       *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
            st--;
        }
        int sp1 =1 ;
        int st1 = 2;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= sp1; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            sp1++;
            st1++;
        }
    }
}