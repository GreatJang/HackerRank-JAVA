import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            String answer = "";
            
            for(int j=0; j<n; j++){
                int s = (int)(Math.pow(2, j)*b);
                sum += s;
                answer += String.valueOf(sum) + " ";
            }
            System.out.println(answer);
        }
        in.close();
        
    }
}
