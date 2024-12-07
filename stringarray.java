import java.util.*;
class G
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        String arr[]=new String[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s.next();

        } 
        for(int i=0;i<a;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}