public class Cleric extends Protagonist {
    public Cleric(String name) {
        super(name);
        health = 200;
        strength = 5;
        start_defense = 15;
        start_attack = 7.5;
        normalize();
    }

    public void specialize() {
        if (defense >= 0) {
            defense -= 1;
            attack += 1;
        }
    }

    public void normalize() {
        defense = start_defense;
        attack = start_attack;
    }

    public String toString() {
        String result = "Name: " + name + System.lineSeparator();
        result += "Health: " + health + System.lineSeparator();
        result += "Strength: " + strength + System.lineSeparator();
        result += "Defense: " + defense + System.lineSeparator();
        result += "Attack: " + attack;
        result += "Class: Cleric";
        return result;
    }
}