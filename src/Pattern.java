import java.util.*;
public class Pattern {
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        int n=SC.nextInt();
        int a=SC.nextInt();
        int b=SC.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(a+" ");
            }
            for(int k=4;k>i;k--)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
