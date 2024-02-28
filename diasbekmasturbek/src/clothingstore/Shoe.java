public class Shoe extends ClothingItem {
    public Shoe(double price, String size) {
        this.price = price;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Shoe - Size: " + size + ", Price: $" + price);
    }
}
