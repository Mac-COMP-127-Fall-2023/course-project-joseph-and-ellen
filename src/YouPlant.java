
import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.ui.Button;
import java.awt.Color;




import edu.macalester.graphics.Ellipse;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;




public class YouPlant {
private Brush currentBrush;
private static CanvasWindow canvas;
private final PaintSettingsView paintSettingsView;
private List<Brush> availableBrushes;   
private GraphicsGroup paintLayer;
private double xpos = 0;
private double ypos = 150;
private double SOIL_WIDTH = 800;
private double SOIL_HEIGHT = 500;

        
public YouPlant(){
    

 canvas = new CanvasWindow("You Plant", 800, 500);
        canvas.setBackground(new Color(54, 209, 255));
        canvas.draw();

        Ellipse sun = new Ellipse(700, 20, 60, 60);
        sun.setFillColor(new Color (255,224,63));
        canvas.add(sun);

        Soil soil = new Soil(xpos,ypos,SOIL_WIDTH, SOIL_HEIGHT);
        soil.setFillColor(new Color (46, 125, 40));
        canvas.add(soil);

        paintLayer = new GraphicsGroup();
        canvas.add(paintLayer);

        paintSettingsView = new PaintSettingsView(Color.BLUE, 60);
        canvas.add(paintSettingsView, 8 - paintSettingsView.getBounds().getMinX(), 10);

        availableBrushes = new ArrayList<>();
        availableBrushes.add(new SolidDot());
        availableBrushes.add(new Eraser());

        double yCoordinate = 50;  
        for (Brush brush : availableBrushes) {
            addBrushButton(brush, yCoordinate);
            yCoordinate += 30;  
        }

        canvas.onMouseDown(event -> paint(event.getPosition()));
        canvas.onDrag(event -> paint(event.getPosition()));
    }


//----------------------BRUSH---------------------//
    private void addBrushButton(Brush brush, double y) {
    Button changeBrushButton = new Button(brush.getName());  
    changeBrushButton.setPosition(10, y);
    canvas.add(changeBrushButton);
    changeBrushButton.onClick(() -> {
        currentBrush = brush;
    });
    }
//----------------------BRUSH---------------------//




//----------------------NEXT DAY BTTON---------------------//
private static void addNextDayButton(){
    Button nextDayButton = new Button("Next Day");
    nextDayButton.setPosition(695,470);
    canvas.add(nextDayButton);
}

//----------------------NEXT DAY BTTON---------------------//



//----------------------PAINT METHOD---------------------//
    private void paint(Point location) {
        BrushOptions brushOptions = paintSettingsView.getBrushOptions();
        if (isWithinSoilBounds(location)) {
            currentBrush.apply(paintLayer, location, brushOptions);
        }
    }
    private boolean isWithinSoilBounds(Point location) {
        return location.getX() >= xpos && location.getX() <= xpos + SOIL_WIDTH &&
               location.getY() >= ypos && location.getY() <= ypos + SOIL_HEIGHT;
    }


//----------------------PAINT METHOD---------------------//



      public static void main(String[] args) {
        new YouPlant();
        addNextDayButton();
    }
}


        
   
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

