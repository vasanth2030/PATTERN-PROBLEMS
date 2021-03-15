package Patterns;
import java.util.Scanner;
public class SandClockPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=n;row>=1;row--)
        {
            for(int space=1;space<=n-row;space++)
                System.out.print(" ");
            for(int col=1;col<=2*row-1;col++)
                System.out.print(row);
            System.out.println();
        }
        for(int row=2;row<=n;row++)
        {
            for(int space=1;space<=n-row;space++)
                System.out.print(" ");
            for(int col=1;col<=2*row-1;col++)
                System.out.print(row);
            System.out.println();
        }
    }
}
