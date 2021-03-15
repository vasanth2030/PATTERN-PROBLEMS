package Patterns;
import java.util.Scanner;
public class BorderPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(row==1)
                    System.out.printf("%c\t",col+96);
                else if(col==1)
                    System.out.printf("%c",row+96);
                else if(row==n)
                    System.out.printf("\t%c",row+97-col);
                else if(col==n)
                    System.out.printf("%c",col+97-row);
                else
                    System.out.print("   \t");
            }
            System.out.println();
        }
    }
}
