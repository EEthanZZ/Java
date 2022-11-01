package game;

/**
 * This class is for building Location tab
 *
 */
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

    /**
     * This method is for getting the location sizes match to the location name
     * @param location_name to return the name of the location
     */
    public void setlocation_size(String location_name) {

        if (location_name.equalsIgnoreCase("a1"))
            location_size = 10;
        else if (location_name.equalsIgnoreCase("b2"))
            location_size = 20;
        else if (location_name.equalsIgnoreCase("c3"))
            location_size = 30;
        else
            location_size = 0;
    }
    public int getLocation_size(){
        return location_size;
    }

    public String toString() {
        return
                "location_name: " + location_name + "\nlocation_size: " + location_size + "\nlocation_id:" + location_id;
    }
}
