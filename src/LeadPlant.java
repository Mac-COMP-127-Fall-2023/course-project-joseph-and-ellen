import edu.macalester.graphics.Image;



public class LeadPlant extends Critter {


    
    protected void buildGraphics() {
        Image leadplant = new Image(0, 0, "leadplant_stage1.png");
        getGraphics().add(leadplant);
    }
}