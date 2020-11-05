package com.dinesh.employeecrud.test;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.dinesh.employeecrud.dao.EmployeeDAO;
import com.dinesh.employeecrud.model.Employee;

public class EmployeeCRUDTest {
	
	@Test
	public void testInsert() throws SQLException {
		EmployeeDAO employeeDAO;
		employeeDAO = new EmployeeDAO();
		Employee emp = new Employee("Ananthan", "ananthan@gmail.com");
		assertTrue(employeeDAO.insertEmployee(emp));
	}
	
	@Test
	public void testDelete() throws SQLException {
		EmployeeDAO employeeDAO;
		employeeDAO = new EmployeeDAO();
		assertTrue(employeeDAO.deleteEmployee(7));
	}

}
