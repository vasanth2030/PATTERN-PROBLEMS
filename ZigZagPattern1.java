package Patterns;
import java.util.Scanner;
public class ZigZagPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int val=1;
        for(int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++)
            {
                if(row%2==0)
                    System.out.printf("%2d ",--val);
                else
                    System.out.printf("%2d ",val++);
            }
            val=val+n;
            System.out.println();
        }
    }
}
