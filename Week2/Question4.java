import java.util.*;

class Question4
{
    static String maskPhoneNumber(String phone)
    {
        if(phone.length()!=10)
            return "Invalid phone number";

        for(int i=0;i<10;i++)
            if(!Character.isDigit(phone.charAt(i)))
                return "Invalid phone number";

        StringBuilder s=new StringBuilder("XXXXXX"+phone.substring(6));
        s.insert(6,"-");

        return s.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(maskPhoneNumber(sc.nextLine()));
    }
}