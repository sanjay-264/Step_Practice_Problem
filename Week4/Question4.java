import java.util.*;

class Question4
{
    static int[] mergeSortedArrays(int[] a,int[] b)
    {
        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(i<a.length&&j<b.length)
            c[k++]=a[i]<b[j]?a[i++]:b[j++];

        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];

        return c;
    }

    public static void main(String[] args)
    {
        int[] a={1,3,5},b={2,4,6};
        System.out.println(Arrays.toString(mergeSortedArrays(a,b)));
    }
}