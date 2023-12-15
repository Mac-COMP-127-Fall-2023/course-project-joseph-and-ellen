
import edu.macalester.graphics.Image;

import java.awt.Color;


public class GoldenRod extends Critter {


    
    protected void buildGraphics() {
        Image goldenRod = new Image(0, 0, "goldenrod_stage1.png");
        getGraphics().add(goldenRod);
       
    }
}