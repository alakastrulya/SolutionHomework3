package assignment1;
// NPC class
public class NPC {
    private String name;
    private int age;
    private String damageType;

    public NPC(String name, int age, String damageType) {
        this.name = name;
        this.age = age;
        this.damageType = damageType;
    }

    public String getName() {
        return name;
    }

    public String getDamageType() {
        return damageType;
    }

    public int getAge() {
        return age;
    }
}
