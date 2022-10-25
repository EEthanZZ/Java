package game;

public class Location {
    private String location_name;
    
    private int location_size;

    private int location_id;
    
    static int nextID = 1;
    
    public Location(String location_name) {
        this.location_name=location_name;
        location_id = nextID ++;
    }

    public String getLocation_name(){
        return location_name;
    }

    public int setlocation_size(String location_name) {
        if (location_name.equalsIgnoreCase("south 1"))
            location_size = 10;
        else if (location_name.equalsIgnoreCase("south 2"))
            location_size = 20;
        else if (location_name.equalsIgnoreCase("east 1"))
            location_size = 30;
        else
            location_size = 0;
        return location_size;
    }

}
