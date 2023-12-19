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
    private double soilPH; // 0 = acidic, 1= neutral, 2= basic
    private double soilType; // 1 is sand, 2 is silt, 3 is loam, 4 is clay
    private ArrayList<Double> environmentalFactors;

    public EnvironmentalFactors(
        double rainInCycle, 
        double waterTotal, 
        double sunInCycle, 
        double soilPH, 
        double soilType) {
        this.rainInCycle = rainInCycle;
        this.waterTotal = waterTotal;
        this.sunInCycle = sunInCycle;
        this.soilPH = soilPH;
        this.soilPH = soilPH;
    }

    public void newRandomEnvFactors() {
        waterTotal = (Math.random() * (58 - 18)) + 18; // ranges from 58 to 18
        soilPH = (Math.random() * (2)); // range from 2 to 1
        soilType = (Math.random() * (3)); // range from 3 to 1
        

        }
    public void rain() {
        if (Math.random() <= 0.1) {
            rainInCycle = (Math.random() * (8 - 1)) + 1; // range from 8 to 1
            waterTotal = waterTotal + rainInCycle;
        }
    }

    public void sunInCycleRandom() {
        sunInCycle = (Math.random() * (14.5 - 2.5)) + 2.5; // range from 8 to 1
    }

    // public double getRainInCycle() {
    //     return rainInCycle;
    // }

    public double getWaterTotal() {
        return waterTotal;
    }

    public double getSunInCycle() {
        return sunInCycle;
    }

    public double getSoilPH() {
        return soilPH;
    }

    public double getSoilType() {
        return soilType;
    }

    public void loseWater() {
        waterTotal = waterTotal - 1;
    }

}
