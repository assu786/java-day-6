import java.util.*;
class Ko
{
    public static void main(String args[])
    {
        Scanner n=new Scanner (System.in);
        int a=n.nextInt();
        for(int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
            {
                if(j==0||j==a-1||(i+j)==a-1||i==j)
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