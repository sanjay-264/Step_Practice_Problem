class Question2
{
    static String findDuplicateTeam(String[] a)
    {
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i].equals(a[j]))
                    return "Duplicate Found: "+a[i];

        return "No Duplicates Found";
    }

    public static void main(String[] args)
    {
        String[] a={"ByteForce","CodeCrafters","ByteForce"};
        System.out.println(findDuplicateTeam(a));
    }
}