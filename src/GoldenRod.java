
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
    protected void stage2() {
        Image goldenrod_stage2 = new Image(0,0,"goldenrod_stage2.png");
        getGraphics().removeAll();
        getGraphics().add(goldenrod_stage2);
    }
    protected void stage3() {
        Image goldenrod_stage3 = new Image(0,0,"goldenrod_stage3.png");
        getGraphics().removeAll();
        getGraphics().add(goldenrod_stage3);
    } 
    protected void remove() {
        getGraphics().removeAll();
    }
}