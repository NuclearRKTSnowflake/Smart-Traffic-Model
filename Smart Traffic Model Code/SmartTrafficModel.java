import java.util.Timer;
import java.util.Scanner;
/**
 * This class represents a Smart Traffic Model.
 *
 * The Smart Traffic Model will:
1. Increase traffic flow.
2. Decrease fuel usage.
3. Increase safety.
4. Decrease commuting time.
 *  
 * @author Sierra Knowles
 * @version 1
 */
public class SmartTrafficModel{
    private static int numberOfCars;
    private static int commutingTime;
    private static int numberOfAccidents;
    private static int milesPerGallon;
    /**
     * This method creates the Smart Traffic Model.
     * 
     * @param numCars - The number of cars passing through the stoplight/intersection.
     * @param comTime - The amount of time it takes for a car to commute from Point A to Point B.
     * @param numAccidents - The number of accidents at the stoplight/intersection.
     * @param mpg - The gas mileage (mpg) of the cars passing through the stoplight/intersection. 
     */
    public SmartTrafficModel(int numCars, int comTime, int numAccidents, int mpg){
        numCars = numberOfCars;
        comTime = commutingTime;
        numAccidents = numberOfAccidents;
        mpg = milesPerGallon;
    }

    /**
     * This method runs the program.
     */
    public static void main(String[] args){
        Scanner kbReader = new Scanner(System.in);
        String input = "";
        String name = "";
        String trafficFlow = "";;
        String timeOfDay = "";
        boolean run = true;
        System.out.println("Welcome to the Smart Traffic Model. Type \"exit\" to exit at any time during the program.");
        System.out.println("What is your name?");
        input = kbReader.nextLine();
        if(input.equalsIgnoreCase("exit")){
            run = false;
        }
        while(run){
            if(input.equalsIgnoreCase("exit")){
                run = false;
            }
            else{
                name = input;
                System.out.println("Thank you, " + name + ". Please select the time of day.");
                System.out.println("Your choices are:");
                System.out.println("morning(5:00 A.M. to 9:00 A.M.");//Heavy Rush Hour
                System.out.println("late morning/afternoon(9:00 P.M. to 2:00 P.M.)");//No Rush Hour
                System.out.println("late afternoon(2:00 P.M. to 4:00 P.M.)");//Rush Hour
                System.out.println("evening(5:00 P.M. to 8:00 P.M.)");//Heavy Rush Hour
                System.out.println("night/early morning(8:00 P.M. to 4:00 A.M.)");//No Rush Hour
                input = kbReader.nextLine();
                if(input.equalsIgnoreCase("exit")){
                    run = false;
                }
                else if(input.equalsIgnoreCase("morning")){
                    trafficFlow = "heavy";
                    timeOfDay = "morning";
                    System.out.println("Before SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageBefore());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore());
                    System.out.println("After SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageAfter());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter());
                }
                else if(input.equalsIgnoreCase("late morning/afternoon")){
                    trafficFlow = "light";
                    timeOfDay = "late morning/afternoon";
                    System.out.println("Before SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageBefore());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore());
                    System.out.println("After SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageAfter());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter());
                }
                else if(input.equalsIgnoreCase("late afternoon")){
                    trafficFlow = "moderate";
                    timeOfDay = "late afternoon";
                    System.out.println("Before SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageBefore());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore());
                    System.out.println("After SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageAfter());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter());
                }
                else if(input.equalsIgnoreCase("evening")){
                    trafficFlow = "heavy";
                    timeOfDay = "evening";
                    System.out.println("Before SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageBefore());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore());
                    System.out.println("After SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageAfter());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter());
                }
                else if(input.equalsIgnoreCase("night/early morning")){
                    trafficFlow = "light";
                    timeOfDay = "night";
                    System.out.println("Before SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageBefore());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore());
                    System.out.println("After SMT is applied:");
                    System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay));
                    System.out.println("Gas Mileage: " + measureGasMileageAfter());
                    System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter());
                }
                else{
                    System.out.println("Sorry, the SMT cannot interpret your input. Please try again.");
                }
            }
        }
    }

    /**
     * This method measures the commuting time that one car takes to commute from Point A to Point B during the scenario/simulation before the SMT is applied.
     */
    public static int measureCommutingTimeBefore(String timeOfDay){
        if(timeOfDay == "morning"){
            commutingTime = 60;
        }
        else if(timeOfDay == "late morning/afternoon"){
            commutingTime = 30;
        }
        else if(timeOfDay == "late afternoon"){
            commutingTime = 45;
        }
        else if(timeOfDay == "evening"){
            commutingTime = 60;
        }
        else if(timeOfDay == "night"){
            commutingTime = 30;
        }
        return commutingTime;
    }

    /**
     * This method measures the gas mileage (mpg) of the cars from Point A to Point B during the scenario/simulation before the SMT is applied.
     */
    public static int measureGasMileageBefore(){
        int milesDriven = 25;
        int gasUsed;
        return milesDriven;
        //Gas varies with traffic flow.
        //Divide gas
    }

    /**
     * This method measures the number of accidents that occured during the scenario/simulation before the SMT is applied.
     */
    public static int measureNumberOfAccidentsBefore(){
        int numAccidents = 0;;
        return numAccidents;
        //Approximate number of accidents.
    }
    
    /**
     * This method measures the commuting time that one car takes to commute from Point A to Point B during the scenario/simulation after the SMT is applied.
     */
    public static int measureCommutingTimeAfter(String timeOfDay){
        if(timeOfDay == "morning"){
            commutingTime = 60;
        }
        else if(timeOfDay == "late morning/afternoon"){
            commutingTime = 30;
        }
        else if(timeOfDay == "late afternoon"){
            commutingTime = 45;
        }
        else if(timeOfDay == "evening"){
            commutingTime = 60;
        }
        else if(timeOfDay == "night"){
            commutingTime = 30;
        }
        return commutingTime;
    }

    /**
     * This method measures the gas mileage (mpg) of the cars from Point A to Point B during the scenario/simulation after the SMT is applied.
     */
    public static int measureGasMileageAfter(){
        int milesDriven = 25;
        int gasUsed;
        return milesDriven;
        //Gas varies with traffic flow.
        //Divide gas
    }

    /**
     * This method measures the number of accidents that occured during the scenario/simulation after the SMT is applied.
     */
    public static int measureNumberOfAccidentsAfter(){
        int numAccidents = 0;;
        return numAccidents;
        //Approximate number of accidents.
    }
}
