The below program has an enum class with Student which has marks of different students. Define a constructor and get the marks of each student in the following way.

Total Marks: 
Radha got 90 marks.
Seetha got 62 marks.
Ram got 50 marks.



package q24202;
enum Student {
  Radha(90),Seetha(62),Ram(50);
  private int total;  
     //write your code here
     //define a constructor Student and get total marks
     int marks;
     int getMarks(){
     	return marks;
     }
     Student (int marks){
     	this.marks=marks;
     }
     
}
public class Main {
   public static void main(String args[]){
      System.out.println("Total Marks: ");
      
      // write your code here
      Student S;
      
      System.out.println("Radha got " +Student.Radha.getMarks()+ " marks.");
      
      System.out.println("Seetha got " +Student.Seetha.getMarks()+ " marks.");
      
      System.out.println("Ram got " +Student.Ram.getMarks()+ " marks.");
      
      
   }
}