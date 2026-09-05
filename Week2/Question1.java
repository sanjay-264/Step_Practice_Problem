import java.util.*;

class Question1
{
    static void countVowelsAndConsonants(String text)
    {
        int v=0,c=0;

        for(int i=0;i<text.length();i++)
        {
            char ch=Character.toLowerCase(text.charAt(i));

            if("aeiou".indexOf(ch)>=0)
                v++;
            else if(ch!=' ')
                c++;
        }

        System.out.println("Vowels: "+v+" | Consonants: "+c);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        countVowelsAndConsonants(sc.nextLine());
    }
}