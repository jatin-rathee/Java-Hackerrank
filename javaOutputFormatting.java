import java.util.Scanner;

public class javaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String x1 = String.format("%03d",x);
                System.out.printf("%-15s %s", s1, x1);
            }
            System.out.println("================================");

    }
}