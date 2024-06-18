import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements : ");
        int[] array;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        if(size>1){
            int temp = array[0];
            array[0] = array[size-1];
            array[size-1] = temp;
        }
        for(int value : array){
            System.out.print(value + " ");
        }
    }
}