import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner n=new Scanner (System.in);
        int a=n.nextInt();
        for(int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
            {
                if(j==0||j==a-1||(i+j)==a-1||i==j||i==a/2)
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