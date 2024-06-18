import java.util.Scanner;

class marks {
    String name;
    int reg;
    int numofcourse;
    String coursename;
    int code;
    int sum = 0;
    int marks;
    int[] array = new int[numofcourse];
    Scanner scanner = new Scanner(System.in);
    void input() {
        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter your Register Number : ");
        reg = scanner.nextInt();
        System.out.print("Number of course : ");
        numofcourse = scanner.nextInt();
    }
    void calculate(){
        for(int i=1;i<=numofcourse;i++){
            System.out.print("Enter Sub" + i + " Marks : ");
            marks = scanner.nextInt();
            sum = sum + marks;
        }
    }

}