package domain.model;

import domain.model.employee.Employee;

import java.time.LocalDate;

/**
 * Created by Ivan on 09/07/2017.
 */
public class EmployeeBuilder {

    private String firstName = "John";
    private String lastName = "Doe";
    private LocalDate dateOfBirth = LocalDate.of(1980, 9, 10);
    private String email = "john.doe@foobar.com";

    public static EmployeeBuilder anEmployee(){
        return new EmployeeBuilder();
    }


    public Employee build(){
        return new Employee(firstName, lastName, dateOfBirth, email);
    }

    public EmployeeBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }


    public EmployeeBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder withDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

}
