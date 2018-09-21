package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	private String scope(Zodiac z) {
		switch(z) {
		case ARIES:{
			System.out.println("Your birthday will be between March 21 and April 19");
			break;
		}
		case TAURUS:{
			System.out.println("Your birthday will be between April 20 and May 20");
			break;
		}
		case GEMINI:{
			System.out.println("Your birthday will be between May 21 and June 20");
			break;
		}
		case CANCER:{
			System.out.println("Your birthday will be between June 21 and July 22");
			break;
		}
		case LEO:{
			System.out.println("Your birthday will be between July 23 and August 22");
			break;
		}
		case VIRGO:{
			System.out.println("Your birthday will be between August 23 and September 22");
			break;
		}
		case LIBRA:{
			System.out.println("Your birthday will be between September 23 and October 22");
			break;
		}
		case SCORPIO:{
			System.out.println("Your birthday will be between October 23 and November 21");
			break;
		}
		case SAGITTARIUS:{
			System.out.println("Your birthday will be between November 22 and December 21");
			break;
		}
		case CAPRICORN:{
			System.out.println("Your birthday will be between December 22 and January 19");
			break;
		}
		case AQUARIUS:{
			System.out.println("Your birthday will be between January 20 and Febuary 18");
			break;
		}
		case PISCES:{
			System.out.println("Your birthday will be between Febuary 18 and March 20");
			break;
		}
		
		}
		return "hah";
	}
	// 3. Make a main method to test your method
}
