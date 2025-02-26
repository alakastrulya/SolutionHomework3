package assignment2;

import java.util.ArrayList;

// Room class with support for deep cloning
public class Room implements CloneableGameEntity {
    private String roomName;
    private int capacity;
    private boolean opened;
    private ArrayList<Item> inventory;

    public Room(String roomName, int capacity, boolean opened, ArrayList<Item> inventory) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.opened = opened;
        this.inventory = inventory;
    }

    public void open() { opened = true; }
    public void close() { opened = false; }

    public boolean isOpened() { return opened; }
    public String getRoomName() { return roomName; }
    public int getCapacity() { return capacity; }
    public ArrayList<Item> getInventory() { return inventory; }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }


    @Override
    public Room cloneEntity() {
        ArrayList<Item> clonedInventory = new ArrayList<>();
        // deep cloning item list
        for (Item item : inventory) {
            clonedInventory.add(item.cloneEntity());
        }
        // creating a new Room with the same properties
        return new Room(roomName, capacity, opened, clonedInventory);
    }
    // deep cloning item list with optional modification like Clone #
    public Room cloneEntity(int cloneNum) {
        ArrayList<Item> clonedInventory = new ArrayList<>();
        for (Item item : inventory) {
            clonedInventory.add(item.clone());
        }
        return new Room(roomName+"Clone #"+cloneNum, capacity, opened, clonedInventory);
    }


    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", capacity=" + capacity +
                ", opened=" + opened +
                ", inventory=" + inventory +
                '}';
    }
}