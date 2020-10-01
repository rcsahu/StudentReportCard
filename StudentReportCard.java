import java.util.Scanner;

class StudentReportCard
{
    static Scanner sc = new Scanner(System.in);
    static StudentReportCard src = new  StudentReportCard();
    public static void main(String[] args)
    {
        System.out.print("Enter name of the Student : ");
        String stdName = sc.nextLine();
        System.out.print("Enter Number of Subjects  : ");
        int noOfSubjects = sc.nextInt();
        int marks[] = new int[noOfSubjects]; // array creation for storing marks
        src.dataEntry(marks);
        src.reportPrinting(stdName,marks);
    
    }//end of main method
    void dataEntry(int[] marks)
    {
    for (int i =0 ; i < marks.length ; i++)
    {
     System.out.print("Please enter mark obtained in subject-"+ (i+1) + ": ");
     marks[i]=sc.nextInt();
    }
    }//end of dataEntry
    void reportPrinting(String stdName, int[] marks)
    {
        
        System.out.println("\t  Report Card");
        
        System.out.println("Name : \t "+stdName);
       
        System.out.println("Subject \t  Marks");
        System.out.println("----------------------------");
        int total=0;
         for (int i =0 ; i < marks.length ; i++)
         {
             System.out.printf("subject-%d \t  %d\n", (i+1), marks[i]);
             total += marks[i];
         }
        System.out.println("----------------------------");
        float avg = ((float)total / (marks.length));
        System.out.printf("Total :%d Average : %.2f\n",total,avg);
        System.out.println("----------------------------");
    }//end of reportPrinting
} // end of StudentReportCard Class
