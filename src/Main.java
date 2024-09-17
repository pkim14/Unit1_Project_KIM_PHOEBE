//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("------------------------------------------------------------------");
        System.out.println("| Do not use any symbols when inputting data please! (No $ or %) |");
        System.out.println("------------------------------------------------------------------");


        System.out.print("Enter your bill ($): ");
        String bill = s.nextLine();
        System.out.print("Tip Percent: ");
        String tip = s.nextLine();
        System.out.print("Number of People: ");
        String people = s.nextLine();
        System.out.println();
        System.out.println();


        final Double totalBill = Double.parseDouble(bill);
        final Integer tipPercent = Integer.parseInt(tip);
        final Integer numPeople = Integer.parseInt(people);

        double totalTip = ((double)tipPercent/100 * totalBill);
        double totalWithTip = totalBill + totalTip;
        double tipPerPerson = totalTip / numPeople;
        double totalPerPerson = totalWithTip / numPeople;


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
