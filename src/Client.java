
/**
 *
 * @author Zachary Adolphsen
 * @version January 15, 2024
 *
 * A main class to test that the classes and all work correctly
 */
public class Client {

    public static void main(String[] args) {
        Employee[] employeeList = new Employee[10];

        System.out.println("--- Created these employees ---");
        Salaried employee1 = new Salaried(0, "Al", "Manager", 60000);
        Hourly employee2 = new Hourly(1, "Kelly", "Hostess", 25.75);
        Salaried employee3 = new Salaried(2, "Peggy", "CEO", 120000);
        Hourly employee4 = new Hourly(3, "Bud", "Busboy", 15.00);
        Hourly employee5 = new Hourly(4, "Marcy", "Server", 10.00);
        Hourly employee6 = new Hourly(5, "Jefferson", "Cook", 35.00);
        
        employeeList[0] = employee1;
        employeeList[1] = employee2;
        employeeList[2] = employee3;
        employeeList[3] = employee4;
        employeeList[4] = employee5;
        employeeList[5] = employee6;
        

        for (int i = 0; i < employeeList.length; i++) { //loop that goes through each array index and prints the contents
            if (employeeList[i] == null){
                continue;
            }
            System.out.println(employeeList[i]);
        }
        System.out.println(" ");
        
        // Give each employee a 25% raise
        System.out.print("--- Giving each employee a 25% raise ---");
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] instanceof Hourly) {
                Hourly h = (Hourly) employeeList[i]; // checks if index contents are apart of Hourly class
                double newRate = h.getHourlyRate() * 1.25; // increases hourlyRate by 25%
                h.setHourlyRate(newRate); //sets hourlyRate to the new rate
                employeeList[i] = h; // specific index gets updated hourlyRate
            }
            if (employeeList[i] instanceof Salaried) {
                Salaried s = (Salaried) employeeList[i]; //checks if index contents are apart of Salaried class
                double newSalary = s.getSalary() * 1.25; //increases salary by 25%
                s.setSalary( (int) newSalary); //sets salary to new salary
                employeeList[i] = s; // specified index gets updated salary
            }
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < employeeList.length; i++){
            if (employeeList[i] == null) { break; } // checks to see if array index is null, if null it breaks the loop
            System.out.println(employeeList[i]);
        }
        
        Salaried employee7 = new Salaried(0, "Al", "Manager", 75000);
        Salaried employee8 = new Salaried(2, "Peggy", "CEO", 120000);
        Hourly employee9 = new Hourly(4, "Marcy", "Server", 12.50);
        Hourly employee10 = new Hourly(5, "Jefferson", "Cook", 11.00);
        
        System.out.println("");
        System.out.println("Hourly: " + employee5.equals(employee9)); // returns true
        System.out.println("Hourly: " + employee6.equals(employee10));// returns false
        System.out.println("Salary: " + employee1.equals(employee7));// returns true
        System.out.println("Salary: " + employee3.equals(employee8)); // returns false
    }

}
