
import edu.macalester.graphics.Image;



public class Sumac extends Critter {
    Image sumac_stage1;
    Image sumac_stage2;
    Image sumac_stage3;


    
    protected void buildGraphics() {

        Image sumac_stage1 = new Image(0, 0, "sumac_stage1.png");
        getGraphics().add(sumac_stage1);
       
    }
    protected void stage2() {
        Image sumac_stage2 = new Image(0,0,"sumac_stage2.png");
        getGraphics().removeAll();
        getGraphics().add(sumac_stage2);
    }
    protected void stage3() {
        Image sumac_stage3 = new Image(0,0,"sumac_stage3.png");
        getGraphics().removeAll();
        getGraphics().add(sumac_stage3);
    }
    protected void remove() {
        getGraphics().removeAll();
    }

  
}















