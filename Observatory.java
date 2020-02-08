package earthquakemonitoring;

/**
 *
 * @author Richard
 * @version v.1
 */
public class Observatory {
    private String ObsName;
    private String CountryName;
    private int year;
    private double areaCovered;
    
    /**
     * creating default constructor
     */
    public Observatory(){
        
    }

    /**
     * creating second constructor
     * @param ObsName
     * @param CountryName
     * @param year
     * @param areaCovered
     */
    public Observatory(String ObsName, String CountryName, int year, double areaCovered) {
        this.ObsName = ObsName;
        this.CountryName = CountryName;
        this.year = year;
        this.areaCovered = areaCovered;
    }

    /**
     * getter method for Observatory name
     * @return ObsName
     */
    public String getObsName() {
        return ObsName;
    }

    /**
     *setter method for Observatory name
     * @param ObsName
     */
    public void setObsName(String ObsName) {
        this.ObsName = ObsName;
    }

    /**
     *getter method for Country name
     * @return CountryName
     */
    public String getCountryName() {
        return CountryName;
    }

    /**
     *setter method for Country name
     * @param CountryName
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    /**
     *getter method for Year Galamsey started
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     *setter method for Year Galamsey started
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     *getter method for Area covered by observatory
     * @return areaCovered
     */
    public double getAreaCovered() {
        return areaCovered;
    }

    /**
     *setter method for Area covered by observatory
     * @param areaCovered
     */
    public void setAreaCovered(double areaCovered) {
        this.areaCovered = areaCovered;
    }
    
    /**
     * This methods the details of the Observatory
     * @return
     */
    public String displayDetails(){
        String details= "Observatory Name: "+ getObsName()+"\n"
                +"Country Name: "+ getCountryName()+"\n"
                +"Year Galamsey started: "+ getYear()+"\n"
                +"Area covered by observatory: "+ getAreaCovered();
        return details;
    }
    
}
