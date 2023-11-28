import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeListMap {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "IT", 50000));
        employees.add(new Employee(111, "Bob", "Finance", 38000));
        employees.add(new Employee(108, "Charlie", "Trading", 60000));
        employees.add(new Employee(105, "Keren", "Finance", 58000));
        employees.add(new Employee(107, "Honey", "Trading", 40000));

        //sorting the employees 
        //NORMAL WAY
        // Collections.sort(employees, new Comparator<Employee>() {
            
        //     @Override
        //     public int compare(Employee o1, Employee o2) {
        //         return o1.getSalary()-o2.getSalary(); // ascending 
        
        //     }//o2.getSalary()-o1.getSalary(); // descending
            
        // });

        //with lambda 
        System.out.println("with Lambda.....................................");
        Collections.sort(employees, (o1,o2) ->(o1.getSalary() - o2.getSalary()));
        //System.out.println(employees);
        //and stream api.. in differenet ways..
        System.out.println("with string1.....................................");
        employees.stream().sorted((o1,o2) ->(o1.getSalary() - o2.getSalary())).forEach(System.out::println);
       // System.out.println(employees);
        System.out.println("with string2..........................................");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        System.out.println(employees);

       Map <Employee , Integer> employeeMap = new HashMap<>();
       employeeMap.put(new Employee(101, "Alice", "IT", 50000), 80);
       employeeMap.put(new Employee(111, "Bob", "Finance", 38000),90);
       employeeMap.put(new Employee(108, "Charlie", "Trading", 60000),100);
       employeeMap.put(new Employee(105, "Keren", "Finance", 58000),11);
       employeeMap.put(new Employee(107, "Honey", "Trading", 40000),698);

       
       employeeMap.entrySet().stream()
       .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
    }
}
