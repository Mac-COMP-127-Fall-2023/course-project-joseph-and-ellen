import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Rectangle;
import edu.macalester.graphics.ui.Button;
import java.awt.Color;


import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;

public class EnvironmentalFactors extends ArrayList<Double> {
    private double rainInCycle; // in mm
    private double waterTotal;// in mm
    private double sunInCycle; // in hours
    private double sunTotal; // in hours
    private double soilNitrogen; // in ppm
    private double soilPhosphorous; // in ppm
    private double soilPotassium; // in ppm
    private double soilCalcium; // in ppm
    private double soilMagnesium; // in ppm
    private double soilSulphur; // in ppm
    private double soilPH; // 0 = acidic, 1= neutral, 2= basic
    private double soilType; // 1 is sand, 2 is silt, 3 is loam, 4 is clay
    private ArrayList<Double> eF;
    private Rectangle eFRectangle;

    public EnvironmentalFactors() {
        eF = new EnvironmentalFactors();
        eF.add(rainInCycle);
        eF.add(waterTotal);
        eF.add(soilPH);
        eF.add(soilPH);
        eF.add(sunInCycle);
        eF.add(sunTotal);
        eF.add(soilNitrogen);
        eF.add(soilPhosphorous);
        eF.add(soilPotassium);
        eF.add(soilCalcium);
        eF.add(soilMagnesium);
        eF.add(soilSulphur);
        eF.add(soilType);
    }

    public void newRandomEnvFactors() {
        waterTotal = (Math.random() * (58 - 18)) + 18; // ranges from 58 to 18
        soilNitrogen = (Math.random() * (75 - 35)) + 35;
        soilPhosphorous = (Math.random() * (58 - 32)) + 32;
        soilPotassium = (Math.random() * (55 - 35)) + 35;
        soilCalcium = (Math.random() * (700 - 300)) + 300;
        soilMagnesium = (Math.random() * (70 - 30)) + 30;
        soilSulphur = (Math.random() * (20 - 10)) + 10;
        soilPH = (Math.random() * (2));
        soilType = (Math.random() * (3));
        

        }
    public boolean Rain() {
        if (Math.random() <= 0.1) {
            System.out.println("It rained Today!");
            rainInCycle = (Math.random() * (8 - 1)) + 1;
            waterTotal += rainInCycle;
            return true;
        }
        return false;
    }

    public void sunInCycleRandom() {
        sunInCycle = (Math.random() * (14.5 - 2.5)) + 2.5;
    }
}
