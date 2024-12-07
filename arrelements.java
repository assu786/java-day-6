import java.util.*;
class R
{
    public static void main(String args[])
    {
        //intialization of an array
        int arr[]={34,65,78,35,86};
        System.out.println(Arrays.toString(arr));
        //accessing of array elements
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //modifications of array
        arr[2]=445;
        arr[3]=65;
        System.out.println(Arrays.toString(arr));
    }
}