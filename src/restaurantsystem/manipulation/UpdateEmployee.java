package restaurantsystem.manipulation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import restaurantsystem.model.Employee;
import restaurantsystem.model.ListEmployees;
import restaurantsystem.model.ListItems;

public class UpdateEmployee extends ManipulationEmployee{
	ListEmployees listEmployees;
	int indexToUpdate;
	Employee employee;
	public UpdateEmployee(Employee employee) {
		super(employee);
		this.employee = employee;
		listEmployees = new ListEmployees();
	}
	

	public void setIndexToUpdate(int indexToUpdate) {
		this.indexToUpdate = indexToUpdate;
	}


	public void updateEmployee() {

        List<Employee> employeeList = listEmployees.getListEmployees();

        employeeList.set(indexToUpdate, employee);

        try {
            Files.delete(Paths.get("storage/employee.txt"));
        } catch (IOException ex) {
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/employee.txt"))) {
            employeeList.forEach(employee -> {
                pw.println(employee.getId() + "," + employee.getName() + "," + employee.getSalary());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
	
	
}
