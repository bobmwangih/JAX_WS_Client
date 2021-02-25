package com.bob.jaxws_Client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.bob.client.Employee;
import com.bob.client.EmployeeService;
import com.bob.client.EmployeeServiceImplService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        URL url = new URL("http://localhost:8082/employeeservice?wsdl");
        
        EmployeeServiceImplService employeeServiceImplService = new EmployeeServiceImplService(url);
        EmployeeService employeeServiceProxy = employeeServiceImplService.getEmployeeServiceImplPort();
        List<Employee> allEmployees = employeeServiceProxy.getAllEmployee();
        for(Employee employee : allEmployees) {
        System.out.println(employee);
        }
    }
    
    
}
