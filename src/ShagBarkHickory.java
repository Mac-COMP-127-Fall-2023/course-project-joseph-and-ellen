
import edu.macalester.graphics.Image;



public class ShagBarkHickory extends Critter {
    Image shagbarkHickory_stage1;
    Image shagbarkHickory_stage2;
    Image shagbarkHickory_stage3;


    
    protected void buildGraphics() {
        Image shagbarkHickory_stage1 = new Image(0, 0, "shagbarkHickory_stage1.png");
        getGraphics().add(shagbarkHickory_stage1);
       
    }
    void stage2() {
        Image shagbarkHickory_stage2 = new Image(0,0,"shagbarkHickory_stage2.png");
        getGraphics().remove(shagbarkHickory_stage1);
        getGraphics().add(shagbarkHickory_stage2);
    }
    void stage3() {
        Image shagbarkHickory_stage3 = new Image(0,0,"shagbarkHickory_stage3.png");
        getGraphics().remove(shagbarkHickory_stage2);
        getGraphics().add(shagbarkHickory_stage3);
    }
    // make method to replace stage 1 with stage 2

    // make method to replace stage 2 with stage 3

    // make method to replace any stage with dead
}

