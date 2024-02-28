public class Shirt extends ClothingItem {
    public Shirt(double price, String size) {
        this.price = price;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Shirt - Size: " + size + ", Price: $" + price);
    }
}
