package collectionApi.items;

public interface ItemServices {
    void createItem(String name, int quantity, double price);
    void updateItem(int id, String name, int quantity, double price);
    void deleteItem (int id);
    void displayAllItem();
}
