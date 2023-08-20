import java.util.*;

public class PatternQ27 {
    //       1
    //     1 2 1
    //   1 2 3 2 1
    // 1 2 3 4 3 2 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n;
        int num = 1;

        for(int i = 1;i<=n;i++)
        {
            int numPrint = 1;
            for(int j = 1;j<nsp;j++)
            {
                System.out.print("\t");
            }
            for(int j = 1;j<=num;j++)
            {
                System.out.print( numPrint+ "\t");
                if(j<=num/2) {
                    numPrint++;
                }
                else
                {
                    numPrint--;
                }
            }
            System.out.println();
            num+=2;
            nsp--;

        }
    }
}