import edu.macalester.graphics.Image;



public class EasternBottleBrushGrass extends Critter {
    Image easternBottlebrushGrass_stage1;
    Image easternBottlebrushGrass_stage2;
    Image easternBottlebrushGrass_stage3;


    
    protected void buildGraphics() {
        Image easternBottlebrushGrass_stage1 = new Image(0, 0, "easternbottlebrushgrass_stage1.png");
        getGraphics().add(easternBottlebrushGrass_stage1);
       
    }
    void stage2() {
        Image easternBottlebrushGrass = new Image(0,0,"easternbottlebrushgrass_stage2.png");
        getGraphics().remove(easternBottlebrushGrass_stage1);
        getGraphics().add(easternBottlebrushGrass_stage2);
    }
    void stage3() {
        Image easternBottlebrushGrass_stage3 = new Image(0,0,"easternbottlebrushgrass_stage3.png");
        getGraphics().remove(easternBottlebrushGrass_stage2);
        getGraphics().add(easternBottlebrushGrass_stage3);
    }
    // make method to replace stage 1 with stage 2

    // make method to replace stage 2 with stage 3

    // make method to replace any stage with dead

}


