
import edu.macalester.graphics.Image;



public class StJohnsWort extends Critter {
    Image stJohnsWort_stage1;
    Image stJohnsWort_stage2;
    Image stJohnsWort_stage3;


    
    protected void buildGraphics() {
        Image stJohnsWort_stage1 = new Image(0, 0, "stjohnswort_stage1.png");
        getGraphics().add(stJohnsWort_stage1);
       

    }
    protected void stage2() {
        Image stJohnsWort_stage2 = new Image(0,0,"stjohnswort_stage2.png");
        getGraphics().add(stJohnsWort_stage2);
    }
    protected void stage3() {
        Image stJohnsWort_stage3 = new Image(0,0,"stjohnswort_stage3.png");
        getGraphics().add(stJohnsWort_stage3);
    }
}
















