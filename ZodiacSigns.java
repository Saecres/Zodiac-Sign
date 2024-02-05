// Name: Kaitlin Penaranda
// Date: February 1, 2023
// App Name: Astrological Zodiac Signs
// Description: App that tells the user what their zodiac sign is based on their birthday.

import java.util.Scanner;

public class ZodiacSigns
{
    // Constants
    static final String SET_TITLE = "\033]0;%s\007";
    static final String CLEAR_TERMINAL = "\033c";

     // Multiline string
    static final String INPUT_BANNER = """
    
    ===================================
    =    Astrological Zodiac Signs    =
    ===================================
    """;

    public static void main(String[] args)
    {
         // Scanner to read input
         Scanner scanner = new Scanner(System.in);

         // Variables
        int birthdayMonth = 0;
        int birthdayDay = 0;
        String zodiacSign = " ";

        // Set the title
        System.out.printf(SET_TITLE, "Astrological Zodiac Signs - Kaitlin Penaranda");

        // Print banner
        System.out.print(INPUT_BANNER);

        // Program description
        System.out.println("This program will tell your Astrological Zodiac Sign based on your birthday!");

        while (true)
        {
            try
            {
                // Ask user for their birthday
                System.out.print("Enter your birthday (month day): ");

                // Makes sure error message works when month and day are not formatted properly (space/tab)
                String[] input = scanner.nextLine().split("\\s+");

                // Converts string to an int
                birthdayMonth = Integer.parseInt(input[0]);
                birthdayDay = Integer.parseInt(input[1]);

                // Checks if month is 1-12 and if day inputted is 1-31
                if (birthdayMonth >= 1 && birthdayMonth <= 12 && birthdayDay >= 1 && birthdayDay <= 31)
                {
                    break;
                }
                // Error messgae if input is wrong
                System.out.println("Error - Dates must be in numeric format, month day! e.g. 10 31\n");
            }
            // Error message when the string tries to change value into a int or out of bound index
            catch (NumberFormatException | ArrayIndexOutOfBoundsException exception)
            {
                System.out.println("Error - Dates must be in numeric format, month day! e.g. 10 31\n");
            }
        }

        // Calculates their zodiac sign
        if ((birthdayMonth == 3 && birthdayDay >= 21) || (birthdayMonth == 4 && birthdayDay <= 19))
        {
            zodiacSign = "Aries";
        }
        else if ((birthdayMonth == 4 && birthdayDay >= 20) || (birthdayMonth == 5 && birthdayDay <= 20))
        {
            zodiacSign = "Taurus";
        }
        else if ((birthdayMonth == 5 && birthdayDay >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            zodiacSign = "Gemini";
        }
        else if ((birthdayMonth == 6 && birthdayDay >= 21) || (birthdayMonth == 7 && birthdayDay <= 22))
        {
            zodiacSign = "Cancer";
        }
        else if ((birthdayMonth == 7 && birthdayDay >= 23) || (birthdayMonth == 8 && birthdayDay <= 22))
        {
            zodiacSign = "Leo";
        }
        else if ((birthdayMonth == 8 && birthdayDay >= 23) || (birthdayMonth == 9 && birthdayDay <= 22))
        {
            zodiacSign = "Virgo";
        }
        else if ((birthdayMonth == 9 && birthdayDay >= 23) || (birthdayMonth == 10 && birthdayDay <= 22))
        {
            zodiacSign = "Libra";
        }
        else if ((birthdayMonth == 10 && birthdayDay >= 23) || (birthdayMonth == 11 && birthdayDay <= 21))
        {
            zodiacSign = "Scorpio";
        }
        else if ((birthdayMonth == 11 && birthdayDay >= 22) || (birthdayMonth == 12 && birthdayDay <= 21))
        {
            zodiacSign = "Sagittarius";
        }
        else if ((birthdayMonth == 12 && birthdayDay >= 22) || (birthdayMonth == 1 && birthdayDay <= 19))
        {
            zodiacSign = "Capricorn";
        }
        else if ((birthdayMonth == 1 && birthdayDay >= 20) || (birthdayMonth == 2 && birthdayDay <= 18))
        {
            zodiacSign = "Aquarius";
        }
        else if ((birthdayMonth == 2 && birthdayDay >= 19) || (birthdayMonth == 3 && birthdayDay <= 20))
        {
            zodiacSign = "Pisces";
        }

        // Clears terminal and prints input banner
        System.out.print(CLEAR_TERMINAL + INPUT_BANNER);

        // Prints result
        System.out.println("\nYour Astrological Zodiac Sign based on your birthday " + "(" + birthdayMonth + "/" + birthdayDay + "): " + zodiacSign + "\n");

        // BONUS: prints zodiac sign banner
        switch (zodiacSign)
        {
            case "Aries":
            System.out.println(Art.ZODIAC_ARIES);
            break;

            case "Taurus":
            System.out.println(Art.ZODIAC_TAURUS);
            break;

            case "Gemini":
            System.out.println(Art.ZODIAC_GEMINI);
            break;

            case "Cancer":
            System.out.println(Art.ZODIAC_CANCER);
            break;

            case "Leo":
            System.out.println(Art.ZODIAC_LEO);
            break;

            case "Virgo":
            System.out.println(Art.ZODIAC_VIRGO);
            break;

            case "Libra":
            System.out.println(Art.ZODIAC_LIBRA);
            break;
            case "Scorpio":
            System.out.println(Art.ZODIAC_SCORPIO);
            break;

            case "Sagittarius":
            System.out.println(Art.ZODIAC_SAGITTARIUS);
            break;

            case "Capricorn":
            System.out.println(Art.ZODIAC_CAPRICORN);
            break;

            case "Aquarius":
            System.out.println(Art.ZODIAC_AQUARIUS);
            break;

            case "Pisces":
            System.out.println(Art.ZODIAC_PISCES);
            break;
        }

        // Exit prompt
        System.out.print("\nPress [enter] to exit: ");
        scanner.nextLine();
        scanner.close();    
    }
}