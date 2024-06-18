import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size  : ");
        int size = scanner.nextInt();
        int[] array;
        array = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.print(array[0]+ " ");
        for (int i = 1; i < size; i++) {
            if (array[i] != array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
