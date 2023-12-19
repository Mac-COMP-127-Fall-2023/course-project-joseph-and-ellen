import edu.macalester.graphics.Image;



public class EasternBottleBrushGrass extends Critter {
    Image easternBottlebrushGrass_stage1;
    Image easternBottlebrushGrass_stage2;
    Image easternBottlebrushGrass_stage3;


    
    protected void buildGraphics() {
        Image easternBottlebrushGrass_stage1 = new Image(0, 0, "easternbottlebrushgrass_stage1.png");
        getGraphics().add(easternBottlebrushGrass_stage1);
       
    }
    protected void stage2() {
        Image easternBottlebrushGrass_stage2 = new Image(0,0,"easternbottlebrushgrass_stage2.png");
        getGraphics().add(easternBottlebrushGrass_stage2);
    }
    protected void stage3() {
        Image easternBottlebrushGrass_stage3 = new Image(0,0,"easternbottlebrushgrass_stage3.png");
        getGraphics().add(easternBottlebrushGrass_stage3);
    }
}


