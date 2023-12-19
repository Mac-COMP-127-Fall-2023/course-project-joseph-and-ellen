import edu.macalester.graphics.Image;



public class CommonMilkWeed extends Critter {
    Image commonMilkweed_stage1;
    Image commonMilkweed_stage2;
    Image commonMilkweed_stage3;
    


    
    protected void buildGraphics() {
        Image commonMilkweed_stage1 = new Image(0, 0, "commonmilkweed_stage1.png");
        getGraphics().add(commonMilkweed_stage1);
       
    }
    protected void stage2() {
        Image commonMilkweed_stage2 = new Image(0,0,"commonmilkweed_stage2.png");
        getGraphics().add(commonMilkweed_stage2);
    }
    protected void stage3() {
        Image commonMilkweed_stage3 = new Image(0,0,"commonmilkweed_stage3.png");
        getGraphics().add(commonMilkweed_stage3);
    }

}


