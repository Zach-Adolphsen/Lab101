/**
 *
 * @author Zachary Adolphsen
 * @version January 15, 2024
 * 
 * The Employee super class contains information about an employees id and name weather they're salaried or hourly
 */
public class Employee {
    private String name;
    private int id;
    private static int employeeCount = 0;
    
    public Employee(int id, String name){ // 
        this.id = id; // referring to this specific instance of 'id'
        this.name = name; // referring to this specific instance of 'name'
        employeeCount++;
    }
    
    public int getId(){ return id; } //a getter method to return the value of 'id' when called
    public void setId(int id){ this.id = id; } //a setter method to allow modification of the value of 'id' when called
    
    public String getName(){ return name; } //a getter to read the value of the 'name' when called
    public void setName( String name ) { this.name = name; } //a setter to allow modification of the value of 'name' when called
    
    public int getEmployee() {return employeeCount; } // a getter to read the value of 'employeeCount' when called
    
    public String toString(){ // returns 'id', 'name', and 'employeeCount' in a string format
        return getClass().getName() + "@" + id + ":" + name + ":" + employeeCount;
    }
    
    public boolean equals( Object o )
    {
        if ( !( o instanceof Employee) )
            return false;
        Employee e = ( Employee ) o;
        
        return id == e.id
                && name.equals( e.name );
    }
    
}
