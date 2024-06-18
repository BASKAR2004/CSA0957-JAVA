import java.util.Scanner;
public class test4 {
    public static void main(String []args){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = scanner.nextInt();
        for(int i=1;i<=3;i++){
            sum = (int) (sum + Math.pow(n,i));
        }
        System.out.print(sum);
    }
}
