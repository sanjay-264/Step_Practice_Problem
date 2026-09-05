import java.util.*;

class Question2
{
    static void parseStudentRecord(String s)
    {
        String[] a=s.split(",");

        if(a.length!=3)
            System.out.println("Invalid Record");
        else
            System.out.println("Name: "+a[0]+" | Roll No: "+a[1]+" | Dept: "+a[2]);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        parseStudentRecord(sc.nextLine());
    }
}