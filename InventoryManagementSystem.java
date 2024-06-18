import java.util.HashMap;
import java.util.Map;

class InventoryManagementSystem {
    private String companyName;
    private String companyAddress;
    private Map<String, Integer> rawMaterialsStock;
    private Map<String, Integer> finishedProductsStock;

    public InventoryManagementSystem(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.rawMaterialsStock = new HashMap<>();
        this.finishedProductsStock = new HashMap<>();
    }

    public void addRawMaterial(String material, int quantity) {
        rawMaterialsStock.put(material, rawMaterialsStock.getOrDefault(material, 0) + quantity);
    }

    public void addFinishedProduct(String product, int quantity) {
        finishedProductsStock.put(product, finishedProductsStock.getOrDefault(product, 0) + quantity);
    }

    public void issueRawMaterial(String material, int quantity) {
        if (rawMaterialsStock.containsKey(material)) {
            int currentStock = rawMaterialsStock.get(material);
            if (currentStock >= quantity) {
                rawMaterialsStock.put(material, currentStock - quantity);
                System.out.println(quantity + " units of " + material + " issued from raw material stock.");
            } else {
                System.out.println("Insufficient stock of " + material);
            }
        } else {
            System.out.println("Raw material " + material + " not found.");
        }
    }

    public void sellFinishedProduct(String product, int quantity) {
        if (finishedProductsStock.containsKey(product)) {
            int currentStock = finishedProductsStock.get(product);
            if (currentStock >= quantity) {
                finishedProductsStock.put(product, currentStock - quantity);
                System.out.println(quantity + " units of " + product + " sold.");
            } else {
                System.out.println("Insufficient stock of " + product);
            }
        } else {
            System.out.println("Finished product " + product + " not found.");
        }
    }

    public void produceFinishedProduct(String product, int quantity) {
        finishedProductsStock.put(product, finishedProductsStock.getOrDefault(product, 0) + quantity);
        System.out.println(quantity + " units of " + product + " produced and added to finished product stock.");
    }

    public void displayStocks() {
        System.out.println("Raw Materials Stock:");
        for (Map.Entry<String, Integer> entry : rawMaterialsStock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nFinished Products Stock:");
        for (Map.Entry<String, Integer> entry : finishedProductsStock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem("ABC Company", "123 Main Street");

        // Adding raw materials and finished products to stock
        inventorySystem.addRawMaterial("Wood", 100);
        inventorySystem.addRawMaterial("Steel", 50);
        inventorySystem.addFinishedProduct("Chair", 20);
        inventorySystem.addFinishedProduct("Table", 10);

        // Display initial stock
        inventorySystem.displayStocks();

        // Issuing raw materials
        inventorySystem.issueRawMaterial("Wood", 30);
        inventorySystem.issueRawMaterial("Steel", 10);

        // Selling finished products
        inventorySystem.sellFinishedProduct("Chair", 5);

        // Producing finished products
        inventorySystem.produceFinishedProduct("Table", 5);

        // Display updated stock
        inventorySystem.displayStocks();
    }
}