/* Chimaobi Onwuka
 * Minutes.java
/**
 * This program converts a number of days and weeks into the
 * equivalent number of minutes
 * 
 * @author: <Chimaobi Onwuka>
 * @date: <2/4/22>
 */

import java.util.Scanner;

public class Minutes
{
    
    public static void main(String[] args)
    {
        //Create a scanner to gather inputs
        Scanner AIinput = new Scanner(System.in);

        //Variables Initialization
        int totalMinutes = 0;
        int calculationDays = 0;
        int calculationWeeks = 0;
        int givenDays = 0;
        int givenWeeks = 0;
        final int minutesInWeek = 10080;
        final int minutesInDay = 1440;

        //Terminal Interface
        System.out.println("Hello, Welcome to the Weeks and Days to Minutes Calculator. What may I call you?");
        String nameOfuser = AIinput.nextLine();
        System.out.println("Nice to meet you " + nameOfuser+ "." 
        + " How many (weeks and days) would you like to convert to minutes?" + " First, type the amount of weeks,"
        + " then wait for me to request extra days if any exist.");
        givenWeeks = AIinput.nextInt();
        System.out.println("Thank you. Are there any more additional days to add to the " 
        + givenWeeks + " week(s). If so type the amount of days, otherwise put 0.");
        givenDays = AIinput.nextInt();
    
        //Weeks and Minutes to Days calculation
        calculationWeeks = (givenWeeks * minutesInWeek); // Amount of minutes there are in the given weeks
        calculationDays = (givenDays * minutesInDay); // Amount of minutes htere are inn the given days
        totalMinutes = (calculationWeeks + calculationDays);

        System.out.println("There are " + totalMinutes + " minutes in " + givenWeeks + " week(s) " +  "and " + givenDays +" day(s).");
    }
}
 
