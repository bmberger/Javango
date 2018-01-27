/**
 * The purpose of BuyMovieTickets is to purchase movie tickets for a certain movie on
 * a specific date. The program also takes into consideration the number of tickets, debit card,
 * and PIN. Then, it prints out the e-Receipt. 
 *
 * @author Briana Berger
 * @version 10/06/2017
 */
import java.util.Scanner;
public class BuyMovieTickets
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        //Welcome message and then asks for user information, such as name, date, movie. etc.
        System.out.println("Welcome to Javango, the best place to buy movie tickets!");
        System.out.println("Enter your first and last name:"); 
        String fullName = in.nextLine();
        
        System.out.println("Enter today's date (mm/dd/yyyy):"); 
        String dateToday = in.nextLine();
        
        System.out.println("What movie would you like to see?"); 
        String movieSelection = in.nextLine();
        
        System.out.println("How many tickets? (Only type the number. Ex: 5)"); 
        String ticketNumberInput = in.nextLine();
        
        //Data from ticketNumerInput is parsed into int called ticketNumber.
        int ticketNumber = Integer.parseInt(ticketNumberInput);
        
        System.out.println("What is the ticket price? (Only type the number. Ex: 7.95)"); 
        String ticketPriceInput = in.nextLine();
        
        //Data from ticketPriceInput is parsed into double called ticketPrice.
        double ticketPrice = Double.parseDouble(ticketPriceInput);   
        
        System.out.println("Enter your debit card number (#####-###-####):"); 
        String debitCard = in.nextLine();
        
        System.out.println("Enter your PIN (#####):"); 
        String pinNumberInput = in.nextLine();
        
        //Data from pintNumberInput is parsed into int called pinNumber.
        int pinNumber = Integer.parseInt(pinNumberInput); 
        
        System.out.println("Would you need any accomodations for a medical purpose?"); 
        String accomodationResponse = in.nextLine();
        
        System.out.println();
        
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        
        //The following code prints out the user's Javango e-Receipt
        System.out.println("Your Javango e-Receipt");
        
        System.out.println();
        
        /**
         * Using  the index of the first space in the full name, I used the substring from the 
         * space to the end of the string to get the last name.
         */
        int spaceIndex = fullName.indexOf(" ");
        String lastName = fullName.substring(spaceIndex + 1);
        
        //formattedDateToday allows us to take the original input and change the / to -.
        String formattedDateToday = dateToday.replaceAll("/", "-");
        System.out.println(formattedDateToday);
        
        //The order number is a mix of the card number and last name, thus we used substrings to get those values.
        String orderNumber = lastName.substring(1, 3) + debitCard.substring(6, 9);
        System.out.println("Order Number: " + orderNumber);
        
        System.out.println();
        
        //Using substrings and the input, we were able to show and cover the debit card number.
        String initialFirstName = fullName.substring(0,1);
        System.out.println("  " + initialFirstName + ". " + lastName);
        System.out.println("  Account: " + "#####-###-" + debitCard.substring(10));
        
        //Printing out basic selections made.
        System.out.println("  Movie: " + movieSelection);
        System.out.println("  Number of Tickets: " + ticketNumber);
        System.out.println("  Ticket Price: " + ticketPrice);
        System.out.println("  Glad that you enjoyed!");
        
        //Calculates total price of tickets for quanity bought. 
        double totalPrice = ticketNumber * ticketPrice;
        System.out.println();
        
        System.out.println("  $" + totalPrice + " will be debited to your account.");
        
        System.out.println();
        
        System.out.println("  Thank you. Enjoy your movie!");
        
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
    }
}
