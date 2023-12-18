
import edu.macalester.graphics.Image;


import java.awt.Color;



public class LeadPlant extends Critter {


    
    protected void buildGraphics() {
        Image leadplant = new Image(0, 0, "leadplant_stage1.png");
        getGraphics().add(leadplant);
    
    }

}