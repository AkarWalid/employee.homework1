
package akarwalid8;

public class testemployee {

    public static void main(String[] args) {
       
        Employee employee1 = new Employee("Akar", "Walid", 2000);
        Employee employee2 = new Employee("Darw", "Kamal", 5000);

        System.out.println("NAME                YEARLY SALARY");
        System.out.println("-----               --------------");
        System.out.printf("%s %s          $%.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.calculateYearlySalary());
        System.out.printf("%s %s          $%.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.calculateYearlySalary());

        System.out.println("\n10 Percent Salary Raised! Exciting!");
        System.out.println("\t    YooHoooooo!");
        System.out.println("");
        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        System.out.println("NAME                YEARLY SALARY");
        System.out.println("-----               --------------");
        System.out.printf("%s %s           $%.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.calculateYearlySalary());
        System.out.printf("%s %s           $%.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.calculateYearlySalary());
    }
}
    
    

