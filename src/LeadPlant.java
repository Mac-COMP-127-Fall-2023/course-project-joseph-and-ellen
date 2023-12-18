
import edu.macalester.graphics.Image;


import java.awt.Color;



public class LeadPlant extends Critter {
    Image leadplant_stage1;
    Image leadplant_stage2;
    Image leadplant_stage3;


    
    protected void buildGraphics() {
        Image leadplant_stage1 = new Image(0, 0, "leadplant_stage1.png");
        getGraphics().add(leadplant_stage1);
    
    }
    void stage2() {
        Image leadplant_stage2 = new Image(0,0,"leadplant_stage2.png");
        getGraphics().remove(leadplant_stage1);
        getGraphics().add(leadplant_stage2);
    }
    void stage3() {
        Image leadplant_stage3 = new Image(0,0,"leadplant_stage3.png");
        getGraphics().remove(leadplant_stage2);
        getGraphics().add(leadplant_stage3);
    }
}