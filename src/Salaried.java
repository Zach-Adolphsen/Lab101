/**
 *
 * @author Zachary Adolphsen
 * @version January 15, 2024
 * 
 * The Salaried subclass holds the information of a salaried employees title and salary
 */
public class Salaried extends Employee {
    private String title;
    private int salary;
    
 
    public Salaried(int id, String name, String title, int salary)
    {
        super(id, name); // calling the constructor in the "Employee" superclass
        this.title = title; // referring to this specific instance of 'title'
        this.salary = salary; // referring to this specific instance of 'salary'
    }
    
    public String getTitle(){ return title; } // a getter to read the value of 'title' when called
    public void setTitle( String title ) { this.title = title; } //a setter to allow modification of the value of 'title' when called
    
    public int getSalary(){ return salary; } // a getter to read the value of 'salary' when called
    public void setSalary( int salary ) { this.salary = salary; } //a setter to allow modification of the value of 'salary' when called
    
    public String toString() // toString() returns a string representation of objects
    {
        return super.toString() + ":" + getClass().getName() + "@" + title + ":" + salary; //returns 'id' and 'name' form super class as well as 'title' and 'salary' from "Salaried" subclass
    }
    
    public boolean equals( Object o )
    {
        if ( !( o instanceof Salaried ) )
            return false;
        
        Salaried s = ( Salaried ) o;
        
        return super.equals( s )
                && title.equals( s.title )
                && salary == s.salary;
    } 
}
