// import java.util.ArrayList;
// import java.util.List;

// import edu.macalester.graphics.GraphicsObject;
// import edu.macalester.graphics.ui.Button;
// import java.awt.Color;


// import edu.macalester.graphics.CanvasWindow;
// import edu.macalester.graphics.GraphicsGroup;

// public class EnvironmentalFactors extends ArrayList<Double> {
//     private double waterInCycle; // in mm
//     private double waterTotal;// in mm
//     private double sunInCycle; // in hours
//     private double sunTotal; // in hours
//     private double soilNitrogen; // in ppm
//     private double soilPhosphorous; // in ppm
//     private double soilPotassium; // in ppm
//     private double soilCalcium; // in ppm
//     private double soilMagnesium; // in ppm
//     private double soilSulphur; // in ppm
//     private double soilPH; // 0 = acidic, 1= neutral, 2= basic
//     private double soilType; // 1 is sand, 2 is silt, 3 is loam, 4 is clay
//     private ArrayList<Double> eF;

//     EnvironmentalFactors(soilPH, waterInCycle, sunInCycle, waterTotal, sunTotal, soilNitrogen, soilPhosphorous, soilPotassium, soilCalcium, soilMagnesium, soilSulphur, soilType) {
//         eF = new EnvironmentalFactors();
//         eF.add(soilPH);
//         eF.add(soilPH);
//         eF.add(waterInCycle);
//         eF.add(sunInCycle);
//         eF.add(waterTotal);
//         eF.add(sunTotal);
//         eF.add(soilNitrogen);
//         eF.add(soilPhosphorous);
//         eF.add(soilPotassium);
//         eF.add(soilCalcium);
//         eF.add(soilMagnesium);
//         eF.add(soilSulphur);
//         eF.add(soilType);
//     }

//     public void newRandomEnvFactors() {
//         rainInCycle = Math.random();     // should be between 457.2 and 812.8 (average rainfall in the Midwest is between 18 and 32 inches, these numbers are that converted to mm)
//         }
//     }
// }
