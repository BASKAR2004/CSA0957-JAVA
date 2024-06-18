import java.util.Scanner;

class nth_factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factor :");
        int n = sc.nextInt();
        System.out.println("Enter the nth factor :");
        int b = sc.nextInt();
        int c = 0;
        int[] a = new int[n];
        for(int i = 1; i<= n; i++) {
            if (n % i == 0) {
                a[c]=i;
                c++;
            }
        }
        System.out.println("Total number of factors is :"+c);
        if(b>0 && b<c){
            System.out.println("The element is "+a[b-1]);
        }
        else{
            System.out.println("Invalid number");
        }
    }
}