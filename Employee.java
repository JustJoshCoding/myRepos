import java.util.*;

public class Employee extends Employee
{
    
    
    private int NISNumber;
    private String name;
    private Date startDate;
    private Date endDate;
    private Date dateOfBirth;
    private SalarySheet[] salarySheet;
    
    
    //CONSTRUCTOR
    public Employee(String name, Date DOB, int NISNumber, Date startDate){
        
        this.name = name;
        this.dateOfBirth = DOB;
        this.NISNumber = NISNumber;
        this.startDate = startDate;
        
    }
}
