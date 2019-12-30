import java.util.*;
import java.io.*;

class javaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double temp = 0;
            for(int i = 0; i < n; i++) {
                if(i == 0){
                    temp += a;
                }
                temp = temp + Math.pow(2, i)*b;
                int result = (int)temp;
                System.out.print(result + " ");
            }
        }
        in.close();
    }
}

