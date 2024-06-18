import java.util.Scanner;
public class Ascending {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] array;
        array = new int[size];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(array[i] + " ");
        }
    }
}
