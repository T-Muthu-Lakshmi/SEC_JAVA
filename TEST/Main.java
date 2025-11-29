// Parent Class
class Product {
    int productId;

    // Parent constructor
    Product(int productId) {
        this.productId = productId;
    }

    // Parent method
    void showDetails() {
        System.out.println("Product ID: " + productId);
    }
}

// Child Class
class Electronics extends Product {
    int warranty;

    // Child constructor using super()
    Electronics(int productId, int warranty) {
        super(productId);  // calling parent constructor
        this.warranty = warranty;
    }

    // Overriding showDetails()
    @Override
    void showDetails() {
        super.showDetails();  // calling parent method
        System.out.println("Warranty (years): " + warranty);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Electronics e = new Electronics(101, 2);
        e.showDetails();
    }
}