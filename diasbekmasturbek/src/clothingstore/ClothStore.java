import java.util.Scanner;

public class ClothStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClothingItem item = null;
        double price = 0.0;
        String size = "";
        int choice = 0;

        while (true) {
            System.out.println("Welcome to the Cloth Store!");
            System.out.println("Please select the item you want to purchase:");
            System.out.println("1. Shoe");
            System.out.println("2. Shirt");
            System.out.println("3. Checkout and Exit");
            System.out.print("Enter the number of your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            if (choice == 3) {
                if (item != null) {
                    item.display();
                    System.out.printf("Total Price: $%.2f\n", price);
                } else {
                    System.out.println("No items selected.");
                }
                System.out.println("Thank you for shopping with us!");
                break;
            }

            String type = choice == 1 ? "Shoe" : "Shirt";

            System.out.print("Enter price: ");
            price = scanner.nextDouble();
            scanner.nextLine(); // Clear the newline

            System.out.print("Enter size: ");
            size = scanner.nextLine();

            item = ClothingFactory.getClothingItem(type, price, size);
        }

        scanner.close();
    }
}
