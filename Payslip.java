import java.util.Scanner;

public class Payslip {
    int employeeCode;
    String name;
    String department;
    int basicPay;
    int DA;
    String living;
    int advance;
    int HRA;
    int netPay;
    int grossPay;
    int deduction;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Payslip payslip = new Payslip();
        payslip.details();
        payslip.calculateDA();
        payslip.calculateHRA();
        payslip.calculateGrossPay();
        payslip.calculateDeduction();
        payslip.calculateNetPay();
        payslip.display();
    }

    public Payslip() {

        this.employeeCode = 0;
        this.name = "";
        this.department = "";
        this.basicPay = 0;
        this.DA = 0;
        this.advance = 20000;
        this.HRA = 0;
        this.netPay = 0;
        this.grossPay = 0;
        this.deduction = 0;
    }

    public void details() {
        System.out.print("Enter the Employee Code: ");
        this.employeeCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter your Department: ");
        this.department = scanner.nextLine();
        System.out.print("Living (urban/rural): ");
        this.living = scanner.nextLine();
        System.out.print("Enter DA (in %) : ");
        this.DA = scanner.nextInt();
        System.out.print("Enter your Monthly Basic pay: ");
        this.basicPay = scanner.nextInt();
    }

    public void calculateDA() {
        DA = (DA / 100) * basicPay;
    }

    public void calculateHRA() {
        if (living.equalsIgnoreCase("urban")) {
            HRA = (int) (0.1 * basicPay);
        } else if (living.equalsIgnoreCase("rural")) {
            HRA = (int) (0.05 * basicPay);
        }
    }

    public void calculateGrossPay() {
        grossPay = basicPay + DA + HRA;
    }

    public void calculateDeduction() {
        deduction = advance / (15 * 12);
    }

    public void calculateNetPay() {
        netPay = grossPay - deduction;
    }

    public void display() {
        System.out.println("    PAY SLIP   ");
        System.out.println("Employee Code : " + employeeCode);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Department : " + department);
        System.out.println("Basic Pay : " + basicPay);
        System.out.println("DA : " + DA);
        System.out.println("HRA : " + HRA);
        System.out.println("Gross Pay : " + grossPay);
        System.out.println("Deductions : " + deduction);
        System.out.println("Net Pay : " + netPay);
    }
}
