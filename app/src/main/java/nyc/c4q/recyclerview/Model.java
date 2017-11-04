package nyc.c4q.recyclerview;

/**
 * Created by MsNehisi on 11/4/17.
 */

// Class created to get and hold data

public class Model {
    private String color;

    // Creating a constructor for building the Model List and setting the colors in the Main Activity.
    public Model(String color){
        this.color = color;
    }
    //Create Getter
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
