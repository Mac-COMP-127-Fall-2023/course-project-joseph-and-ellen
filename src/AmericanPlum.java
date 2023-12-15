import edu.macalester.graphics.Image;



public class AmericanPlum extends Critter {


    
    protected void buildGraphics() {
        Image americanplum = new Image(0, 0, "americanplum_stage1.png");
        getGraphics().add(americanplum);
    }
}