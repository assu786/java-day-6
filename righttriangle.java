import java.util.*;
class Bo
{
    public static void main(String args[])
    {
        Scanner n=new Scanner (System.in);
        int a=n.nextInt();
        for(int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
            {
                if(i==a-1||j==0||i==j)
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