class Question2
{
    static int maxProfit(int[] a)
    {
        int min=a[0],profit=0;

        for(int i=1;i<a.length;i++)
        {
            min=Math.min(min,a[i]);
            profit=Math.max(profit,a[i]-min);
        }

        return profit;
    }

    public static void main(String[] args)
    {
        int[] a={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
}