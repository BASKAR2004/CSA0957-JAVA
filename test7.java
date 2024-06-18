import java.util.Scanner;
public class test7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.print("Enter the size of an array : ");
        int size = scanner.nextInt();
        int[] array;
        array = new int[size];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        for(int i=0;i<size;i++){
            if(array[i]>0){
                positive++;
            } else if (array[i]<0) {
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("No. of positive values : " + positive);
        System.out.println("No. of negative values : " + negative);
        System.out.println("No. of zero's : " + zero);
    }
}
