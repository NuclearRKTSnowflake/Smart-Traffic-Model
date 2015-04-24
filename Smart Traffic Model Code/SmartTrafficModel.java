import java.util.Scanner;
import java.util.*;
import java.io.*;
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
     * 
     * @param args - Not Used.
     */
    public static void main(String[] args){
        Scanner kbReader = new Scanner(System.in);
        String input = "";
        String name = "";
        String trafficFlow = "";
        String timeOfDay = "";
        String citySetting = "";
        boolean run = true;
        System.out.println("Welcome to the Smart Traffic Model. Type \"exit\" to exit at any time during the program.");
        System.out.println("What is your name?");
        input = kbReader.nextLine();
        name = input;
        if(input.equalsIgnoreCase("exit")){
            run = false;
        }
        while(run){
            if(input.equalsIgnoreCase("exit")){
                run = false;
            }
            else{
                System.out.println("Thank you, " + name + ". Please select city setting.");
                System.out.println("");
                System.out.println("Your choices are:");
                System.out.println("Urban (Downtown)");
                System.out.println("Suburban (Residential Areas)");
                System.out.println("");
                input = kbReader.nextLine();
                if(input.equalsIgnoreCase("exit")){
                    run = false;
                }
                else if(input.equalsIgnoreCase("urban")){
                    citySetting = "Urban";
                    System.out.println("");
                    System.out.println("Please select time of day.");
                    System.out.println("Your choices are:");
                    System.out.println("morning(5:00 A.M. to 9:00 A.M.)");//Heavy Rush Hour
                    System.out.println("late morning/afternoon(9:00 P.M. to 2:00 P.M.)");//No Rush Hour
                    System.out.println("late afternoon(2:00 P.M. to 4:00 P.M.)");//Rush Hour
                    System.out.println("evening(5:00 P.M. to 8:00 P.M.)");//Heavy Rush Hour
                    System.out.println("night/early morning(8:00 P.M. to 4:00 A.M.)");//No Rush Hour
                    System.out.println("");
                    input = kbReader.nextLine();
                    if(input.equalsIgnoreCase("exit")){
                        run = false;
                    }
                    else if(input.equalsIgnoreCase("morning")){
                        trafficFlow = "heavy";
                        timeOfDay = "morning";
                        System.out.println("");
                        System.out.println("Before SMT is applied (Approximated Calculations):");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("late morning/afternoon")){
                        trafficFlow = "light";
                        timeOfDay = "late morning/afternoon";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("late afternoon")){
                        trafficFlow = "moderate";
                        timeOfDay = "late afternoon";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("evening")){
                        trafficFlow = "heavy";
                        timeOfDay = "evening";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("night/early morning")){
                        trafficFlow = "light";
                        timeOfDay = "night";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else{
                        System.out.println("Sorry, the SMT cannot interpret your input. Please try again.");
                    }
                }
                else if(input.equalsIgnoreCase("suburban")){
                    citySetting = "Suburban";
                    System.out.println("");
                    System.out.println("morning(5:00 A.M. to 9:00 A.M.)");//Heavy Rush Hour
                    System.out.println("late morning/afternoon(9:00 P.M. to 2:00 P.M.)");//No Rush Hour
                    System.out.println("late afternoon(2:00 P.M. to 4:00 P.M.)");//Rush Hour
                    System.out.println("evening(5:00 P.M. to 8:00 P.M.)");//Heavy Rush Hour
                    System.out.println("night/early morning(8:00 P.M. to 4:00 A.M.)");//No Rush Hour
                    System.out.println("");
                    input = kbReader.nextLine();
                    if(input.equalsIgnoreCase("exit")){
                        run = false;
                    }
                    else if(input.equalsIgnoreCase("morning")){
                        trafficFlow = "heavy";
                        timeOfDay = "morning";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("late morning/afternoon")){
                        trafficFlow = "light";
                        timeOfDay = "late morning/afternoon";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("late afternoon")){
                        trafficFlow = "moderate";
                        timeOfDay = "late afternoon";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("evening")){
                        trafficFlow = "heavy";
                        timeOfDay = "evening";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("night/early morning")){
                        trafficFlow = "light";
                        timeOfDay = "night";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageBefore(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsBefore(timeOfDay, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(timeOfDay, citySetting));
                        System.out.println("Gas Mileage: " + measureGasMileageAfter(trafficFlow, citySetting));
                        System.out.println("Number of Accidents: " + measureNumberOfAccidentsAfter(timeOfDay, citySetting));
                        System.out.println("");
                        exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else{
                        System.out.println("Sorry, the SMT cannot interpret your input. Please try again.");
                    }
                }
            }
        }
    }

    /**
     * This method measures the commuting time that one car takes to commute from Point A to Point B during the scenario/simulation before the SMT is applied.
     * 
     * @param timeOfDay - The time of day (Morning/Late Morning-Afternoon/Late Afternoon/Evening/Night)
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return commutingTime - The commuting time according to the time of day and the city setting.
     */
    public static int measureCommutingTimeBefore(String timeOfDay, String citySetting){
        if(citySetting == "Urban"){
            if(timeOfDay == "morning"){ //Heavy Rush Hour
                commutingTime = 105; //60 + (0.75)(60)
            }
            else if(timeOfDay == "late morning/afternoon"){ //No Rush Hour
                commutingTime = 60; //6 minutes per block
            }
            else if(timeOfDay == "late afternoon"){ //Rush Hour
                commutingTime = 90; //60 + (0.50)(60)
            }
            else if(timeOfDay == "evening"){ //Heavy Rush Hour
                commutingTime = 105; //60 + (0.75)(60)
            }
            else if(timeOfDay == "night"){ //No Rush Hour
                commutingTime = 60; //6 minutes per block
            }
        }
        else if(citySetting == "Suburban"){
            if(timeOfDay == "morning"){
                commutingTime = 45; 
            }
            else if(timeOfDay == "late morning/afternoon"){
                commutingTime = 20; //2 minutes per block
            }
            else if(timeOfDay == "late afternoon"){
                commutingTime = 30;
            }
            else if(timeOfDay == "evening"){
                commutingTime = 45;
            }
            else if(timeOfDay == "night"){
                commutingTime = 20; //2 minutes per block
            }
        }
        return commutingTime;
    }

    /**
     * This method measures the gas mileage (mpg) of the cars from Point A to Point B during the scenario/simulation before the SMT is applied.
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return gasMileage - The average gas mileage. (Average gas mileage is approximately 25).
     */
    public static int measureGasMileageBefore(String trafficFlow, String citySetting){
        int milesDriven;
        int numOfStopLights; //1 stoplight per block
        //Short city blocks: 20 city blocks per mile (A standard Manhattan City Block is 264 ft by 900 ft)
        //Long city blocks: 10 city blocks per mile
        int gasUsed;
        int gasMileage = 0; //Average across board is approx. 25
        if(citySetting == "Urban"){
            milesDriven = 10; //One Mile is approx. 20 short city blocks or 10 long city blocks.
            numOfStopLights = 200;
            if(trafficFlow == "light"){
                gasUsed = 2;
                gasMileage = milesDriven / gasUsed;
            }
            else if(trafficFlow == "moderate"){
                gasUsed = 5;
                gasMileage = milesDriven / gasUsed;
            }
            else if(trafficFlow == "heavy"){
                gasUsed = 7;
                gasMileage = milesDriven / gasUsed;
            }
        }
        else if(citySetting == "Suburban"){
            milesDriven = 10; //One Mile is 1 sub block.
            numOfStopLights = 10;
            if(trafficFlow == "light"){
                gasUsed = 2;
                gasMileage = milesDriven / gasUsed;
            }
            else if(trafficFlow == "moderate"){
                gasUsed = 5;
                gasMileage = milesDriven / gasUsed;
            }
            else if(trafficFlow == "heavy"){
                gasUsed = 7;
                gasMileage = milesDriven / gasUsed;
            }
        }
        return gasMileage;       
        //Gas varies with traffic flow.
        //Divide gas
        //Calculate gas mileage for all green lights and add on time for every red light.
    }

    /**
     * This method measures the number of accidents that occured during the scenario/simulation before the SMT is applied.
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return numAccidents - The approximate number of accidents before the SMT is applied.
     */
    public static int measureNumberOfAccidentsBefore(String trafficFlow, String citySetting){
        int numAccidents = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                numAccidents = 1;
            }
            else if(trafficFlow == "moderate"){
                numAccidents = 3;
            }
            else if(trafficFlow == "heavy"){
                numAccidents = 5;
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                numAccidents = 0;
            }
            else if(trafficFlow == "moderate"){
                numAccidents = 2;
            }
            else if(trafficFlow == "heavy"){
                numAccidents = 4;
            }
        }
        return numAccidents;
        //Approximate number of accidents.
        //Pull up statistics.
    }

    /**
     * This method measures the commuting time that one car takes to commute from Point A to Point B during the scenario/simulation after the SMT is applied.
     * 
     * @param timeOfDay - The time of day (Morning/Late Morning-Afternoon/Late Afternoon/Evening/Night)
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return commutingTime - The commuting time according to the time of day and the city setting.
     */
    public static int measureCommutingTimeAfter(String timeOfDay, String citySetting){
        if(citySetting == "Urban"){
            if(timeOfDay == "morning"){ //Heavy Rush Hour
                commutingTime = 74; //30% of 105
            }
            else if(timeOfDay == "late morning/afternoon"){ //No Rush Hour
                commutingTime = 42; //30% of 60
            }
            else if(timeOfDay == "late afternoon"){ //Rush Hour
                commutingTime = 63; //30% of 90
            }
            else if(timeOfDay == "evening"){ //Heavy Rush Hour
                commutingTime = 74; //30% of 105
            }
            else if(timeOfDay == "night"){ //No Rush Hour
                commutingTime = 42; //30% of 60
            }
        }
        else if(citySetting == "Suburban"){
            if(timeOfDay == "morning"){
                commutingTime = 32; //30% of 45
            }
            else if(timeOfDay == "late morning/afternoon"){
                commutingTime = 14; //30% of 20
            }
            else if(timeOfDay == "late afternoon"){
                commutingTime = 21; //30% of 30
            }
            else if(timeOfDay == "evening"){
                commutingTime = 32; //30% of 45
            }
            else if(timeOfDay == "night"){
                commutingTime = 14; //30% of 20
            }
        }
        return commutingTime;
    }

    /**
     * This method measures the gas mileage (mpg) of the cars from Point A to Point B during the scenario/simulation after the SMT is applied.
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return gasMileage - The average gas mileage. (Average gas mileage is approximately 25).
     */
    public static int measureGasMileageAfter(String trafficFlow, String citySetting){
        int milesDriven;
        int numOfStopLights; //1 stoplight per block
        //Short city blocks: 20 city blocks per mile (A standard Manhattan City Block is 264 ft by 900 ft)
        //Long city blocks: 10 city blocks per mile
        int gasUsed;
        int gasMileage = 0; //Average across board is approx. 25
        if(citySetting == "Urban"){
            milesDriven = 10; //One Mile is approx. 20 short city blocks or 10 long city blocks.
            numOfStopLights = 200;
            if(trafficFlow == "light"){
                gasUsed = 2;
                gasMileage = milesDriven / gasUsed;
            }
            else if(trafficFlow == "moderate"){
                gasUsed = 4; //5 - 1
                gasMileage = milesDriven / gasUsed;
            }
            else if(trafficFlow == "heavy"){
                gasUsed = 5; //7 - 2
                gasMileage = milesDriven / gasUsed;
            }
        }
        else if(citySetting == "Suburban"){
            milesDriven = 10; //One Mile is 1 sub block.
            numOfStopLights = 10;
            if(trafficFlow == "light"){
                gasUsed = 2;
                gasMileage = milesDriven / gasUsed;
            }
            else if(trafficFlow == "moderate"){
                gasUsed = 4; //5 - 1
                gasMileage = milesDriven / gasUsed;
            }
            else if(trafficFlow == "heavy"){
                gasUsed = 5; //7 - 2
                gasMileage = milesDriven / gasUsed;
            }
        }
        return gasMileage;       
        //Gas varies with traffic flow.
        //Divide gas
        //Calculate gas mileage for all green lights and add on time for every red light.
    }

    /**
     * This method measures the number of accidents that occured during the scenario/simulation after the SMT is applied.
     * 
     * @param trafficFlow - The traffic flow depnding on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return numberOfAccidents - The approximated number of accidents after the SMT is applied.
     */
    public static int measureNumberOfAccidentsAfter(String trafficFlow, String citySetting){
        int numAccidents = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                numAccidents = 0; //1 - 0
            }
            else if(trafficFlow == "moderate"){
                numAccidents = 2; //3 - 2
            }
            else if(trafficFlow == "heavy"){
                numAccidents = 4; //5 - 1
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                numAccidents = 0; //0
            }
            else if(trafficFlow == "moderate"){
                numAccidents = 1; //2 - 1
            }
            else if(trafficFlow == "heavy"){
                numAccidents = 3; // 4 - 1
            }
        }
        return numAccidents;
        //Approximate number of accidents.
        //Pull up statistics.
    }
    
    /**
     * This method creates a webpage representation of the results
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param timeOfDay - The time of day (Morning/Late Morning-Afternoon/Late Afternoon/Evening/Night)
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static void exportAsHTML(String trafficFlow, String timeOfDay, String citySetting){
        File f = new File("list.html");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Smart Traffic Model (SMT)</title>");
        pw.println("</head>");
        pw.println("<body style = \"background-color:#F0FFFF\">");
        pw.println("<h1 style = \"color:#6C2DC7\">Smart Traffic Model Results</h1>");
        pw.println("<hr/>");
        pw.println("<ol>");
        pw.println("<li>" + measureCommutingTimeBefore(timeOfDay, citySetting) + "</li>");
        pw.println("<li>" + measureGasMileageBefore(trafficFlow, citySetting) + "</li>");
        pw.println("<li>" + measureNumberOfAccidentsBefore(timeOfDay, citySetting) + "</li>");
        pw.println("<li>" + measureCommutingTimeAfter(timeOfDay, citySetting) + "</li>");
        pw.println("<li>" + measureGasMileageAfter(trafficFlow, citySetting) + "</li>");
        pw.println("<li>" + measureNumberOfAccidentsAfter(timeOfDay, citySetting) + "</li>");
        pw.println("</ol>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
        fw.close();
    }
}
