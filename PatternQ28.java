import java.util.*;

public class PatternQ28 {
//                                 1
//                         2       1       2
//                 3       2       1       2       3
//         4       3       2       1       2       3       4
// 5       4       3       2       1       2       3       4       5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("\t");
            }
            
            for (int k = i; k <= i * 2 - 1; k++) {
                System.out.print(k + "\t");
            }
            
            for (int l = i * 2 - 2; l >= i; l--) {
                System.out.print(l + "\t");
            }
            
            System.out.println(); 
        }
    }
}