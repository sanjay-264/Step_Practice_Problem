class Question4
{
    static double rowAverage(int[] row)
    {
        int sum=0;

        for(int n:row)
            sum+=n;

        return (double)sum/row.length;
    }

    static String classifyRows(int[][] a,int t)
    {
        String s="";

        for(int i=0;i<a.length;i++)
            s+="Row "+i+": "+(rowAverage(a[i])<t?"Quiet Zone":"Buzzing Zone")+" | ";

        return s.substring(0,s.length()-3);
    }

    public static void main(String[] args)
    {
        int[][] a={{40,50,45},{85,90,95},{30,20,25}};
        System.out.println(classifyRows(a,60));
    }
}