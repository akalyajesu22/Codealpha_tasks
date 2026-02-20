import java.util.*;
class Student{

    String name;
    int marks;
    String grade;

       Student(String name,int marks)
       {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
       
       calculateGrade(marks);
       }
private String calculateGrade(int marks)
{
    if(marks >= 90)
       return "A";
    else if(marks >= 75)
       return "B";
    else if(marks >= 50)
     return "C";
     else
       return "Fail";
}
}
public class StudentGradeTracker{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("\nStudent" + (i+1));
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            int marks;
            while(true)
            {
                System.out.print("Enter marks (0-100) : ");
                marks = sc.nextInt();

                if(marks >= 0 && marks <= 100)
                break;

                else
                    System.out.println("Invalid marks! please enter between 0 and 100");
            }
            sc.nextLine();
            students.add(new Student(name,marks));
        }
        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for(Student s : students)
        {
            total += s.marks;
            if(s.marks > highest)
            highest = s.marks;
            if(s.marks < lowest)
            lowest = s.marks;
        }
        double average = (double) total / n;

        System.out.println("\n=========Student Report ===========");
        for(Student s : students)
        {
            System.out.println("Name : " + s.name + 
                                                        " | Marks : " + s.marks
                                            +           " | Grade : " + s.grade);            
         }
         System.out.println("\n------------------");
         System.out.println("Average marks : " + average);
         System.out.println("Highest marks : " + highest);
         System.out.println("Lowest marks  : " + lowest);
         System.out.println("====================");
         sc.close();
    }

}
            
        
    

       

