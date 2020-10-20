package com.capg.employee;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

import org.junit.Assert;
public class EmployeePayrollServiceTest {
	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchNumberOfEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmployees = { new EmployeePayrollData(1, "ABC", 100.0),
												   new EmployeePayrollData(2, "DEF", 200.0),
												   new EmployeePayrollData(3, "GHI", 300.0) };
		EmployeePayrollService empPayrollService;
		empPayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
		empPayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		Assert.assertEquals(3, empPayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO));
	}
}
