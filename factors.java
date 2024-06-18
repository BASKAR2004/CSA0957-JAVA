import java.util.Scanner;

public class factors {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = scanner.nextInt();
        int[] array;
        array = new int[n];
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
               array[count] = i;
               count++;
               System.out.println(i);
            }
        }
        System.out.println("Total Number of factors : " + count);
        System.out.println("Enter Position : ");
        int position = scanner.nextInt();
        if(position>0 && position<=count){
            System.out.println(array[position-1]);
        }
        else{
            System.out.println("Invalid Position");
        }
    }
}
