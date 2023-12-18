import edu.macalester.graphics.Image;



public class BlueStem extends Critter {
    Image bluestem_stage1;
    Image bluestem_stage2;
    Image bluestem_stage3;


    
    protected void buildGraphics() {
        Image bluestem_stage1 = new Image(0, 0, "bluestem_stage1.png");
        getGraphics().add(bluestem_stage1);
       
    }
    void stage2() {
        Image bluestem_stage2 = new Image(0,0,"bluestem_stage2.png");
        getGraphics().remove(bluestem_stage1);
        getGraphics().add(bluestem_stage2);
    }
    void stage3() {
        Image bluestem_stage3 = new Image(0,0,"bluestem_stage3.png");
        getGraphics().remove(bluestem_stage2);
        getGraphics().add(bluestem_stage3);
    }
    // make method to replace stage 1 with stage 2

    // make method to replace stage 2 with stage 3

    // make method to replace any stage with dead

}


