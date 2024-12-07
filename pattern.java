import java.util.*;
class Zoo
{
    public static void main(String args[])
    {
        Scanner n=new Scanner (System.in);
        int a=n.nextInt();
        for(int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
            {
                if(i==a-1||i==0||j==a/2)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
                 
            }
            System.out.println();
        }
    }
}