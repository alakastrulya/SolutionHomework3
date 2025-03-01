package assignment3;
import assignment2.*;
import assignment1.SimpleDungeonBuilder;
import assignment1.IDungeonBuilder;
import assignment1.Dungeon;
import assignment1.IDungeonBuilder;
import assignment2.Room;


import java.util.ArrayList;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Item knife = new Item("Knife","very dangerous");
        Item swore = new Item("Swore","ancient item");
        ArrayList<Item> items = new ArrayList<>();
        items.add(knife);
        items.add(swore);

        SimpleDungeonBuilder builder1 = new SimpleDungeonBuilder();
        builder1.setDungeonName("scary dungeons");
        Room prototype = new Room("Hall",2,true, items);
        builder1.addRoom(prototype);

        for (int i = 1; i <= 4; i++) {
            Room clonedRoom = prototype.cloneEntity(i);
            builder1.addRoom(clonedRoom);
        }

        Dungeon dungeon = builder1.build();
        dungeon.info();

        //Dungeon: scary dungeons
        //Rooms:
        // - Hall (Capacity: 2)
        // - HallClone #1 (Capacity: 2)
        // - HallClone #2 (Capacity: 2)
        // - HallClone #3 (Capacity: 2)
        // - HallClone #4 (Capacity: 2)
        //NPCs:
        //Inventory:
        // - Knife (Description: very dangerous)
        // - Swore (Description: ancient item)
        // - Knife (Description: very dangerous)
        // - Swore (Description: ancient item)
        // - Knife (Description: very dangerous)
        // - Swore (Description: ancient item)
        // - Knife (Description: very dangerous)
        // - Swore (Description: ancient item)
        // - Knife (Description: very dangerous)
        // - Swore (Description: ancient item)




    }
}
