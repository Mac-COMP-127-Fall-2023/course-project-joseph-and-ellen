
import edu.macalester.graphics.Image;

import java.awt.Color;


public class GoldenRod extends Critter {
    Image goldenrod_stage1;
    Image goldenrod_stage2;
    Image goldenrod_stage3;


    
    protected void buildGraphics() {
        Image goldenrod_stage1 = new Image(0, 0, "goldenrod_stage1.png");
        getGraphics().add(goldenrod_stage1);
       
    }
    void stage2() {
        Image goldenrod_stage2 = new Image(0,0,"goldenrod_stage2.png");
        getGraphics().remove(goldenrod_stage1);
        getGraphics().add(goldenrod_stage2);
    }
    void stage3() {
        Image goldenrod_stage3 = new Image(0,0,"goldenrod_stage3.png");
        getGraphics().remove(goldenrod_stage2);
        getGraphics().add(goldenrod_stage3);
    }
    // make method to replace stage 1 with stage 2

    // make method to replace stage 2 with stage 3

    // make method to replace any stage with dead
}