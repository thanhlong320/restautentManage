package restaurantsystem.manipulation;

import restaurantsystem.model.Employee;

public abstract class ManipulationEmployee extends Employee{
	Employee employee;
	public ManipulationEmployee(Employee employee){
		this.employee = employee;
	}
	
}
