public class ClothingFactory {
    public static ClothingItem getClothingItem(String type, double price, String size) {
        if ("Shoe".equalsIgnoreCase(type)) {
            return new Shoe(price, size);
        } else if ("Shirt".equalsIgnoreCase(type)) {
            return new Shirt(price, size);
        }
        return null;
    }
}
