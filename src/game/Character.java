package game;

public class Character {
    private int char_id;

    private String char_name;

    static int nextId = 1;

    public Character (String char_name){
        this.char_name=char_name;
        char_id = nextId++;
    }
}

