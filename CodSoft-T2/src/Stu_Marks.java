import java.util.*;

public class Stu_Marks {

    Scanner scan = new Scanner(System.in);
    //create a float array but only declare it,initialize later
   protected float[] SubjectMarks;

    //initialize in constructor so when instance is created it creates array
    Stu_Marks(int n) {
        this.SubjectMarks = new float[n];
    }

    //method to get input for subjects
    void MarksInput() {
        for (int i = 0; i < SubjectMarks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            SubjectMarks[i] = scan.nextInt();
        }
    }

    //Method to calc marks of user Input.
//used IDE recommended for each loop
    float CalcMarks() {
        float totalmarks = 0;
        for (int i = 0; i < SubjectMarks.length; i++) {
            totalmarks += SubjectMarks[i];
        }
        return totalmarks;
    }

    float CalcAvgPercentage() {
        float totalMarks = CalcMarks();
        return (float) totalMarks / (SubjectMarks.length * 100) * 100;
    }

    public char calculateGrade() {
//take the avg input and use switch case to print a grade accordingly
        double avg = CalcAvgPercentage();
        char grade;
        grade = switch ((int) avg / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
        return grade;
    }

    public void DisplayResult() {
        float totalMarks = CalcMarks();
        double Percentage = CalcAvgPercentage();
        char grade = calculateGrade();
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("\nAverage Percentage: %.2f", Percentage);
        System.out.println("\n Your Grade is: " + grade);
    }
}
