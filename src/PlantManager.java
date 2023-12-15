import java.util.ArrayList;

public class PlantManager {
    private final double idealWater; // in mm
    private final double idealSun; // in hours
    private final double idealNitrogen; // in ppm
    private final double idealPhosphorous; // in ppm
    private final double idealPotassium; // in ppm
    private final double idealCalcium; // in ppm
    private final double ideallMagnesium; // in ppm
    private final double idealSulphur; // in ppm
    private final double idealPH; // 0 = acidic, 1= neutral, 2= basic
    private final double idealSoilType; // 1 is sand, 2 is silt, 3 is loam, 4 is clay
    private ArrayList<ArrayList<Double>> plantFactors;

    PlantManager(idealWater, idealSun, idealNitrogen, idealPhosphorous, idealPotassium, idealCalcium, idealMagnesium, idealSulphur, idealPH, idealSoilType) {
        plantFactors = new ArrayList<ArrayList<Double>>;
    }

    public ArrayList<Double> americanPlumFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> blueStemFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> commonMilkWeedFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> easternBottleBrushGrassFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> goldenRodFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> leadPlantFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> shagBarkHickoryFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> stJohnWortFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> sumacFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }

    public ArrayList<Double> tallMeadowRueFactors() {
        idealWater = 25.4;
        idealSun = 6;
        idealNitrogen = 60;
        idealPhosphorous = 60;
        idealPotassium = 60;
        idealCalcium = 485;
        ideallMagnesium = 50;
        idealSulphur = 15;
        idealPH = 1;
        idealSoilType = 1;
    }
}
