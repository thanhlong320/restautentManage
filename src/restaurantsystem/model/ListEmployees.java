package restaurantsystem.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListEmployees extends Observable{

	public ListEmployees() {
		
	}
	public void updateData() {
		setChanged();
		notifyObservers();
	}
	
	public List<Employee> getListEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("storage/employee.txt"))) {
            while (scanner.hasNextLine()) {
                String employeeLine = scanner.nextLine();

                String employeeInfo[] = employeeLine.split(",");

                Employee employee = new Employee(employeeInfo[0], employeeInfo[1], Double.parseDouble(employeeInfo[2]));

                employeeList.add(employee);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeeList;
    }
	
	public void addEmployee(Employee employee) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/employee.txt", true))) {
            pw.println(employee.getId() + "," + employee.getName() + "," + employee.getSalary());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	
	
	public void deleteEmployee(Employee employee) {
    	List<Employee> employeeList = getListEmployees();

        int indexToDelete = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employeeFromList = employeeList.get(i);

            if (employeeFromList.getId().equalsIgnoreCase(employee.getId())) {
            	indexToDelete = i;
            }
        }

        employeeList.remove(indexToDelete);

        try {
            
            Files.delete(Paths.get("storage/employee.txt"));
        } catch (IOException ex) {
            Logger.getLogger(ListEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/employee.txt"))) {
        	for (Employee e : employeeList) {
        		pw.println(e.getId() + "," + e.getName() + "," + e.getSalary());
			}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	public boolean hasEmployeeInList(String id, int exceptIndex) {
		List<Employee> employeeList = getListEmployees();
		for (int i = 0; i < employeeList.size(); i++) {
			if (id.equalsIgnoreCase(employeeList.get(i).getId())) {
				if (i != exceptIndex) {
					return true;
				}		
			}
		}
		return false;
	}
	
	
}
