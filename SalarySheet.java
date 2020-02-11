public class SalarySheet
{
    private int month;
    private double[] salaries;
    private double[] nisDues;
    private boolean submitted;
    
    //accessors
    public double[] salaries(){
        return this.salaries;
    }
    
    public double[] nisDues(){
        return this.nisDues;
    }
    
    public int month(){
        return this.month;
    }
    
    public boolean submitted(){
        return this.submitted;
    }
    //mutators
    
    public SalarySheet(int month){
        this.month = month;
        this.submitted = false;
        if(month == 3 || month == 6 || month == 8 || month == 11){
            this.salaries = new double[5];
            this.nisDues = new double[5];
        }
        else{
            this.salaries = new double[4];
            this.nisDues = new double[4];
        }
    }
    
    public String addSalary(int weekNumber, double amount){
        if(this.salaries.length == 4){
            if(weekNumber <= 4){
                this.salaries[weekNumber-1] = amount;
                return "Salary added";
            }
            else{
                return "Invalid week for month";
            }
        }    
        else if(this.salaries.length == 5){ 
            if(weekNumber <= 5){
                this.salaries[weekNumber-1] = amount;
                return "Salary added";
            }
            else{
                return "Invalid week for month";
            }
        }
        else{
            return "Cannot update salary: Salary sheet submitted.";
        }
 
    }
    
    private void calculateNisDues(){
        for(int i = 0; i < salaries.length; i++){
            if(salaries[i] >= 200 && salaries[i] <= 339.99)
                this.nisDues[i] = 11.90;
            if(salaries[i] >= 340 && salaries[i] <= 449.99)
                this.nisDues[i] = 17.40;
            if(salaries[i] >= 450 && salaries[i] <= 609.99)
                this.nisDues[i] = 23.30;
            if(salaries[i] >= 610 && salaries[i] <= 759.99)
                this.nisDues[i] = 30.10;
            if(salaries[i] >= 760 && salaries[i] <= 929.99)
                this.nisDues[i] = 37.20;
            if(salaries[i] >= 930 && salaries[i] <= 1119.99)
                this.nisDues[i] = 45.10;
            if(salaries[i] >= 1120 && salaries[i] <= 1299.99)
                this.nisDues[i] = 53.20;
            if(salaries[i] >= 1300 && salaries[i] <= 1489.99)
                this.nisDues[i] = 61.40;
            if(salaries[i] >= 1490 && salaries[i] <= 1709.99)
                this.nisDues[i] = 70.40;
            if(salaries[i] >= 1710 && salaries[i] <= 1909.99)
                this.nisDues[i] = 79.60;
            if(salaries[i] >= 1910 && salaries[i] <= 2139.99)
                this.nisDues[i] = 89.10;
            if(salaries[i] >= 2140 && salaries[i] <= 2379.99)
                this.nisDues[i] = 99.40;
            if(salaries[i] >= 2380 && salaries[i] <= 2629.99)
                this.nisDues[i] = 110.20;
            if(salaries[i] >= 2630 && salaries[i] <= 2919.99)
                this.nisDues[i] = 122.10;
            if(salaries[i] >= 2920 && salaries[i] <= 3137.99)
                this.nisDues[i] = 133.30;
            this.nisDues[i] = 138.10;            
        }
    }
    
    public void submitSheet(){
        this.submitted = true;
    }
    
    public double getTotalSalary(){
        double total = 0;
        for(int i = 0; i < salaries.length; i++){
            total = total + salaries[i];
        }
        return total;
    }
    
    public double getNISDues(){
        double total = 0;
        for(int i = 0; i < nisDues.length; i++){
            total = total + nisDues[i];
        }
        return total;
    }
    
    public String toString(){
        String str;
        str = "         December 2019           \n";
        str += "    Week 1  Week 2  Week 3  Week 4  Week 5  Total\n";
        str += "Salary  ";
        for(int i = 0; i < salaries.length; i++){
            str += salaries[i];
        }
        str += "\n";
        str += "NIS ";
        for(int i = 0; i < nisDues.length; i++){
            str += nisDues[i];
        }
        str += "\n";
         
        return str;
    }
}
    
    
