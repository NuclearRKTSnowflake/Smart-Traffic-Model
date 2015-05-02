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
    private static int commutingTime;
    private static int numberOfAccidents;
    private static int gasMileage;
    /**
     * This method creates the Smart Traffic Model.
     * 
     * @param numCars - The number of cars passing through the stoplight/intersection.
     * @param comTime - The amount of time it takes for a car to commute from Point A to Point B.
     * @param numAccidents - The number of accidents at the stoplight/intersection.
     * @param mpg - The gas mileage (mpg) of the cars passing through the stoplight/intersection. 
     */
    public SmartTrafficModel(int comTime, int numAccidents, int mpg){
        comTime = commutingTime;
        numAccidents = numberOfAccidents;
        mpg = gasMileage;
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
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
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return commutingTime - The commuting time according to the time of day and the city setting.
     */
    public static int measureCommutingTimeBefore(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                 commutingTime = 60; //6 minutes per block
            }
            else if(trafficFlow == "moderate"){
                commutingTime = 90; //60 + (0.50)(60)
            }
            else if(trafficFlow == "heavy"){
                 commutingTime = 105; //60 + (0.75)(60)
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                commutingTime = 20; //2 minutes per block
            }
            else if(trafficFlow == "moderate"){
                commutingTime = 30;
            }
            else if(trafficFlow == "heavy"){
                commutingTime = 45; 
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
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return commutingTime - The commuting time according to the time of day and the city setting.
     */
    public static int measureCommutingTimeAfter(String trafficFlow, String citySetting){
       commutingTime = bestCommutingTime(trafficFlow, citySetting);
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
        gasMileage = bestGasMileage(trafficFlow, citySetting);
        return gasMileage;
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
        numberOfAccidents = bestNumberOfAccidents(trafficFlow, citySetting);
        return numberOfAccidents;
    }
    
    ///**
     //* This method creates a webpage representation of the results
     //* 
     //* @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     //* @param timeOfDay - The time of day (Morning/Late Morning-Afternoon/Late Afternoon/Evening/Night)
     //* @param citySetting - The city setting (Urban/Suburban).
     //*/
    //public static void exportAsHTML(String trafficFlow, String timeOfDay, String citySetting){
        //File f = new File("list.html");
        //FileWriter fw = new FileWriter(f);
        //PrintWriter pw = new PrintWriter(fw);
        //pw.println("<!DOCTYPE html>");
        //pw.println("<html>");
        //pw.println("<head>");
        //pw.println("<title>Smart Traffic Model (SMT)</title>");
        //pw.println("</head>");
        //pw.println("<body style = \"background-color:#F0FFFF\">"); //Azure
        //pw.println("<h1 style = \"color:#0C090A\">Smart Traffic Model Results</h1>"); //Night
        //pw.println("<hr/>");
        //pw.println("<ol>");
        //try{ //Is this necessary?
            //pw.println("<li>" + measureCommutingTimeBefore(timeOfDay, citySetting) + "</li>");
            //pw.println("<li>" + measureGasMileageBefore(trafficFlow, citySetting) + "</li>");
            //pw.println("<li>" + measureNumberOfAccidentsBefore(timeOfDay, citySetting) + "</li>");
            //pw.println("<li>" + measureCommutingTimeAfter(timeOfDay, citySetting) + "</li>");
            //pw.println("<li>" + measureGasMileageAfter(trafficFlow, citySetting) + "</li>");
            //pw.println("<li>" + measureNumberOfAccidentsAfter(timeOfDay, citySetting) + "</li>");
        //}
        //catch(IOException e){
            //System.out.println(e.getMessage());
        //}
        //pw.println("</ol>");
        //pw.println("</body>");
        //pw.println("</html>");
        //pw.close();
        //fw.close();
    //}
    
    /**
     * This method approximates the time it takes to pass through a green stop light depending on the traffic flow and city setting.
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int timeAtGreenStoplight(String trafficFlow, String citySetting){
        int timeTaken = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
               timeTaken = 10; //seconds
            }
            else if(trafficFlow == "moderate"){
                timeTaken = 20; //seconds
            }
            else if(trafficFlow == "heavy"){
                timeTaken = 45; //seconds
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                 timeTaken = 5; //seconds
            }
            else if(trafficFlow == "moderate"){
                timeTaken = 10; //seconds
            }
            else if(trafficFlow == "heavy"){
                timeTaken = 30; //seconds
            }
        }
        return timeTaken;
    }
    
    /**
     * This method approximates the time it takes to wait at a red stop light depending on the traffic flow and city setting.
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int timeAtRedStoplight(String trafficFlow, String citySetting){
        //Red lights typically don't last longer than 1 1/2 to 2 minutes in heavy traffic.
        int timeTaken = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                timeTaken = 45; //seconds
            }
            else if(trafficFlow == "moderate"){
                timeTaken = 85; //seconds
            }
            else if(trafficFlow == "heavy"){
                timeTaken = 120; //seconds
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                timeTaken = 30; //seconds
            }
            else if(trafficFlow == "moderate"){
                timeTaken = 60; //seconds
            }
            else if(trafficFlow == "heavy"){
                timeTaken = 100; //seconds
            }
        }
        return timeTaken;
    }

    //The following methods pertain to different possible traffic light simulations that will allow me to obtain approximate results.
    
    /**
     * This method represents the "before" going ten blocks commuting time. 
     * Alternate Red-Green.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int bestCommutingTime(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                commutingTime = (timeAtRedStoplight("light", "Urban") * 5) + (timeAtGreenStoplight("light", "Urban") * 5);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timeAtRedStoplight("moderate", "Urban") * 5) + (timeAtGreenStoplight("moderate", "Urban") * 5);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timeAtRedStoplight("heavy", "Urban") * 5) + (timeAtGreenStoplight("heavy", "Urban") * 5);
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                commutingTime = (timeAtRedStoplight("light", "Suburban") * 5) + (timeAtGreenStoplight("light", "Suburban") * 5);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timeAtRedStoplight("moderate", "Suburban") * 5) + (timeAtGreenStoplight("moderate", "Suburban") * 5);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timeAtRedStoplight("heavy", "Suburban") * 5) + (timeAtGreenStoplight("heavy", "Suburban") * 5);
            }
        }
        return commutingTime;
        //Same for cross traffic.
    }
    
    /**
     * This method represents the "before" going ten blocks gas mileage. 
     * Alternate Red-Green.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int bestGasMileage(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                gasMileage = measureGasMileageBefore("light","Urban");
            }
            else if(trafficFlow == "moderate"){
                gasMileage = measureGasMileageBefore("moderate","Urban");
            }
            else if(trafficFlow == "heavy"){
                gasMileage = measureGasMileageBefore("heavy","Urban");
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                gasMileage = measureGasMileageBefore("light","Suburban");
            }
            else if(trafficFlow == "moderate"){
                gasMileage = measureGasMileageBefore("moderate","Suburban");
            }
            else if(trafficFlow == "heavy"){
                gasMileage = measureGasMileageBefore("heavy","Suburban");
            }
        }
        return gasMileage;
        //Same for cross traffic.
    }
    
    /**
     * This method represents the "before" going ten blocks number of accidents. 
     * Alternate Red-Green.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int bestNumberOfAccidents(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                numberOfAccidents = measureNumberOfAccidentsBefore("light", "Urban");
            }
            else if(trafficFlow == "moderate"){
                numberOfAccidents = measureNumberOfAccidentsBefore("moderate", "Urban");
            }
            else if(trafficFlow == "heavy"){
                numberOfAccidents = measureNumberOfAccidentsBefore("heavy", "Urban");
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                numberOfAccidents = measureNumberOfAccidentsBefore("light", "Suburban");
            }
            else if(trafficFlow == "moderate"){
                numberOfAccidents = measureNumberOfAccidentsBefore("moderate", "Suburban");
            }
            else if(trafficFlow == "heavy"){
                numberOfAccidents = measureNumberOfAccidentsBefore("heavy", "Suburban");
            }
        }
        return numberOfAccidents;
    }
    
    /**
     * This method represents a traffic simulation.
     * Alternate 1 Red-2 Green.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static void betterCommutingTime(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                commutingTime = (timeAtRedStoplight("light", "Urban") * 3) + (timeAtGreenStoplight("light", "Urban") * 7);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timeAtRedStoplight("moderate", "Urban") * 3) + (timeAtGreenStoplight("moderate", "Urban") * 7);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timeAtRedStoplight("heavy", "Urban") * 3) + (timeAtGreenStoplight("heavy", "Urban") * 7);
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                commutingTime = (timeAtRedStoplight("light", "Suburban") * 3) + (timeAtGreenStoplight("light", "Suburban") * 7);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timeAtRedStoplight("moderate", "Suburban") * 3) + (timeAtGreenStoplight("moderate", "Suburban") * 7);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timeAtRedStoplight("heavy", "Suburban") * 3) + (timeAtGreenStoplight("heavy", "Suburban") * 7);
            }
        }
    }
    
    /**
     * This method represents a traffic simulation.
     * Alternate 1 Red-2 Green for cross traffic.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static void betterCommutingTimeCross(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                commutingTime = (timeAtRedStoplight("light", "Urban") * 7) + (timeAtGreenStoplight("light", "Urban") * 3);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timeAtRedStoplight("moderate", "Urban") * 7) + (timeAtGreenStoplight("moderate", "Urban") * 3);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timeAtRedStoplight("heavy", "Urban") * 7) + (timeAtGreenStoplight("heavy", "Urban") * 3);
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                commutingTime = (timeAtRedStoplight("light", "Suburban") * 7) + (timeAtGreenStoplight("light", "Suburban") * 3);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timeAtRedStoplight("moderate", "Suburban") * 7) + (timeAtGreenStoplight("moderate", "Suburban") * 3);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timeAtRedStoplight("heavy", "Suburban") * 7) + (timeAtGreenStoplight("heavy", "Suburban") * 3);
            }
        }
    }
    
    /**
     * This method represents a traffic simulation.
     * Alternate 1 Red-2 Green.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int betterGasMileage(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                gasMileage = measureGasMileageBefore("light","Urban");
            }
            else if(trafficFlow == "moderate"){
                gasMileage = measureGasMileageBefore("moderate","Urban");
            }
            else if(trafficFlow == "heavy"){
                gasMileage = measureGasMileageBefore("heavy","Urban");
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                gasMileage = measureGasMileageBefore("light","Suburban");
            }
            else if(trafficFlow == "moderate"){
                gasMileage = measureGasMileageBefore("moderate","Suburban");
            }
            else if(trafficFlow == "heavy"){
                gasMileage = measureGasMileageBefore("heavy","Suburban");
            }
        }
        return gasMileage;
    }
    
    /**
     * This method represents a traffic simulation.
     * Alternate 1 Red-2 Green for cross traffic.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int betterGasMileageCross(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                gasMileage = measureGasMileageBefore("light","Urban");
            }
            else if(trafficFlow == "moderate"){
                gasMileage = measureGasMileageBefore("moderate","Urban");
            }
            else if(trafficFlow == "heavy"){
                gasMileage = measureGasMileageBefore("heavy","Urban");
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                gasMileage = measureGasMileageBefore("light","Suburban");
            }
            else if(trafficFlow == "moderate"){
                gasMileage = measureGasMileageBefore("moderate","Suburban");
            }
            else if(trafficFlow == "heavy"){
                gasMileage = measureGasMileageBefore("heavy","Suburban");
            }
        }
        return gasMileage;
    }
    
    /**
     * This method represents the "before" going ten blocks number of accidents. 
     * Alternate 1 Red-2 Green.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int betterNumberOfAccidents(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                numberOfAccidents = measureNumberOfAccidentsBefore("light", "Urban");
            }
            else if(trafficFlow == "moderate"){
                numberOfAccidents = measureNumberOfAccidentsBefore("moderate", "Urban");
            }
            else if(trafficFlow == "heavy"){
                numberOfAccidents = measureNumberOfAccidentsBefore("heavy", "Urban");
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                numberOfAccidents = measureNumberOfAccidentsBefore("light", "Suburban");
            }
            else if(trafficFlow == "moderate"){
                numberOfAccidents = measureNumberOfAccidentsBefore("moderate", "Suburban");
            }
            else if(trafficFlow == "heavy"){
                numberOfAccidents = measureNumberOfAccidentsBefore("heavy", "Suburban");
            }
        }
        return numberOfAccidents;
    }
    
    /**
     * This method represents the "before" going ten blocks number of accidents. 
     * Alternate 1 Red-2 Green for cross traffic.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     */
    public static int betterNumberOfAccidentsCross(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                numberOfAccidents = measureNumberOfAccidentsBefore("light", "Urban");
            }
            else if(trafficFlow == "moderate"){
                numberOfAccidents = measureNumberOfAccidentsBefore("moderate", "Urban");
            }
            else if(trafficFlow == "heavy"){
                numberOfAccidents = measureNumberOfAccidentsBefore("heavy", "Urban");
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                numberOfAccidents = measureNumberOfAccidentsBefore("light", "Suburban");
            }
            else if(trafficFlow == "moderate"){
                numberOfAccidents = measureNumberOfAccidentsBefore("moderate", "Suburban");
            }
            else if(trafficFlow == "heavy"){
                numberOfAccidents = measureNumberOfAccidentsBefore("heavy", "Suburban");
            }
        }
        return numberOfAccidents;
    }
}
