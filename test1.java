import java.util.Scanner;
public class test1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = scanner.nextInt();
        int sum=0,min_i=0,min_j=0;
        int[] array;
        array = new int[20];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        int min_sum = array[0]+array[1];
        for (int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                sum = array[i] + array[j];
                if (Math.abs(sum) < Math.abs(min_sum)){
                    min_sum = sum;
                    min_i = i;
                    min_j = j;
                }
            }
        }
        System.out.print(array[min_i] + " "  +array[min_j]);
    }
}