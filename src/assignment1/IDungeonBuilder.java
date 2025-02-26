package assignment1;

import assignment2.Item;
import assignment2.Room;
// interface for the Builder pattern, defining methods for constructing a Dungeon
public interface IDungeonBuilder {
     void setDungeonName(String name);
     void addRoom(Room room);
     void addNPC(NPC npc);
     void addItem(Item item);
     // builds and returns the dungeon
     Dungeon build();
}
