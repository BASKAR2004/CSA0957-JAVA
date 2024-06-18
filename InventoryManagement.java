import java.util.Scanner;
class InventoryManagementSystem {
    private String companyName;
    private String rawMaterialName;
    private int rawMaterialQuantity;
    private int rawMaterialReorderLevel;
    private String finishedProductName;
    private int finishedProductQuantity;
    public InventoryManagementSystem(String companyName) {
        this.companyName = companyName;
    }
    public void addRawMaterial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter raw material name: ");
        rawMaterialName = scanner.nextLine();
        System.out.print("Enter raw material quantity: ");
        rawMaterialQuantity = scanner.nextInt();
        System.out.print("Enter reorder level: ");
        rawMaterialReorderLevel = scanner.nextInt();
    }
    public void addFinishedProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter finished product name: ");
        finishedProductName = scanner.nextLine();
        System.out.print("Enter finished product quantity: ");
        finishedProductQuantity = scanner.nextInt();
    }
    public void issueRawMaterialToProduction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity to issue: ");
        int quantity = scanner.nextInt();
        if (rawMaterialQuantity >= quantity) {
            rawMaterialQuantity -= quantity;
            if (rawMaterialQuantity <= rawMaterialReorderLevel) {
                System.out.println("Reorder level reached for " + rawMaterialName);
            }
        } else {
            System.out.println("Not enough " + rawMaterialName + " in stock");
        }
    }
    public void receiveFinishedProductFromProduction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity to receive: ");
        int quantity = scanner.nextInt();
        finishedProductQuantity += quantity;
    }
    public void sellFinishedProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity to sell: ");
        int quantity = scanner.nextInt();
        if (finishedProductQuantity >= quantity) {
            finishedProductQuantity -= quantity;
        } else {
            System.out.println("Not enough " + finishedProductName + " in stock");
        }
    }
    public void displayInventory() {
        System.out.println("Raw Material:");
        System.out.println("Name: " + rawMaterialName);
        System.out.println("Quantity: " + rawMaterialQuantity);
        System.out.println("Reorder Level: " + rawMaterialReorderLevel);
        System.out.println("Finished Product:");
        System.out.println("Name: " + finishedProductName);
        System.out.println("Quantity: " + finishedProductQuantity);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String companyName = scanner.nextLine();
        InventoryManagementSystem ims = new InventoryManagementSystem(companyName);
        System.out.println("Add raw material:");
        ims.addRawMaterial();
        System.out.println("Add finished product:");
        ims.addFinishedProduct();
        System.out.println("Initial Inventory:");
        ims.displayInventory();
        System.out.println("Issue raw material to production:");
        ims.issueRawMaterialToProduction();
        System.out.println("Receive finished product from production:");
        ims.receiveFinishedProductFromProduction();
        System.out.println("Sell finished product:");
        ims.sellFinishedProduct();
        System.out.println("Final Inventory:");
        ims.displayInventory();
    }
}