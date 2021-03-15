package Patterns;
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Pyramid");
        for(int row=1;row<=n;row++)
        {
            for(int space=1;space<=n-row;space++)
                System.out.print(" ");
            for(int col=1;col<=2*row-1;col++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("\nReverse Pyramid");
        for(int row=n;row>=1;row--)
        {
            for(int space=1;space<=n-row;space++)
                System.out.print(" ");
            for(int col=1;col<=2*row-1;col++)
                System.out.print("*");
            System.out.println();
        }
    }
}
