
import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.ui.Button;
import java.awt.Color;


import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;


public class YouPlant {
    CanvasWindow canvas = new CanvasWindow("You Plant", 100, 50);
    static final int MAX_DAYS = 100;
    

  
    // public static run() {
        
   
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

      public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("You Plant", 800, 500);
        Soil soil = new Soil(0,350,800,250);
        soil.setFillColor(Color.GREEN);
        canvas.add(soil);
        // YouPlant game = new YouPlant();
        canvas.draw();
        
   

    }


    
}
