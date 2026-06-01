package day3;

public class challengeProgram {

    int maths;
    int science;
    int english;
    int history;
    int computer;

    void setMarks(int m, int s, int e, int h, int c) {
        maths = m;
        science = s;
        english = e;
        history = h;
        computer = c;
    }

    int totalMarks() {
        return maths + science + english + history + computer;
    }

    double averageMarks() {
        return totalMarks() / 5.0;
    }

    double percentage() {
        return (totalMarks() * 100.0) / 500;
    }

    void displayResults() {
        System.out.println("Maths = " + maths);
        System.out.println("Science = " + science);
        System.out.println("English = " + english);
        System.out.println("History = " + history);
        System.out.println("Computer = " + computer);

        System.out.println("Total Marks = " + totalMarks());
        System.out.println("Average Marks = " + averageMarks());
        System.out.println("Percentage = " + percentage());
    }

    public static void main(String[] args) {

        challengeProgram student1 = new challengeProgram();// creating student object 1 
        challengeProgram student2 = new challengeProgram();// creating student object 2

        student1.setMarks(80, 70, 85, 50, 90); // setting marks using method setMarks
        student2.setMarks(95, 88, 92, 80, 85);// setting marks using method setMarks

        System.out.println("===== Student 1 =====");
        student1.displayResults();

        System.out.println();

        System.out.println("===== Student 2 =====");
        student2.displayResults();
    }
}