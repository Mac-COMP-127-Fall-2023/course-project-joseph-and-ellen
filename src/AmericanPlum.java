import edu.macalester.graphics.Image;



public class AmericanPlum extends Critter {


    
    protected void buildGraphics() {
        Image americanplum = new Image(0, 0, "americanplum_stage1.png");
        getGraphics().add(americanplum);
    


   
}}


// import edu.macalester.graphics.Image;

// public class AmericanPlum extends Critter {

//     private int growthStage; // Add a field to keep track of the growth stage

//     public AmericanPlum() {
//         super();
//         this.growthStage = 1; // Initial growth stage
//     }

//     protected void buildGraphics() {
//         // Set the initial image based on the growth stage
//         updateGraphics();
//     }

//     // Add a method to update the graphics based on the growth stage
//     private void updateGraphics() {
//         if (growthStage == 1) {
//             getGraphics().removeAll(); // Remove previous graphics
//             Image americanPlum1 = new Image(0, 0, "americanplum_stage1.png");
//             getGraphics().add(americanPlum1);
//         } else if (growthStage == 2) {
//             getGraphics().removeAll(); // Remove previous graphics
//             Image americanPlum2 = new Image(0, 0, "americanplum_stage2.png");
//             getGraphics().add(americanPlum2);
//         }
//     }

//     // Add a method to change the growth stage
//     public void nextDay() {
//         growthStage++;
//         if (growthStage > 2) {
//             growthStage = 2; // Cap growth stage at 2
//         }
//         updateGraphics();
//     }
// }
