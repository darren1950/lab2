
package comp1451.lab2a.darrenlupul;


/**
 * @author A01035909
 *
 */
public class Date {


	private int day;
	private int month;
	private int year;
	
	private String dayName;
	
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}




	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}




	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}




	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}




	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}




	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	// method to calculate and return name of the day of week
	
	public String getDayOfWeek() {
		
		this.month = getMonth();
		this.day = getDay();
		this.year = getYear();
		

		
		
		
		//algorithm to determine gay of week
		int dayOfWeekCalc;
		int twoDigitYear;
		int twelvesInTwoDigitYear;
		int twelvesRemainder;
		int foursInThatRemainder;
		int dayOfMonth;
		int monthCode = 100;
		String dayName = "Testing";
		
		
		//extract the last two digits of the year by modulo 100
		twoDigitYear = this.year % 100;
		twelvesInTwoDigitYear = twoDigitYear/12;
		twelvesRemainder = twoDigitYear % 12;
		foursInThatRemainder = twelvesRemainder/4;
		dayOfMonth = this.day;

		if (this.month == 1)
			{ monthCode = 1; }
		if (this.month == 2)  
			{ monthCode = 4; }
		if (this.month == 3) 
			{ monthCode = 4; }
		if (this.month == 4)  
			{ monthCode = 0; }
		if (this.month == 5) 
			{ monthCode = 2; }
		if (this.month == 6)  
			{ monthCode = 5; }
		if (this.month == 7) 
			{ monthCode = 0; }
		if (this.month == 8) 
			{ monthCode = 3; }
		if (this.month == 9) 
			{ monthCode = 6; }
		if (this.month == 10)
			{ monthCode = 1; }
		if (this.month == 11) 
			{ monthCode = 4; }
		if (this.month == 12) 
			{ monthCode = 6; }
		

		
		if ( isLeapYear())
		{
		if (this.year >= 1900 && this.year < 2000)
		{
			if (this.month == 1 || this.month == 2)
			{ monthCode = monthCode - 1; }
		}
		}
		
		if ( this.year >= 1600 && this.year <1700 )
		{
			monthCode = monthCode + 6;
		}
		
		if ( this.year >= 1700 && this.year <1800 )
		{
			monthCode = monthCode + 4;
		}
		
		if ( this.year >= 1800 && this.year <1900 )
		{
			monthCode = monthCode + 2;
		}
		
		if ( this.year >= 2000 && this.year <2100 )
		{
			monthCode = monthCode + 6;
		}
		
		if ( this.year >= 2100 && this.year <2200 )
		{
			monthCode = monthCode + 5;
		}
		
		

		
		// add the running calculations together and mod by 7
		
		dayOfWeekCalc = (twelvesInTwoDigitYear + twelvesRemainder + foursInThatRemainder + dayOfMonth + monthCode) % 7;
		
		if (dayOfWeekCalc == 0)
			{ dayName = "Saturday"; }
		if (dayOfWeekCalc == 1)
			{ dayName = "Sunday"; }	
		if (dayOfWeekCalc == 2)
			{ dayName = "Monday"; }
		if (dayOfWeekCalc == 3)
			{ dayName = "Tuesday"; }
		if (dayOfWeekCalc == 4)
			{ dayName = "Wednesday"; }
		if (dayOfWeekCalc == 5)
			{ dayName = "Thursday"; }
		if (dayOfWeekCalc == 6)
			{ dayName = "Friday"; }
		
		
		

		
		
		
		
		
		
		

		return dayName;
		
	}
	
	
	private boolean isLeapYear() {
		
		boolean leapYear;
		
		if ( getYear() % 4 != 0) {
				leapYear = false;
		}
		else if (getYear() % 100 != 0) {
				leapYear = true;
		} 
		
		else if (getYear() % 400 != 0) {
				leapYear = false;
			} 
		else {
				leapYear = true;
			}
		
		return 	leapYear;
			
		}
		
		



	
	
}
	