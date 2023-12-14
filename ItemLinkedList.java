package collectionApi.items;

import java.util.LinkedList;

public class ItemLinkedList implements ItemServices{

    private static int nextId = 1;
    private final LinkedList<Item>items;
    public ItemLinkedList(){
        items=new LinkedList<>();
        items.add(new Item(1,"Book",12,23.5));
        items.add(new Item(2,"Soccer Ball",20,19.99));
        items.add(new Item(3,"Shirt",17,33.32));
        items.add(new Item(4,"Book",23,13.75));
    }

    @Override
    public void createItem(String name, int quantity, double price) {
        Item item= new Item(nextId++,name,quantity,price);
        items.add(item);
        System.out.println("Item created "+item );

    }

    @Override
    public void updateItem(int id, String name, int quantity, double price) {

        Item item=findItemById(id);
        if(item!=null){
            item.setName(name);
            item.setQuantity(quantity);
            item.setPrice(price);
            System.out.println("Item updated: "+item );
        }else {
            System.out.println("Item not found with id "+ id);
        }
    }

    @Override
    public void deleteItem(int id) {
        Item item=findItemById(id);
        if (item!=null){
            items.remove(item);
            System.out.println("Item deleted: "+item );
        }else{
            System.out.println("Item not found with id "+ id    );
        }

    }

    @Override
    public void displayAllItem() {
        System.out.println("All items: ");
        for(Item item:items){
            System.out.println(item);
        }

    }
    private Item findItemById(int id){
        for(Item item:items){
            if (item.getId()==id);
            return item;
        }
        return null;
    }
}
