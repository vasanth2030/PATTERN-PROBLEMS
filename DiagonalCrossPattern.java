package Patterns;
import java.util.Scanner;
public class DiagonalCrossPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char c='a';
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(col==row || row+col==n+1)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            c++;
            System.out.println();
        }
    }
}
