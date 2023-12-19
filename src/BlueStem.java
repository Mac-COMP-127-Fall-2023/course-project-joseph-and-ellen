import edu.macalester.graphics.Image;



public class BlueStem extends Critter {
    Image bluestem_stage1;
    Image bluestem_stage2;
    Image bluestem_stage3;


    
    protected void buildGraphics() {
        Image bluestem_stage1 = new Image(0, 0, "bluestem_stage1.png");
        getGraphics().add(bluestem_stage1);
       
    }
    protected void stage2() {
        Image bluestem_stage2 = new Image(0,0,"bluestem_stage2.png");
        getGraphics().removeAll();
        getGraphics().add(bluestem_stage2);
    }
    protected void stage3() {
        Image bluestem_stage3 = new Image(0,0,"bluestem_stage3.png");
        getGraphics().removeAll();
        getGraphics().add(bluestem_stage3);
    }
    protected void remove() {
        getGraphics().removeAll();
    }
}


