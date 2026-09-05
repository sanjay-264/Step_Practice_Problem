import java.util.*;

class Question1
{
    static String playRound(String p, String c)
    {
        if(p.equals(c)) return "Draw";
        if((p.equals("Rock")&&c.equals("Scissors")) ||
           (p.equals("Paper")&&c.equals("Rock")) ||
           (p.equals("Scissors")&&c.equals("Paper")))
            return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] m={"Rock","Paper","Scissors"};
        int w=0,l=0,d=0;

        for(int i=1;i<=5;i++)
        {
            System.out.print("Enter move: ");
            String p=sc.next();
            String c=m[(int)(Math.random()*3)];
            String r=playRound(p,c);

            if(r.equals("Player Wins")) w++;
            else if(r.equals("Computer Wins")) l++;
            else d++;

            System.out.println("Round "+i+": "+p+" | "+c+" | "+r);
        }

        System.out.println("Wins: "+w+" Losses: "+l+" Draws: "+d);
        System.out.println("Win %: "+(w*100.0/5));
    }
}