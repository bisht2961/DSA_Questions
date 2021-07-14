import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DSA_reverse_array {

    public static int[] ReverseArray(int[]ar,int n){
        int l =0, r = n-1;
        while (l <= r){
            int temp = ar[l];
            ar[l] = ar[r];
            ar[r] = temp;
            l++;r--;
        }
        return ar;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        ar = ReverseArray(ar,n);
        for(int i:ar)
            out.print(i+" ");
        out.flush();
        out.close();
    }
}
