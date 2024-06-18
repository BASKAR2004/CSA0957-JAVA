import java.util.Scanner;
class ElectricityBill {
    int consumerNo;
    String consumerName;
    int previousMonthReading;
    int currentMonthReading;
    double billAmount;
    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Consumer Number: ");
        consumerNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Consumer Name: ");
        consumerName = scanner.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        previousMonthReading = scanner.nextInt();
        System.out.print("Enter Current Month Reading: ");
        currentMonthReading = scanner.nextInt();
    }


    void calculateBill() {

        if (currentMonthReading <= 100) {
            billAmount = currentMonthReading * 1.0;
        } else if (currentMonthReading <= 200) {
            billAmount = 100 * 1.0 + (currentMonthReading - 100) * 2.5;
        } else if (currentMonthReading <= 500) {
            billAmount = 100 * 1.0 + 100 * 2.5 + (currentMonthReading - 200) * 4.0;
        } else {
            billAmount = 100 * 1.0 + 100 * 2.5 + 300 * 4.0 + (currentMonthReading - 500) * 6.0;
        }
    }

    void displayBill() {
        System.out.println("\nElectricity Bill:");
        System.out.println("Consumer Number    : " + consumerNo);
        System.out.println("Consumer Name      : " + consumerName);
        System.out.println("Previous Reading   : " + previousMonthReading);
        System.out.println("Current Reading    : " + currentMonthReading);
        System.out.println("Bill Amount        : Rs. " + billAmount);
    }
}

class Main {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();
        bill.inputDetails();
        bill.calculateBill();
        bill.displayBill();
    }
}