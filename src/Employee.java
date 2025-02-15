public class Employee {

    public int id;

    public String name;

    public double hourlyRate;

    public int hoursWorked;

    public Employee(){

    }

    public Employee(int id , String name , double hourlyRate , int hoursWorked){
        this.id = id;
        this.name =  name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
