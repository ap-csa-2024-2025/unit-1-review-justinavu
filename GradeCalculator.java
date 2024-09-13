public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = "AP Chemistry";
      System.out.println("Course Name: " + courseName);
    int avgTime = 60;
      System.out.println("Average time spent in a week for this course(mins): " + avgTime);

    int hw1 = 75;
    int hw2 = 99;
    int hw3 = 90;
    int hw4 = 100;
    System.out.println("Homework scores: " + hw1 + "," + hw2 + "," + hw3 + "," + hw4);

    double quiz1 = 89.2;
    double quiz2 = 98.1;
    System.out.println("Quiz scores: " + quiz1 + "," + quiz2); 

    double Final = 87.58; 
    System.out.println("Final Exam score: " + Final);

    System.out.println("Weekly time spent: " + (135/60) +"hrs" + (135%60) + "mins");
    System.out.println("Average HW grade: " + ((double) (hw1 + hw2 + hw3 + hw4))/4);
    System.out.println("Average quiz grade: " + (quiz1 + quiz2)/2);

    double finalGrade = (((double) (hw1 + hw2 + hw3 + hw4))/4*(35.0/100)) + ((quiz1 + quiz2)/2*(15.0/100)) + 
    (Final*(50.0/100)); 
    System.out.println("Final grade: " + finalGrade);


  }
}
