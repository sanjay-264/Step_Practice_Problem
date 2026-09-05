class Question3
{
    static String getBmiStatus(double b)
    {
        if(b<18.5) return "Underweight";
        if(b<25) return "Normal";
        if(b<30) return "Overweight";
        return "Obese";
    }

    static void printWellnessReport(double[] h,double[] w)
    {
        for(int i=0;i<h.length;i++)
        {
            double b=w[i]/(h[i]*h[i]);
            System.out.printf("%d %.2f %.2f %.2f %s\n",
                    i+1,h[i],w[i],b,getBmiStatus(b));
        }
    }

    public static void main(String[] args)
    {
        double[] h={1.75,1.60,1.68,1.72,1.80};
        double[] w={70,90,60,80,85};
        printWellnessReport(h,w);
    }
}