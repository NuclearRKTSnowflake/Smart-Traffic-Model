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
    static Scanner kbReader = new Scanner(System.in);
    private int numberOfCars;
    private int commutingTime;
    private int numberOfAccidents;
    private int milesPerGallon;
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
        String input = "";
        boolean run = true;
        System.out.println("Welcome to the Smart Traffic Model");
        System.out.println("Please select the intensity of traffic.");
        System.out.println("Your choices are: light, moderate, heavy");
        input = kbReader.nextLine();
        while(run == true){
            System.out.println("");
            input = kbReader.nextLine();
            System.out.println("");
            readCommand(input);
        }
    }

    /**
     * This method parses and runs the user's command.
     * 
     * @param command - The comand the user types in String form.
     */
    public static void readCommand(String command){
        //Code to read commands
        if(Variables.input.equalsIgnoreCase("light")){
            //Call method
        }
        else if(Variables.input.equalsIgnoreCase("moderate")){
            //Call method
        }
        else if(Variables.input.equalsIgnoreCase("heavy")){
            //Call method
        }
        else{
            System.out.println("");
            System.out.println("Sorry, the Smart Traffic Model is unable to interpret your input.");
            System.out.println("Please try again");
            System.out.println("");
        }
    }

    /**
     * This method measures the commuting time that one car takes to commute from Point A to Point B during the scenario/simulation.
     */
    public void measureCommutingTime(){
    }

    /**
     * This method measures the gas mileage (mpg) of the cars from Point A to Point B during the scenario/simulation.
     */
    public void measureGasMileage(){
    }

    /**
     * This method measures the number of accidents that occured during the scenario/simulation.
     */
    public void measureNumberOfAccidents(){
    }
}