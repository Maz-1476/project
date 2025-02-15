public class ManageEmployeeRecords {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Zubair Mazumder");
        employee.setHourlyRate(25.0);
        employee.setHoursWorked(40);

        BasicEmployeeSalaryCalculator basicEmployeeSalaryCalculator = new BasicEmployeeSalaryCalculator();
        double salary = basicEmployeeSalaryCalculator.employeeSalaryCalculator(employee);

        EmployeeReportGenerator employeeReportGenerator = new EmployeeReportGenerator();
        employeeReportGenerator.employeeReportGenerator(employee , salary);


    }
}