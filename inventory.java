import java.util.*;

class Company {
    String name;
    String address;
    Map<String, RawMaterial> rawMaterials;
    Map<String, FinishedProduct> finishedProducts;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
        this.rawMaterials = new HashMap<>();
        this.finishedProducts = new HashMap<>();
    }

    public void addRawMaterial(RawMaterial material) {
        this.rawMaterials.put(material.name, material);
    }

    public void addFinishedProduct(FinishedProduct product) {
        this.finishedProducts.put(product.name, product);
    }

    public void issueRawMaterial(String name, int quantity) {
        RawMaterial material = this.rawMaterials.get(name);
        if (material != null && material.quantity >= quantity) {
            material.quantity -= quantity;
        }
    }

    public void receiveFinishedProduct(String name, int quantity) {
        FinishedProduct product = this.finishedProducts.get(name);
        if (product != null) {
            product.quantity += quantity;
        }
    }

    public void sellFinishedProduct(String name, int quantity) {
        FinishedProduct product = this.finishedProducts.get(name);
        if (product != null && product.quantity >= quantity) {
            product.quantity -= quantity;
        }
    }
}

class RawMaterial {
    String name;
    int quantity;
    int reorderLevel;

    public RawMaterial(String name, int quantity, int reorderLevel) {
        this.name = name;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }
}

class FinishedProduct {
    String name;
    int quantity;

    public FinishedProduct(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

public class inventory {
    public static void main(String[] args) {
        Company company = new Company("ABC Corp", "123 Street, City");
        company.addRawMaterial(new RawMaterial("Steel", 100, 10));
        company.addFinishedProduct(new FinishedProduct("Car", 50));

        company.issueRawMaterial("Steel", 20);
        company.receiveFinishedProduct("Car", 10);
        company.sellFinishedProduct("Car", 5);
    }
}
