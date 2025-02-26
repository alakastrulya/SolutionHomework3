package assignment2;

import java.util.ArrayList;
// main class demonstrating the Prototype pattern
public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Creating items
        Item knife = new Item("Knife","very dangerous");
        Item swore = new Item("Swore","ancient item");
        System.out.println(knife);
        System.out.println(swore);
        System.out.println("-----------------------------");
        //prototypes of the items
        Item cloneknife = (Item )knife.cloneEntity();
        System.out.println(cloneknife);
        Item cloneSwore = (Item )swore.cloneEntity();
        System.out.println(cloneSwore);
        System.out.println("-----------------------------");
        //Creating a prototype room with this items
        ArrayList<Item> items = new ArrayList<>();
        items.add(knife);
        items.add(swore);
        Room mine = new Room("Hall",2,true, items);
        System.out.println(mine);
        //Creating clones
        System.out.println("-----------------------------");
        System.out.println("All clones: ");
        Room mineCloneFirst = (Room )mine.cloneEntity();
        System.out.println(mineCloneFirst);
        Room mineCloneSecond= (Room )mine.cloneEntity();
        System.out.println(mineCloneSecond);
        Room mineCloneThird = (Room )mine.cloneEntity();
        System.out.println(mineCloneThird);
        Room mineCloneFourth= (Room )mine.cloneEntity();
        System.out.println(mineCloneFourth);
        Room mineCloneFifth = (Room )mine.cloneEntity();
        System.out.println(mineCloneFifth);

//        The output of the code:
//        Knife (very dangerous)
//        Swore (ancient item)
//        -----------------------------
//        Knife (very dangerous)
//        Swore (ancient item)
//        -----------------------------
//        Room{roomName='Hall', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        -----------------------------
//        All clones:
//        Room{roomName='Hall', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        Room{roomName='Hall', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        Room{roomName='Hall', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        Room{roomName='Hall', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}
//        Room{roomName='Hall', capacity=2, opened=true, inventory=[Knife (very dangerous), Swore (ancient item)]}




    }
}
