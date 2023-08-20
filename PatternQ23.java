import java.util.*;
public class PatternQ23 {
    //     1
    //   1 1 1
    // 1 1 1 1 1
   //1 1 1 1 1  1
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >=i; j--) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("1\t");
            }
            st+=2;
            System.out.println();
        }
    }
}
