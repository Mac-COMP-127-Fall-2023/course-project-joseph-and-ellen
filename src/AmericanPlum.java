import edu.macalester.graphics.Image;



public class AmericanPlum extends Critter {
    public Image americanPlum_stage1;
    public Image americanPlum_stage2;
    public Image americanPlum_stage3;
    
    protected void buildGraphics() {
        Image americanPlum_stage1 = new Image(0, 0, "americanplum_stage1.png");
        getGraphics().add(americanPlum_stage1);
    }

    protected void stage2() {
        Image americanPlum_stage2 = new Image(0,0,"americanplum_stage2.png");
        getGraphics().removeAll();
        getGraphics().add(americanPlum_stage2);
    }
    protected void stage3() {
        Image americanplum_stage3 = new Image(0,0,"americanplum_stage3.png");
        getGraphics().removeAll();
        getGraphics().add(americanplum_stage3);
    }

    protected void remove() {
        getGraphics().removeAll();
    }
    
}
