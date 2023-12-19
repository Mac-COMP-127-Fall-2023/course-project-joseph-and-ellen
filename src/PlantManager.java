import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlantManager {
    private static ArrayList<ArrayList<Double>> plantFactors;
    private static ArrayList<Double> americanPlumFactors;
    private static ArrayList<Double> blueStemFactors;
    private static ArrayList<Double> commonMilkWeedFactors;
    private static ArrayList<Double> easternBottleBrushGrassFactors;
    private static ArrayList<Double> goldenRodFactors;
    private static ArrayList<Double> leadPlantFactors;
    private static ArrayList<Double> shagBarkHickoryFactors;
    private static ArrayList<Double> stJohnWortFactors;
    private static ArrayList<Double> sumacFactors;
    private static ArrayList<Double> tallMeadowRueFactors;

    public PlantManager() {
        plantFactors = new ArrayList<ArrayList<Double>>();
        americanPlumFactors = new ArrayList<Double>();
        americanPlumFactors.add(30.0); // ideal water in mm
        americanPlumFactors.add(6.0); // ideal sun in hours
        americanPlumFactors.add(1.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        americanPlumFactors.add(1.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(americanPlumFactors);

        blueStemFactors = new ArrayList<Double>();
        blueStemFactors.add(20.0); // ideal water in mm
        blueStemFactors.add(6.0); // ideal sun in hours
        blueStemFactors.add(1.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        blueStemFactors.add(1.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(blueStemFactors);

        commonMilkWeedFactors = new ArrayList<Double>(); 
        commonMilkWeedFactors.add(30.0); // ideal water in mm
        commonMilkWeedFactors.add(7.0); // ideal sun in hours
        commonMilkWeedFactors.add(0.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        commonMilkWeedFactors.add(2.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(commonMilkWeedFactors);

        easternBottleBrushGrassFactors = new ArrayList<Double>();
        easternBottleBrushGrassFactors.add(22.0); // ideal water in mm
        easternBottleBrushGrassFactors.add(6.0); // ideal sun in hours
        easternBottleBrushGrassFactors.add(2.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        easternBottleBrushGrassFactors.add(0.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(easternBottleBrushGrassFactors);

        goldenRodFactors = new ArrayList<Double>(); 
        goldenRodFactors.add(28.0); // ideal water in mm
        goldenRodFactors.add(6.0); // ideal sun in hours
        goldenRodFactors.add(0.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        goldenRodFactors.add(2.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(goldenRodFactors);
       
        leadPlantFactors = new ArrayList<Double>(); 
        leadPlantFactors.add(20.0); // ideal water in mm
        leadPlantFactors.add(6.0); // ideal sun in hours
        leadPlantFactors.add(1.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        leadPlantFactors.add(1.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(leadPlantFactors);

        shagBarkHickoryFactors = new ArrayList<Double>();
        shagBarkHickoryFactors.add(23.0); // ideal water in mm
        shagBarkHickoryFactors.add(7.0); // ideal sun in hours
        shagBarkHickoryFactors.add(0.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        shagBarkHickoryFactors.add(2.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(shagBarkHickoryFactors);

        stJohnWortFactors = new ArrayList<Double>();
        stJohnWortFactors.add(25.4); // ideal water in mm
        stJohnWortFactors.add(6.0); // ideal sun in hours
        stJohnWortFactors.add(1.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        stJohnWortFactors.add(1.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(stJohnWortFactors);

        sumacFactors = new ArrayList<Double>();
        sumacFactors.add(25.4); // ideal water in mm
        sumacFactors.add(7.0); // ideal sun in hours
        sumacFactors.add(0.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        sumacFactors.add(0.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(sumacFactors);

        tallMeadowRueFactors = new ArrayList<Double>();
        sumacFactors.add(33.0); // ideal water in mm
        sumacFactors.add(6.0); // ideal sun in hours
        sumacFactors.add(0.0); // ideal pH (0 = acidic, 1= neutral, 2= basic)
        sumacFactors.add(3.0); // ideal soil type (0 is sand, 1 is loam, 2 is silt, 3 is clay)
        plantFactors.add(tallMeadowRueFactors);
    }
    

    public double getIdealWater(ArrayList<Double> plantFactors) {
        return plantFactors.get(0);
    }

    public double getIdealSunInCycle(ArrayList<Double> plantFactors) {
        return plantFactors.get(1);
    }

    public double getIdealSoilPH(ArrayList<Double> plantFactors) {
        return plantFactors.get(2);
    }

    public double getIdealSoilType(ArrayList<Double> plantFactors) {
        return plantFactors.get(3);
    }
}
