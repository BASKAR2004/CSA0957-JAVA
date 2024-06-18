public class b2d {
    public static void main(String[]args){
        int num = 1011,remainder,decimal=0,i=0;
        int n1=num;
        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimal += remainder * Math.pow(2, i);
            ++i;
        }
        System.out.println("The Decimal equivalent of " + n1 + " is " +decimal);
    }
}
