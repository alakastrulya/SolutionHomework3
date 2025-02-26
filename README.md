#**Home Work 3 Project**

## **Description:**

This project is a mini-game implementing the Builder and Prototype design patterns.

The player interacts with a dungeon (Dungeon) that contains rooms, NPCs, and items. The main objective is to explore locations and interact with objects.

### **Project Structure:**

The project is divided into three main parts **(assignment1, assignment2, assignment3)**:

**assignment1** – Implementation of the Builder pattern for dungeon creation.

**assignment2** – Implementation of the Prototype pattern for cloning rooms and items.

**assignment3** – Integration of Builder and Prototype into a single system.

## Main Classes and Their Roles

### **assignment1 (Builder Pattern)**

**SimpleDungeonBuilder**  – Constructs the dungeon.

**Dungeon** – The dungeon itself, containing rooms, NPCs, and inventory.

**IDungeonBuilder** – Interface for the builder.

**Room** – Room class.

### **assignment2 (Prototype Pattern)**

**Room** – The room with cloning support.

**Item** – Items that can also be cloned.

**CloneableGameEntity** – Interface for all clonable objects.

### **assignment3 (Combined Builder + Prototype)**

**MUDCombinedDemo** – Demonstrates functionality, creating a dungeon and cloning rooms.

### **How the Code Works**

A dungeon is created using the builder (SimpleDungeonBuilder).

Rooms, NPCs, and items are added.

Rooms are cloned using the Prototype pattern and added to the dungeon.

Dungeon information is displayed.


The project demonstrates SOLID principles and design patterns in Java.

***The project created by second year student of Narxoz University, Akhmetova Aisha.***
