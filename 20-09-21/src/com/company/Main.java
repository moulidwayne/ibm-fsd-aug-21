package com.company;

public class Main {


    public static void main(String[] args)  {

     Employee[] employees=new Employee[2];
Employee employee=new Employee();
        try {
            employee.createEmployee();
            employees[0]=employee;
          Employee employee1=  new Employee();
          employee1.createEmployee();
          if (employee.equals(employee1))
          {
                throw new EmmployeeAlreadyExistException("duplicate employee");
          }
          employees[1]=employee1;
        } catch (InvalidSalaryException | InvalidMobileNumberException | EmmployeeAlreadyExistException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());

        }

for (Employee e:employees)
{
    System.out.println(e);
}
    }
}
