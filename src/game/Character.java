package game;

/**
 * This class is for Character Location tab
 *
 */
public class Character {
    private int char_id;

    private String char_name;

    static int nextId = 1;

    public Character (String char_name){
        this.char_name=char_name;
        char_id = nextId++;
    }

    @Override
    public String toString() {
        return "\nCharacter ID: " + char_id + "\nname: " + char_name;

    }
}

