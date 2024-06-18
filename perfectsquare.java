import java.util.Scanner;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Lower Range : ");
        int lower = scanner.nextInt();
        System.out.println("Enter Upper Range : ");
        int upper = scanner.nextInt();
        for (int i = lower; i <= upper; ++i) {
            int sum = i * i;
            int result = 0;
            int temp = sum;
            while(temp>0){
                result += temp % 10;
                temp = temp / 10;
            }
            if(result<10 && sum<=upper){
                System.out.println(sum);
            }
        }

    }
}

