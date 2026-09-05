import java.util.*;

class Question4
{
    static char findFirstNonRepeatingChar(String s)
    {
        int[] a=new int[256];

        for(char c:s.toCharArray()) a[c]++;

        for(char c:s.toCharArray())
            if(a[c]==1) return c;

        return '\0';
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=findFirstNonRepeatingChar(sc.nextLine());

        if(c=='\0')
            System.out.println("No Non-Repeating Character Found");
        else
            System.out.println("First Non-Repeating Character: '"+c+"'");
    }
}