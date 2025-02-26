package assignment1;

import java.util.ArrayList;

import assignment2.Item;
import assignment2.Room;
// concrete implementation of the Builder pattern for constructing a Dungeon
public class SimpleDungeonBuilder implements IDungeonBuilder{
    private String name;
    private ArrayList<Room> roomList;
    private ArrayList<NPC>  npcList;
    private ArrayList<Item>  inventory;

    public SimpleDungeonBuilder() {
        this.roomList = new ArrayList<>();
        this.npcList = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    public void setDungeonName(String name){
        this.name = name;
    }

    public void addRoom(Room room){
        roomList.add(room);
    }
    public void addNPC(NPC npc){
        npcList.add(npc);
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    // builds the final Dungeon object
    public Dungeon build(){
        return new Dungeon(name,roomList,npcList,inventory);
    }
    }

