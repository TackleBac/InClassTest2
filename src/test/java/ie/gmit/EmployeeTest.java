/*
Name: Ricky Small
Email: G00352166@gmit.ie
Date: 10/03/2021
Title: Employee Class
*/

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

	Employee employee;

	@BeforeEach
	void init() { employee = new Employee("Mr", "Ricky", "123456", "1234567", "Full-time", 21 );}

	@Test
	void testEmployeeTitlePassMr()
	{
		assertEquals("Mr", employee.getTitle());
	}

	@Test
	void testEmployeeTitlePassMrs()
	{
		employee.setTitle("Mrs");
		assertEquals("Mrs", employee.getTitle());
	}

	@Test
	void testEmployeeTitlePassMiss()
	{
		employee.setTitle("Miss");
		assertEquals("Miss", employee.getTitle());
	}


	@Test
	void testEmployeeTitleFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("", "Ricky", "123456", "1234567", "Full-time", 21 ));
		assertEquals("Invalid Title Error - Please choose Mr, Mrs or Miss", e.getMessage());
	}

	@Test
	void testEmployeeNamePass()
	{
		assertEquals("Ricky", employee.getName());
	}

	@Test
	void testEmployeeNameFailUnder5() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "", "123456", "1234567", "Full-time", 21 ));
		assertEquals("Invalid Name Error - Name must have more than 5 letters and a maximum of 22", e.getMessage());
	}

	@Test
	void testEmployeeNameFailOver22() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "RICKYSMALLRICKYSMALLRICKY", "123456", "1234567", "Full-time", 21 ));
		assertEquals("Invalid Name Error - Name must have more than 5 letters and a maximum of 22", e.getMessage());
	}

	@Test
	void testEmployeePpsPass()
	{
		assertEquals("123456", employee.getPps());
	}

	@Test
	void testEmployeePpsFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "Ricky", "", "1234567", "Full-time", 21 ));
		assertEquals("Invalid Pps Number Error - Pps must be 6 digits", e.getMessage());
	}

	@Test
	void testEmployeePhonePass()
	{
		assertEquals("1234567", employee.getPhone());
	}

	@Test
	void testEmployeePhoneFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "Ricky", "123456", "", "Full-time", 21 ));
		assertEquals("Invalid Phone Number Error - Phone must be 7 digits", e.getMessage());
	}

	@Test
	void testEmployeeEmpTypePassFull()
	{
		assertEquals("Full-time", employee.getEmpType());
	}

	@Test
	void testEmployeeEmpTypePassPart()
	{
		employee.setEmpType("Part-time");
		assertEquals("Part-time", employee.getEmpType());
	}

	@Test
	void testEmployeeEmpTypeFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "Ricky", "123456", "1234567", "", 21 ));
		assertEquals("Invalid Employment Type Error - Enter Full-time or Part-time", e.getMessage());
	}

	@Test
	void testEmployeeAgePass()
	{
		assertEquals(21, employee.getAge());
	}

	@Test
	void testEmployeeAgeFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "Ricky", "123456", "1234567", "Full-time", 17 ));
		assertEquals("Invalid Age Error - Must be over 18", e.getMessage());
	}


}
