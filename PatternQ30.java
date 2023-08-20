import java.util.*;
public class PatternQ30 {
    // 5       4       3       2       1
    // 5       4       3       2       1
    // 5       4       3       2       1
    // 5       4       3       2       1
    // 5       4       3       2       1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                    System.out.print(j + "\t");
            }
         System.out.println();
        }
        System.out.println();
    }
}

