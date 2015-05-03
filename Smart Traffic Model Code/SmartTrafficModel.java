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
                    System.out.println("Thank you for using the SMT.");
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
                        System.out.println("Thank you for using the SMT.");
                        run = false;
                    }
                    else if(input.equalsIgnoreCase("morning")){
                        trafficFlow = "heavy";
                        timeOfDay = "morning";
                        System.out.println("");
                        System.out.println("Before SMT is applied (Approximated Calculations):");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
                        System.out.println("");
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("late morning/afternoon")){
                        trafficFlow = "light";
                        timeOfDay = "late morning/afternoon";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
                        System.out.println("");
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("late afternoon")){
                        trafficFlow = "moderate";
                        timeOfDay = "late afternoon";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
                        System.out.println("");
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("evening")){
                        trafficFlow = "heavy";
                        timeOfDay = "evening";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
                        System.out.println("");
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("night/early morning")){
                        trafficFlow = "light";
                        timeOfDay = "night";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
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
                        System.out.println("Thank you for using the SMT.");
                        run = false;
                    }
                    else if(input.equalsIgnoreCase("morning")){
                        trafficFlow = "heavy";
                        timeOfDay = "morning";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
                        System.out.println("");
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("late morning/afternoon")){
                        trafficFlow = "light";
                        timeOfDay = "late morning/afternoon";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
                        System.out.println("");
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("late afternoon")){
                        trafficFlow = "moderate";
                        timeOfDay = "late afternoon";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
                        System.out.println("");
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("evening")){
                        trafficFlow = "heavy";
                        timeOfDay = "evening";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
                        System.out.println("");
                        //exportAsHTML(trafficFlow, timeOfDay, citySetting);
                    }
                    else if(input.equalsIgnoreCase("night/early morning")){
                        trafficFlow = "light";
                        timeOfDay = "night";
                        System.out.println("");
                        System.out.println("Before SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeBefore(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasBefore(trafficFlow, citySetting));
                        System.out.println("After SMT is applied:");
                        System.out.println("Commuting Time: " + measureCommutingTimeAfter(trafficFlow, citySetting));
                        System.out.println("Gas Mileage: " + measureCostOfGasAfter(trafficFlow, citySetting));
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
     * @return commutingTime - The approximated commuting time according to the time of day and the city setting.
     */
    public static int measureCommutingTimeBefore(String trafficFlow, String citySetting){
        //4 minutes to go 1 mile w/ traffic.
        //3 minutes to go 1 mile w/o traffic.
        //1 stoplight per block
        //Short city blocks: 20 city blocks per mile (A standard Manhattan City Block is 264 ft by 900 ft)
        //Long city blocks: 10 city blocks per mile
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                commutingTime = 40; //4 minutes per mile
            }
            else if(trafficFlow == "moderate"){
                commutingTime = 60; //80 //40 + (0.50)(40)
            }
            else if(trafficFlow == "heavy"){
                commutingTime = 70; //40 + (0.75)(40)
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
    public static int measureCostOfGasBefore(String trafficFlow, String citySetting){
        //National Average Gas Price (Regular Unleaded) as of : $2.615
        //National Average Gas Mileage of all Cars: 29 MPG
        //0.61 cents per mile.
        int milesDriven;
        int numOfStopLights; 
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
        //Take MPG and divide by price of gas
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
    public static int measureCostOfGasAfter(String trafficFlow, String citySetting){
        gasMileage = bestGasMileage(trafficFlow, citySetting);
        return gasMileage;
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
     * 
     * @return timeTaken - The approximated time it takes to pass through a green stop light.
     */
    public static int timePerMileAtGreenStoplight(String trafficFlow, String citySetting){
        int timeTaken = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                timeTaken = 3; //minutes
            }
            else if(trafficFlow == "moderate"){
                timeTaken = 5; //minutes
            }
            else if(trafficFlow == "heavy"){
                timeTaken = 7; //minutes
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                timeTaken = 2; //minutes
            }
            else if(trafficFlow == "moderate"){
                timeTaken = 3; //minutes
            }
            else if(trafficFlow == "heavy"){
                timeTaken = 4; //minutes
            }
        }
        return timeTaken;
    }

    /**
     * This method approximates the time it takes to wait at a red stop light depending on the traffic flow and city setting.
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return timeTaken - The approximated time taken waiting at a red stop light.
     */
    public static int timePerMileAtRedStoplight(String trafficFlow, String citySetting){
        //Red lights typically don't last longer than 1 1/2 to 2 minutes in heavy traffic.
        int timeTaken = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                timeTaken = 4; //minutes
            }
            else if(trafficFlow == "moderate"){
                timeTaken = 6; //minutes
            }
            else if(trafficFlow == "heavy"){
                timeTaken = 8; //minutes
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                timeTaken = 2; //minutes
            }
            else if(trafficFlow == "moderate"){
                timeTaken = 4; //minutes
            }
            else if(trafficFlow == "heavy"){
                timeTaken = 5; //minutes
            }
        }
        return timeTaken;
    }

    /**
     * This method approximates the amount of gas used to pass through a green stop light depending on the traffic flow and city setting.
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return gasUsed - The approximated gas used at passing through a green stop light.
     */
    public static int costOfGasAtGreenStoplight(String trafficFlow, String citySetting){
        int gasUsed = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                gasUsed = 0;
            }
            else if(trafficFlow == "moderate"){
                gasUsed = 1;
            }
            else if(trafficFlow == "heavy"){
                gasUsed = 2;
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                gasUsed = 0;
            }
            else if(trafficFlow == "moderate"){
                gasUsed = 0;
            }
            else if(trafficFlow == "heavy"){
                gasUsed = 1;
            }
        }
        return gasUsed;
    }

    /**
     * This method approximates the amount of gas used at a red stop light depending on traffic flow and city setting.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return gasUsed - The approximated gas wasted while idling at a red light.
     */
    public static int costOfGasAtRedStoplight(String trafficFlow, String citySetting){
        //National Average Gas Price (Regular Unleaded) as of : $2.615
        //National Average Gas Mileage of all Cars: 29 MPG
        int gasUsed = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                gasUsed = 0; //0.0125
            }
            else if(trafficFlow == "moderate"){
                gasUsed = 0; //0.0236
            }
            else if(trafficFlow == "heavy"){
                gasUsed = 0; //0.0333
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                gasUsed = 0; //0.008333
            }
            else if(trafficFlow == "moderate"){
                gasUsed = 0; //0.01666
            }
            else if(trafficFlow == "heavy"){
                gasUsed = 0; //0.02777
            }
        }
        return gasUsed;
    }

    /**
     * This method approximates the number of crashes at a green stop light depending on the traffic flow and city setting.
     * 
     * @param trafficFlow - The traffic flow depending on time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return numberOfCrashes - The approximated amount of crashes passing through a green stop light.
     */
    public static int numberOfAccidentsAtGreenStoplight(String trafficFlow, String citySetting){
        int numberOfCrashes = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                numberOfCrashes = 0;
            }
            else if(trafficFlow == "moderate"){
                numberOfCrashes = 1;
            }
            else if(trafficFlow == "heavy"){
                numberOfCrashes = 2;
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                numberOfCrashes = 0;
            }
            else if(trafficFlow == "moderate"){
                numberOfCrashes = 0;
            }
            else if(trafficFlow == "heavy"){
                numberOfCrashes = 1;
            }
        }
        return numberOfCrashes;
    }

    /**
     * This method approximates the number of crashes at a red stop light depending on traffic flow and city setting.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return numberOfCrashes - The approximated gas wasted while idling at a red light.
     */
    public static int numberOfAccidentsAtRedStoplight(String trafficFlow, String citySetting){
        int numberOfCrashes = 0;
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                numberOfCrashes = 0;
            }
            else if(trafficFlow == "moderate"){
                numberOfCrashes = 1;
            }
            else if(trafficFlow == "heavy"){
                numberOfCrashes = 2;
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                numberOfCrashes = 0;
            }
            else if(trafficFlow == "moderate"){
                numberOfCrashes = 0;
            }
            else if(trafficFlow == "heavy"){
                numberOfCrashes = 1;
            }
        }
        return numberOfCrashes;
    }

    //The following methods pertain to different possible traffic light simulations that will allow me to obtain approximate results.

    /**
     * This method representing the "best" traffic simulation.
     * Alternate Red-Green.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return commutingTime - The approximated commuting time for 5 green lights and 5 red lights.
     */
    public static int bestCommutingTime(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                commutingTime = (timePerMileAtRedStoplight("light", "Urban") * 5) + (timePerMileAtGreenStoplight("light", "Urban") * 5);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timePerMileAtRedStoplight("moderate", "Urban") * 5) + (timePerMileAtGreenStoplight("moderate", "Urban") * 5);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timePerMileAtRedStoplight("heavy", "Urban") * 5) + (timePerMileAtGreenStoplight("heavy", "Urban") * 5);
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                commutingTime = (timePerMileAtRedStoplight("light", "Suburban") * 5) + (timePerMileAtGreenStoplight("light", "Suburban") * 5);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timePerMileAtRedStoplight("moderate", "Suburban") * 5) + (timePerMileAtGreenStoplight("moderate", "Suburban") * 5);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timePerMileAtRedStoplight("heavy", "Suburban") * 5) + (timePerMileAtGreenStoplight("heavy", "Suburban") * 5);
            }
        }
        return commutingTime;
    }

    /**
     * This method representing the "best" traffic simulation.
     * Alternate Red-Green for cross traffic.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return commutingTime - The approximated commuting time for 5 green lights and 5 red lights for cross traffic.
     */
    public static int bestCommutingTimeCross(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                commutingTime = (timePerMileAtRedStoplight("light", "Urban") * 5) + (timePerMileAtGreenStoplight("light", "Urban") * 5);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timePerMileAtRedStoplight("moderate", "Urban") * 5) + (timePerMileAtGreenStoplight("moderate", "Urban") * 5);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timePerMileAtRedStoplight("heavy", "Urban") * 5) + (timePerMileAtGreenStoplight("heavy", "Urban") * 5);
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                commutingTime = (timePerMileAtRedStoplight("light", "Suburban") * 5) + (timePerMileAtGreenStoplight("light", "Suburban") * 5);
            }
            else if(trafficFlow == "moderate"){
                commutingTime = (timePerMileAtRedStoplight("moderate", "Suburban") * 5) + (timePerMileAtGreenStoplight("moderate", "Suburban") * 5);
            }
            else if(trafficFlow == "heavy"){
                commutingTime = (timePerMileAtRedStoplight("heavy", "Suburban") * 5) + (timePerMileAtGreenStoplight("heavy", "Suburban") * 5);
            }
        }
        return commutingTime;
    }

    /**
     * This method represents the "best" traffic simulation.
     * Alternate Red-Green.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return gasMileage - The approximated gas mileage for 5 green lights and 5 red lights.
     */
    public static int bestGasMileage(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                gasMileage = (costOfGasAtRedStoplight("light", "Urban") * 5) + (costOfGasAtGreenStoplight("light", "Urban") * 5);
            }
            else if(trafficFlow == "moderate"){
                gasMileage = (costOfGasAtRedStoplight("moderate", "Urban") * 5) + (costOfGasAtGreenStoplight("moderate", "Urban") * 5);
            }
            else if(trafficFlow == "heavy"){
                gasMileage = (costOfGasAtRedStoplight("heavy", "Urban") * 5) + (costOfGasAtGreenStoplight("heavy", "Urban") * 5);
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                gasMileage = (costOfGasAtRedStoplight("light", "Suburban") * 5) + (costOfGasAtGreenStoplight("light", "Suburban") * 5);
            }
            else if(trafficFlow == "moderate"){
                gasMileage = (costOfGasAtRedStoplight("moderate", "Suburban") * 5) + (costOfGasAtGreenStoplight("moderate", "Suburban") * 5);
            }
            else if(trafficFlow == "heavy"){
                gasMileage = (costOfGasAtRedStoplight("heavy", "Suburban") * 5) + (costOfGasAtGreenStoplight("heavy", "Suburban") * 5);
            }
        }
        return gasMileage;
    }

    /**
     * This method represents the "best" traffic simulation.
     * Alternate Red-Green for cross traffic.
     * 
     * @param trafficFlow - The traffic flow depending on the time of day (Light/Moderate/Heavy).
     * @param citySetting - The city setting (Urban/Suburban).
     * 
     * @return gasMileage - The approximated gas mileage for 5 green lights and 5 red lights for cross traffic.
     */
    public static int bestGasMileageCross(String trafficFlow, String citySetting){
        if(citySetting == "Urban"){
            if(trafficFlow == "light"){
                gasMileage = (costOfGasAtRedStoplight("light", "Urban") * 5) + (costOfGasAtGreenStoplight("light", "Urban") * 5);
            }
            else if(trafficFlow == "moderate"){
                gasMileage = (costOfGasAtRedStoplight("moderate", "Urban") * 5) + (costOfGasAtGreenStoplight("moderate", "Urban") * 5);
            }
            else if(trafficFlow == "heavy"){
                gasMileage = (costOfGasAtRedStoplight("heavy", "Urban") * 5) + (costOfGasAtGreenStoplight("heavy", "Urban") * 5);
            }
        }
        else if(citySetting == "Suburban"){
            if(trafficFlow == "light"){
                gasMileage = (costOfGasAtRedStoplight("light", "Suburban") * 5) + (costOfGasAtGreenStoplight("light", "Suburban") * 5);
            }
            else if(trafficFlow == "moderate"){
                gasMileage = (costOfGasAtRedStoplight("moderate", "Suburban") * 5) + (costOfGasAtGreenStoplight("moderate", "Suburban") * 5);
            }
            else if(trafficFlow == "heavy"){
                gasMileage = (costOfGasAtRedStoplight("heavy", "Suburban") * 5) + (costOfGasAtGreenStoplight("heavy", "Suburban") * 5);
            }
        }
        return gasMileage;
    }
}
