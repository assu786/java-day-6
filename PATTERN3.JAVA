import java.util.*;
class Wo
{
    public static void main(String args[])
    {
        Scanner n=new Scanner (System.in);
        int a=n.nextInt();
        for(int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
            {
                if(i==0||j==0||i+j==a-1)
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