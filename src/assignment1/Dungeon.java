package assignment1;
import assignment2.Item;
import assignment2.Room;
import java.util.ArrayList;

// the Product class representing a Dungeon
public class Dungeon {
    private String name;
    private ArrayList<Room> roomList;
    private ArrayList<NPC>  npcList;
    private ArrayList<Item> inventory;

    public Dungeon(String name, ArrayList<Room> roomList, ArrayList<NPC> npcList, ArrayList<Item> inventory) {
        this.name = name;
        this.roomList = roomList;
        this.npcList = npcList;
        this.inventory = inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public void setNpcList(ArrayList<NPC> npcList) {
        this.npcList = npcList;
    }
    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    public void addRoom(Room room) {
        roomList.add(room);
    }

    // display dungeon information
    public void info() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: ");
        for (Room room : roomList) {
            System.out.println(" - " + room.getRoomName() + " (Capacity: " + room.getCapacity() + ")");
        }
        System.out.println("NPCs: ");
        for (NPC npc : npcList) {
            System.out.println(" - " + npc.getName() + " (Damage Type: " + npc.getDamageType() + ")");
        }
        System.out.println("Inventory: " + inventory);
        for (Item item : inventory) {
            System.out.println(" - " + item.getItemName() + " (Description: " + item.getItemDescription() + ")");
        }
    }

}
