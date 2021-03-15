package Patterns;
import java.util.Scanner;
public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int val=0;
        for(int row=1;row<=n;row++)
        {
            for(int space=1;space<=n-row;space++)
                System.out.print(" ");
            for(int col=1;col<=2*row-1;col++)
            {
                if(col<=row)
                    System.out.print(++val);
                else
                    System.out.print(--val);
            }
            val=0;
            System.out.println();
        }
    }
}
