import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DSA_given_pair_sum {

    static  PrintWriter out;
    public static void findPair(int[] A, int sum){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++){

            if (map.containsKey(sum - A[i])){
                System.out.printf("Pair found (%d, %d)", A[map.get(sum - A[i])], A[i]);
                return;
            }
            map.put(A[i], i);
        }
        out.println("Pair not found");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        int n = sc.nextInt(),sum = sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        findPair(ar,sum);
        out.flush();
        out.close();
    }
}
