package collectionApi.items;

public class Main {
    private static ItemServices itemServices = new ItemLinkedList();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    Please choose an option:
                    1. Create item
                    2. Read All item
                    3. Update item
                    4. Delete item
                    5. Exit
                                    
                    """);
            int choice = 0;
            try {
                choice = UserInput.getIntInput("Enter your choice");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            switch (choice) {

                case 1:
                    itemServices.createItem(UserInput.getStringInput("Enter item name"),
                            UserInput.getIntInput("Enter Item quantity"),
                            UserInput.getDoubleInput("Enter price"));
                    break;
                case 2:
                    itemServices.displayAllItem();
                    break;
                case 3:
                    itemServices.displayAllItem();
                    int id = UserInput.getIntInput("Enter id number");
                    String name = UserInput.getStringInput("Enter item name");
                    int quantity = UserInput.getIntInput("Enter quantity");
                    double price = UserInput.getDoubleInput("Enter the price please");
                    itemServices.updateItem(id, name, quantity, price);
                    break;
                case 4:
                    int deleteItemId = UserInput.getIntInput("Enter item ID to delete");
                    if (deleteItemId > 0) {
                        System.out.println("Item deleted successfully.");
                    } else {
                        System.out.println("Item with Id " + deleteItemId + " not found.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting app");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}



