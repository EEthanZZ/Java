package game;

public class Location {
    private String location_name;
    
    private int location_number;
    
    static int nextID = 1;
    
    public Location(String location_name) {
        this.location_name=location_name;
        
    }
}
