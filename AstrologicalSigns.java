import java.util.Scanner;

public class AstrologicalSigns
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
            // Ask user for their birthday
            System.out.print("Enter your birthday (month day): ");
            birthdayMonth = scanner.nextInt();
            birthdayDay = scanner.nextInt();
            if (birthdayMonth >= 1 && birthdayMonth <= 12 && birthdayDay >= 1 && birthdayDay <= 31)
            {
                break;
            }
            System.out.println("Error - Dates must be in numeric format, month day! e.g. 10 31\n");
        }

        if ((birthdayMonth == 3 && birthdayDay >= 21) || (birthdayMonth == 4 && birthdayDay <= 19))
        {
            System.out.print(Art.ZODIAC_ARIES);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Aries" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 4 && birthdayDay >= 20) || (birthdayMonth == 5 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_TAURUS);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Taurus" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_GEMINI);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Gemini" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_CANCER);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Cancer" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_LEO);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Leo" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_VIRGO);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Virgo" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 200))
        {
            System.out.print(Art.ZODIAC_LIBRA);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Libra" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_SCORPIO);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Scorpio" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_SAGITTARIUS);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Sagittarius" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_CAPRICORN);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Capricorn" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_AQUARIUS);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Aquarius" ,birthdayMonth, birthdayDay);
        }
        else if ((birthdayMonth == 5 && birthdayMonth >= 21) || (birthdayMonth == 6 && birthdayDay <= 20))
        {
            System.out.print(Art.ZODIAC_PISCES);
            System.out.printf("Your Astrological Zodiac Sign based on your birthday (s%/s%): Pisces" ,birthdayMonth, birthdayDay);
        }

          // Exit prompt
          System.out.print("\nPress [enter] to exit: ");
          scanner.nextLine();
          scanner.close();
    }
}
