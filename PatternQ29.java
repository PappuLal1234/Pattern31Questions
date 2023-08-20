import java.util.*;

public class PatternQ29 {
//                                 1
//                         2       0       2
//                 3       0       0       0       3
//         4       0       0       0       0       0       4
// 5       0       0       0       0       0       0       0       5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
         for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("\t"); 
            }
            
            System.out.print(i + "\t");
            
            for (int k = 1; k <= (i - 1) * 2 - 1; k++) {
                System.out.print("0\t");
            }
            
            if (i > 1) {
                System.out.print(i + "\t");
            }
            
            System.out.println(); 
        }

    }
}