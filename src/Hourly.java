/**
 *
 * @author Zachary Adolphsen
 * @version January 15, 2024
 * 
 * The Hourly subclass holds information on an hourly pay employees position and hourlyRate
 */
public class Hourly extends Employee{
    private String position;
    private double hourlyRate;
    
    public Hourly(int id, String name, String position, double hourlyRate)
    {
        super(id, name); //calling 'id' and 'name' from employee class
        this.position = position; // 'this' refers to this specific instance of 'position'
        this.hourlyRate = hourlyRate; // 'this refer to this specific instance of 'hourlyRate'
    }
    
    public String getPosition() {return position;} //a getter to read the value of 'position' when called
    public void setPosition( String position ) { this.position = position; } //a setter to allow modification of the value of 'position' when called
    
    public double getHourlyRate() {return hourlyRate; } // a getter to read the value of 'hourlyRate' when called
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; } //a setter to allow modification of the value of 'hourlyRate' when called
    
    public String toString() { // returns the string representation of the objects specified
        return super.toString() + ":" + getClass().getName() + "@" + position + ":" + hourlyRate; //returns 'id' and 'name' form super class as well as 'position' and 'hourlyRate' from "Hourly" subclass
    }
    
    public boolean equals( Object o )
    {
        if ( !( o instanceof Hourly ) ) // checks if o is not an apart of the Hourly class type
            return false;
        
        Hourly h = ( Hourly ) o;
        
        return super.equals( h )
                && position.equals( h.position )
                && hourlyRate == h.hourlyRate;
    } 
}
