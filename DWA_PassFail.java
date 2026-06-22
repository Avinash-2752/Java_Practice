import java.util.Scanner;
public class DWA_PassFail{
  public static void main(String []args){
  
System.out.println("Enter your sub1 marks");
Scanner sc = new Scanner(System.in);
int sub1 = sc.nextInt();
System.out.println("Enter your sub2 marks");
int sub2 = sc.nextInt();
System.out.println("Enter your sub3 marks");
int sub3 = sc.nextInt();
int avgMarks =(sub1+sub2+sub3)/3;
System.out.println("Your average marks is:" + avgMarks);
if(avgMarks>40 && sub1>33 && sub2>33 && sub3>33){
    System.out.println("Congratulations! You have passed the exam.");
}
else{
    System.out.println("Sorry! You have failed the exam.");     
}
}
}
