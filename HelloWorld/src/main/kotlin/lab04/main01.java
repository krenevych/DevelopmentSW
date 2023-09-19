package lab04;

import java.util.Objects;

class EmployeeJava {

    public EmployeeJava(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    String firstName;
    String lastName;
    String position;

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceof Employee other){
//            if (hashCode() != other.hashCode()){
//                return false;
//            }
//
//            return firstName.equals(other.firstName) &&
//                    lastName.equals(other.lastName)
//                    && position.equals(other.position);
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return 31 * (31 * firstName.hashCode() + lastName.hashCode()) + position.hashCode();
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeJava employee = (EmployeeJava) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position);
    }
}
//
//record Employee1(
//        String firstName,
//        String lastName,
//        String position
//        ) ;

public class main01 {
    public static void main(String[] args) {
        EmployeeJava employee1 = new EmployeeJava("Bogdan", "Vasin", "engineer");
        EmployeeJava employee2 = new EmployeeJava("Bogdan", "Vasin", "engineer");
//        Employee employee2 = employee1;
//        employee2.firstName = "Андрій";
        System.out.println(employee1);
        System.out.println(employee2);
//        if (employee1 == employee2) {  // порівняння посилань
//            System.out.println("Посилання на об'єкти працівник однакові");
//        } else {
//            System.out.println("Посилання на об'єкти працівник різні");
//        }

        if (employee1.equals(employee2)) {  // порівняння вмісту об'єктів
            System.out.println("Працівники однакові");
        } else {
            System.out.println("Працівники різні");
        }

        System.out.println("employee1 hash = " + employee1.hashCode());
        System.out.println("employee2 hash = " + employee2.hashCode());

    }
}
