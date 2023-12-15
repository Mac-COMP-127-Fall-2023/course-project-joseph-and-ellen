import java.awt.Canvas;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.reflections.Reflections;
import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.FontStyle;

import java.awt.geom.Rectangle2D;
// import edu.macalester.comp127.critters.Critter;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.ui.Button;

public class YouPlant {


    private CanvasWindow canvas, canvas1;

    private GraphicsGroup paintLayer;
    private double xpos = 0;
    private double ypos = 150;
    private double SOIL_WIDTH = 800; 
    private double SOIL_HEIGHT = 500;
    private int MAX_DAYS = 100;
    private int numDays;
    private List<Critter> critters;
    private final Random rand = new Random();
    private List<Class<? extends Critter>> critterClasses;
    private static final boolean CAPTIONS_ENABLED = false;



    public YouPlant() {
        mainScreen();
    }

    //---------------CRITTER-----------------------//
    private void loadCritterClasses() {
        Reflections reflections = new Reflections(getClass().getPackage().getName());
        critterClasses = new ArrayList<>(
            reflections.getSubTypesOf(Critter.class));
    }
 

 private Critter addNewCritter() {
    // Critter critter = createRandomCritter();
    Critter critter = createChoosenCritter();

    GraphicsObject g = critter.getGraphics();
    Point point = randLocationFor(critter);
    g.setPosition(point.getX(), point.getY());
    chooseNewGoal(critter);
    // critter.setSpeed(rand.nextDouble() * 20 + 10);

    canvas.add(critter.getGraphics());
    critters.add(critter);
    return critter;
}

private Point randLocationFor(Critter critter) {
    GraphicsObject g = critter.getGraphics();
    Rectangle2D bounds = g.getBounds();
    return new Point(
        rand.nextDouble() * (canvas.getWidth() - (bounds.getWidth() + critter.getxOffset())),
        rand.nextDouble() * (canvas.getHeight() - (bounds.getHeight() + critter.getyOffset()))
    );
}

private Critter createRandomCritter() {
        Class<? extends Critter> critterClass = critterClasses.get(rand.nextInt(critterClasses.size()));
        try {
            Critter critter = critterClass.getConstructor().newInstance();
            if (CAPTIONS_ENABLED) {
                GraphicsText caption = new GraphicsText(critterClass.getSimpleName());
                caption.setFont("Avenir Next", FontStyle.PLAIN, 11);
                critter.getGraphics().add(caption);
                caption.setCenter(
                    critter.getGraphics().getCenter().getX(),
                    critter.getGraphics().getHeight());
            }
            return critter;
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate " + critterClass, e);
        }
    }




    private Critter createChoosenCritter(){
        Class<? extends Critter> critterClass = critterClasses.get(0);
        try {
            Critter critter = critterClass.getConstructor().newInstance();
            if (CAPTIONS_ENABLED) {
                GraphicsText caption = new GraphicsText(critterClass.getSimpleName());
                caption.setFont("Avenir Next", FontStyle.PLAIN, 11);
                critter.getGraphics().add(caption);
                caption.setCenter(
                    critter.getGraphics().getCenter().getX(),
                    critter.getGraphics().getHeight());
            }
            return critter;
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate " + critterClass, e);
        }
    }



    private void chooseNewGoal(Critter critter) {
        critter.setGoal(randLocationInRange(critter.getGraphics()));
    }

    private Point randLocationInRange(GraphicsObject g) {
        double maxRange = 500.0;
        Rectangle2D bounds = g.getBounds();
        edu.macalester.graphics.Point p0 = g.getPosition();
        double dx = rand.nextDouble() * (2.0 * maxRange) - maxRange;
        double dy = rand.nextDouble() * (2.0 * maxRange) - maxRange;
        double forwardProgess = -bounds.getHeight() * 2 - 10;  // critters tend upward, off the top edge of the screen
        return new Point(0, forwardProgess).add(
            Point.max(
                Point.ORIGIN,
                Point.min(
                    new Point(canvas.getWidth() - bounds.getWidth(), canvas.getHeight() - bounds.getHeight()),
                    new Point(p0.getX() + dx, p0.getY() + dy))));
    }



//---------------CRITTER-----------------------//












    private void mainScreen() {
        canvas = new CanvasWindow("You Plant", 800, 500);
        canvas.setBackground(new Color(54, 209, 255));
      

        

        Ellipse sun = new Ellipse(700, 20, 60, 60);
        sun.setFillColor(new Color(255, 224, 63));
        canvas.add(sun);

        Soil soil = new Soil(xpos, ypos, SOIL_WIDTH, SOIL_HEIGHT);
        soil.setFillColor(new Color(46, 125, 40));
        canvas.add(soil);

        
        // loadCritterClasses();
        // critters = new ArrayList<>();
        // for (int n = 0; n < 4; n++)
        // addNewCritter();

       


        addchooseYourPlantButton();

        
 
    }



    
    











    //--------------PLANT OPTIONS---------------------//
    private void addchooseYourPlantButton() {
        Button drawYourPlantButton = new Button("Draw plants");
        drawYourPlantButton.setPosition(5, 10);
        canvas.add(drawYourPlantButton);
        Runnable drawingKitRunnable = new Runnable() {
            @Override
            public void run() {
                plantOptions();

            }
        };

        drawYourPlantButton.onClick(drawingKitRunnable);
    }



private void plantOptions(){

    canvas1 = new CanvasWindow("Plants", 250, 250);
    Button americanplumButton = new Button("American Plum");
    americanplumButton.setPosition(5,10);
    canvas1.add(americanplumButton);
    Image americanplum = new Image(0, 0, "americanplum_stage1.png");
    canvas1.add(americanplum);
    


    Runnable drawPlant = new Runnable() {
            @Override
            public void run() {
                loadCritterClasses();
        critters = new ArrayList<>();
        // for (int n = 0; n < 4; n++)
        addNewCritter();

            }
        };

        americanplumButton.onClick(drawPlant);
    }













    //--------------PLANT OPTIONS---------------------//





     //----------------------Go to the next day button---------------------//
    //  private void nextDayButton() {
    //     Button nextDayButton = new Button("Go to the next day");
    //     nextDayButton.setPosition(15, 10);
    //     canvas1.add(nextDayButton);
    //     Runnable drawingKitRunnable = new Runnable() {
    //         @Override
    //         public void run() {
    //             // numDays += 1;
    //             // for (Plant p : Plants)
                
    //             // if all Environmental Conditions (except pH)
    //         }
    //     }}

     


    public static void main(String[] args) {
        new YouPlant();
    }

 
   
}





//------------------OPTIONS FOR PLANTS------------------------//


















    //     canvas.draw();
        // Add soil to canvas (and background if we add one)
        //Add buttons for options for user: (1) Plant
        // (2) Monitor Soil/Water (3) Go to next day 
        // When User creates a plant, provide them with the options 
        // for the plants (or if it is easier for them to make their own 
        // plants implement that). When user monitors soil/water quality, 
        // collect results from soil and environmental factors 
        // and then provide them the next day
        // option 3 self explanatory
        // record number of plants and plant stage/health in plant manager
        // after max days have passed, stop game and tell user how well 
        // they did

    // }




