import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlantManager {
    public ArrayList<ArrayList<Double>> plantFactors;
    public ArrayList<Double> americanPlumFactors;
    public ArrayList<Double> blueStemFactors;
    public ArrayList<Double> commonMilkWeedFactors;
    public ArrayList<Double> easternBottleBrushGrassFactors;
    public ArrayList<Double> goldenRodFactors;
    public ArrayList<Double> leadPlantFactors;
    public ArrayList<Double> shagBarkHickoryFactors;
    public ArrayList<Double> stJohnWortFactors;
    public ArrayList<Double> sumacFactors;
    public ArrayList<Double> tallMeadowRueFactors;

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
    

    public double getIdealWater(int plantFactorIndex) {
        return plantFactors.get(plantFactorIndex).get(0);
    }

    public double getIdealSunInCycle(int plantFactorIndex) {
        return plantFactors.get(plantFactorIndex).get(1);
    }

    public double getIdealSoilPH(int plantFactorIndex) {
        return plantFactors.get(plantFactorIndex).get(2);
    }

    public double getIdealSoilType(int plantFactorIndex) {
        return plantFactors.get(plantFactorIndex).get(3);
    }
}
