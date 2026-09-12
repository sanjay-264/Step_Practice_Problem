public class Question1 {    
    static class PlacementRecord{
        String studentName,company;
        double packageLpa;

        PlacementRecord(String n,String c,double p) {
            studentName=n;
            company=c;
            packageLpa=p;
        }

        void diaplay() {
            System.out.println(studentName+" -> "+company+" @ "+packageLpa+" LPA");
        }
    }
    public static void main(String[] args) {
        PlacementRecord record1 =  new PlacementRecord("Ravi","TCS",4.5);
        PlacementRecord record2 =  new PlacementRecord("Anitha","Zoho",6.2);
        PlacementRecord record3 =  new PlacementRecord("Karthik","Infosys",4.0);
        record1.diaplay();
        record2.diaplay();
        record3.diaplay();
    }
}