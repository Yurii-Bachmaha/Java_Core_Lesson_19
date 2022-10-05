package task01;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws Exception {

		File file = new File("Employee.obj");
		Employee e = new Employee("Peter", 0, 5900);
		System.out.println(e);

		System.out.println("\nEmployee after serialization/deserealization");
		Methods.serialize(file, e);
		System.out.println(Methods.deserealize(file));

		File list = new File("EmployeeList.obj");
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(e);
		listOfEmployee.add(new Employee("Ivan", 1, 6900));
		listOfEmployee.add(new Employee("Alex", 2, 8500));
		listOfEmployee.add(new Employee("Bob", 3, 2700));
		listOfEmployee.add(new Employee("Eva", 4, 10900));
		listOfEmployee.add(new Employee("Liza", 5, 9800));
		listOfEmployee.add(new Employee("Mark", 6, 14300));
		listOfEmployee.add(new Employee("John", 7, 3500));

		System.out.println("\nList of employee;");
		for (Employee employee : listOfEmployee) {
			System.out.println(employee);
		}

		System.out.println("\nList of employee after serialization/deserealization:");
		Methods.serialize(list,(Serializable) listOfEmployee);

		List<Employee> deserializedListOfEmployee = new ArrayList<Employee>();
		deserializedListOfEmployee = (List<Employee>) Methods.deserealize(list);

		for (Employee employee : deserializedListOfEmployee) {
			System.out.println(employee);
		}
	}
}