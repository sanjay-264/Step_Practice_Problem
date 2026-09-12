public class Question3 {    
    static class Course{
        int credits, labcredits;
        String title, code;

        Course(String Code, String Title, int Credits, int LabCredits) {
            code = Code;
            title = Title;
            credits = Credits;
            labcredits = LabCredits;
        }

        Course(String code, String title, int credits) {
            this.code = code;
            this.title = title;
            this.credits = credits;
            labcredits = 0;
        }

        void Totalcredits() {
            int total = credits + labcredits;
            System.out.println("Total credits: " + total);
        }
    }

    public static void main(String[] args) {
        Course obj1 = new Course("21CSC205L", "DSA Lab", 3, 1);
        obj1.Totalcredits();
        Course obj2 = new Course("21CSC201J", "Data Structures", 4);
        obj2.Totalcredits();

    }
}