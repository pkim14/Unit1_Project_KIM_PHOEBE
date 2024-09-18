//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// using import Scanner to receive user inputs & parse them into primitive data types
// using import DecimalFormat to convert all doubles into decimals rounded to the 100th place
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // reminding the user not to input any symbols because it will cause errors
        System.out.println("------------------------------------------------------------------");
        System.out.println("| Do not use any symbols when inputting data please! (No $ or %) |");
        System.out.println("------------------------------------------------------------------");

        // all the user inputs needed to calculate total bill
        System.out.print("Enter your bill ($): ");
        String bill = s.nextLine();
        System.out.print("Tip Percent: ");
        String tip = s.nextLine();
        System.out.print("Number of People: ");
        String people = s.nextLine();
        System.out.println();
        System.out.println();

        // converting the inputs into their necessary primitive data types
        final double totalBill = Double.parseDouble(bill);
        final int tipPercent = Integer.parseInt(tip);
        final int numPeople = Integer.parseInt(people);

        // calculating the total tip, the total with tip included, the tip per person, & the total cost per person
        double totalTip = ((double)tipPercent/100 * totalBill);
        double totalWithTip = totalBill + totalTip;
        double tipPerPerson = totalTip / numPeople;
        double totalPerPerson = totalWithTip / numPeople;

        // printing out all the outputs
        System.out.println("----------------------------------");
        System.out.println("Total Tip Amount: $" + df.format(totalTip));
        System.out.println("----------------------------------");

        System.out.println("Total Bill Cost: $" + df.format(totalWithTip));
        System.out.println("----------------------------------");

        System.out.println("Tip Per Person: $" + df.format(tipPerPerson));
        System.out.println("----------------------------------");

        System.out.println("Total Bill Per Person: $" + df.format(totalPerPerson));
        System.out.println("----------------------------------");














    }
    }
