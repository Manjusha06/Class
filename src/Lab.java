import java.util.*;
public class Lab {
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter L1 capacity");
        int x=SC.nextInt();
        System.out.println("Enter L2 capacity");
        int y=SC.nextInt();
        System.out.println("Enter L3 Capacity");
        int z=SC.nextInt();
        System.out.println("Enter no of students");
        int n=SC.nextInt();
        int m1=x-n;
        int m2=y-n;
        int m3=z-n;
        if(m1<m2 && m1<m3)
        {
            System.out.println("L3");
        }
        else if(m2<m1 && m2<m3)
        {
            System.out.println("L2");
        }
        else if(m3<m1 && m3<m2)
        {
            System.out.println("L1");
        }
        else {
            System.out.println("No suitable lab");
        }




    }
}
