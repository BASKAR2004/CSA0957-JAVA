import java.util.Scanner;
public class college{
public static void main (String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the total no of user  :");
int totaluser=scanner.nextInt();
System.out.print("Enter the no of staff  :");
int staff=scanner.nextInt();
int nonteachingstaff=staff/3;
int totalstaff=staff+nonteachingstaff;
int totalstudent=totaluser-totalstaff;
System.out.println("No of NON Teaching staff :"+nonteachingstaff);
System.out.println("No of total staff :"+totalstaff);

System.out.print("No of student :"+totalstudent);



}}