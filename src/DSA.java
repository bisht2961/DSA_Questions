import java.io.PrintWriter;
import java.util.Scanner;

public class DSA {

    public static void reverse_array(int n,int[]ar){
        int l = 0, r = n-1;
        while (l <= r ){
            int tmp = ar[l];
            ar[l] = ar[r];
            ar[r] = tmp;
            l++;
            r--;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        reverse_array(n, ar);
        for(int i=0;i<n;i++){
            out.print(ar[i]+" ");
        }
        out.flush();
        out.close();
    }
}
