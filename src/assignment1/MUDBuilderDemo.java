package assignment1;
import assignment2.Item;
import assignment2.Room;
import java.util.ArrayList;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Item knife = new Item("Knife","very dangerous");
        Item swore = new Item("Swore","ancient item");
        ArrayList<Item> items = new ArrayList<>();
        items.add(knife);
        items.add(swore);

        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();

        builder.setDungeonName("Very scary dungeons");
        builder.addRoom(new Room("Chamber of Horrors", 5, true,items));
        builder.addRoom(new Room("Treasury", 2, false,items));
        builder.addNPC(new NPC("Dracula", 250, "The bite is bloody"));
        builder.addNPC(new NPC("Zombie", 100, "Deprivation of reason"));
        builder.addItem(knife);
        builder.addItem(swore);

        Dungeon dungeon = builder.build();
        dungeon.info();

//        The output of the code:
//        Dungeon: Very scary dungeons
//        Rooms:
//        - Chamber of Horrors (Capacity: 5)
//        - Treasury (Capacity: 2)
//        NPCs:
//        - Dracula (Damage Type: The bite is bloody)
//        - Zombie (Damage Type: Deprivation of reason)
//        Inventory: [Knife (very dangerous), Swore (ancient item)]
//        - Knife (Description: very dangerous)
//        - Swore (Description: ancient item)
}
}
