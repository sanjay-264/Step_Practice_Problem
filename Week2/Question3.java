import java.util.*;

class Question3
{
    static String validateFileExtension(String filename)
    {
        int i=filename.lastIndexOf('.');

        if(i==-1)
            return "Rejected - invalid file type";

        String e=filename.substring(i+1);

        if(e.equalsIgnoreCase("pdf") ||
           e.equalsIgnoreCase("docx") ||
           e.equalsIgnoreCase("zip"))
            return "Accepted";

        return "Rejected - invalid file type";
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(validateFileExtension(sc.nextLine()));
    }
}