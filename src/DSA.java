import java.io.*;
import java.util.*;
import java.lang.*;

public class DSA {

    static public ArrayList<int[]> find_pair_with_given_Sum(int[]ar,int sum){
        int n = ar.length;
        Map<Integer,Integer>map = new HashMap<>();
        ArrayList<int[]>ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if( map.containsKey(sum - ar[i]) ){
                ans.add(new int[]{ar[i],sum-ar[i]});
            }
            map.put(ar[i],i);
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt(),sum = sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        ArrayList<int[]>pairs = find_pair_with_given_Sum(ar,sum);
        for(int[]pair:pairs)
            out.println(pair[0]+" "+pair[1]);

        out.flush();
        out.close();
    }
}
