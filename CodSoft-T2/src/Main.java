import java.util.*;
class Main{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        Stu_Marks S1 = new Stu_Marks(5);

        System.out.println("\n***********CodSoft Task 2***********");
        System.out.println("\nStudent Grade Calculator\n");

        S1.MarksInput();
        S1.DisplayResult();
    }
}
