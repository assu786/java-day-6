import java.util.*;
class T
{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int arr[]=new int[a];
        int s=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=n.nextInt();
            s+=arr[i];
        }
        int res=((a+1)*(a+2))/2;
        System.out.println(res-s);
    }
}