import java.util.*;

class Question5
{
    static int[] rotateArray(int[] a,int k)
    {
        k=k%a.length;
        int[] b=new int[a.length];

        for(int i=0;i<a.length;i++)
            b[(i+k)%a.length]=a[i];

        return b;
    }

    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateArray(a,3)));
    }
}