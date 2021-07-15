import java.io.PrintWriter;
import java.util.*;

public class DSA_Zero_SubArray_Sum {
    static PrintWriter out;

    public static boolean ZeroSubArraySum(int n, int[]ar){
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += ar[i];
            if(set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        if( ZeroSubArraySum(n,ar)){
            out.println("Sub Array Exists");
        }else{
            out.println("Sub Array Does Not Exists");
        }
        out.flush();
        out.close();
    }
}
