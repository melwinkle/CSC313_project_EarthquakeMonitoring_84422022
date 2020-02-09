package galamseys;

import java.util.Scanner;
/**
 * 
 * @author LENOVO LAPTOP
 *
 */

public class Galamsey {
	private String vegetation_color;
	private static int Color_value;
	private int year;
	
	

	private static class Position {
		private int latitude;
		private int longitude;
		
		private Position(){
			latitude = 0;
			longitude=0; 
		}

		private Position(int latitude2, int longitude2) {
			this.latitude=latitude2;
			this.longitude=longitude2;
			
		}

		
}	
		
public Galamsey() {
	
}


public Galamsey(String vegetation_color, int Color_value, int year, int latitude,int longitude) {
	this.vegetation_color = vegetation_color;
	this.Color_value=Color_value;
	this.year=year;
	Position position = new Position (latitude, longitude);
	position.latitude=latitude;
	position.longitude=longitude;
}


/**
 * @return the vegetation_color
 */



public String getVegetation_color() {
	return vegetation_color;
}


/**
 * @param vegetation_color the vegetation_color to set
 */


public void setVegetation_color(String vegetation_color) {
	this.vegetation_color = vegetation_color;
}


/**
 * @return the color_value
 */


public static int getColor_value() {
	return Color_value;
}


/**
 * @param color_value the color_value to set
 */
public void setColor_value(int color_value) {
	Color_value = color_value;
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


/**
 * @return the position
 */

	/**
	 * This returns the position of the observatory
	 * @param latitude
	 * @param longitude
	 */
	public void setPosition(int latitude,int longitude) {
	latitude = latitude;
	longitude=longitude;
}

/**
 * 
 * @return GalamseyDets
 */
public String GalamseyDetails() {
	String GalamseyDets = "The vegetation color is " + this.getVegetation_color() + "\n" +
						 "The color value is " + this.getColor_value() + "\n" +
						// "The position is " + this.getPosition() +" \n" +
						 "The year in which it happened is" + this.getYear() + "\n";
	return GalamseyDets;
						
			}


	
	
	
	
	
	




	

}


