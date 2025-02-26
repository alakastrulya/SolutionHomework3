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

        Dungeon dungeon = builder1.build();
        System.out.println(prototype);

        for (int i = 1; i <= 4; i++) {
            Room clonedRoom = prototype.cloneEntity(i);
            dungeon.addRoom(clonedRoom);
            System.out.println(clonedRoom);
        }
//        The output of the code
//        Room{roomName='Hall', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        Room{roomName='HallClone #1', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        Room{roomName='HallClone #2', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        Room{roomName='HallClone #3', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        Room{roomName='HallClone #4', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}



    }
}
