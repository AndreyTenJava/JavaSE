package modal.Lesson2_Task1;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Item> items = new ArrayList<>();

    private static Long id = 6L;

    static {
        items.add(new Item(1L, "Iphone 13 Pro Max",450000,10));
        items.add(new Item(2L, "XIAOMI REDMI NOTE 8",82000,20));
        items.add(new Item(3L, "Oppo 3 Model X",350000,15));
        items.add(new Item(4L, "Macbook Pro M1 13",750000,15));
        items.add(new Item(5L, "ASUS TUF Gaming",340000,7));

    }

    public static void addItem(Item item) {
        item.setId(id);
        items.add(item);
        id++;
    }

    public static ArrayList<Item> getItems () {
        return items;
    }

    public static Item getItem (Long id) {
        for (Item it: items) {
            if (it.getId()==id){
                return it;
            }
        }
        return null;
    }
}
