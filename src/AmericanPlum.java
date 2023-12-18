import edu.macalester.graphics.Image;



public class AmericanPlum extends Critter {
    Image americanPlum_stage1;
    Image americanPlum_stage2;
    Image americanPlum_stage3;


    
    protected void buildGraphics() {
        Image americanPlum_stage1 = new Image(0, 0, "americanplum_stage1.png");
        getGraphics().add(americanPlum_stage1);
    }

    void stage2() {
        Image americanPlum_stage2 = new Image(0,0,"americanplum_stage2.png");
        getGraphics().remove(americanPlum_stage1);
        getGraphics().add(americanPlum_stage2);
    }
    void stage3() {
        Image americanplum_stage3 = new Image(0,0,"americanplum_stage3.png");
        getGraphics().remove(americanPlum_stage2);
        getGraphics().add(americanplum_stage3);
    }
}
