public class BasicEmployeeSalaryCalculator implements SalaryCalculator{

    @Override
    public double employeeSalaryCalculator(Employee employee) {
        return employee.getHourlyRate() * employee.getHoursWorked();
    }

}
