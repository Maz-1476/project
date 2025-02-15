public class EmployeeReportGenerator implements ReportGenerator{

    @Override
    public void employeeReportGenerator(Employee employee , double salary) {

        System.out.println("-----Employee Report -----");
        System.out.println("The Employee ID is: " + employee.getId());
        System.out.println("The Employee Name is: " + employee.getName());
        System.out.println("Hourly Rate: " + employee.getHourlyRate());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Employee Salary: " + salary);
    }


}
