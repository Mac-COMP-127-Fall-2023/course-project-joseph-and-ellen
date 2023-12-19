
import edu.macalester.graphics.Image;



public class ShagBarkHickory extends Critter {
    Image shagbarkHickory_stage1;
    Image shagbarkHickory_stage2;
    Image shagbarkHickory_stage3;


    
    protected void buildGraphics() {
        Image shagbarkHickory_stage1 = new Image(0, 0, "shagbarkHickory_stage1.png");
        getGraphics().add(shagbarkHickory_stage1);
       
    }
    protected void stage2() {
        Image shagbarkHickory_stage2 = new Image(0,0,"shagbarkHickory_stage2.png");
        getGraphics().add(shagbarkHickory_stage2);
    }
    protected void stage3() {
        Image shagbarkHickory_stage3 = new Image(0,0,"shagbarkHickory_stage3.png");
        getGraphics().add(shagbarkHickory_stage3);
    }
}

