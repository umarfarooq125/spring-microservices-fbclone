import java.util.*;
import java.util.stream.Collectors;

class Employee {
    public Employee(String name, String g, int sal){
        this.name = name;
        this.gender = g;
        this.sal = sal;
    }
    public String name;
    public String gender;
    public int sal;

    public int getSal() {
        return sal;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
public class StreamMain {
    public static void main(String[] args) {

        Employee e1 = new Employee("Umar", "M", 100);
        Employee e2 = new Employee("Yusra", "F", 150);
        Employee e3 = new Employee("Sana", "F", 200);
        Employee e4 = new Employee("Faheem", "M", 300);
        Employee e5 = new Employee("Mudser", "M", 250);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        Map<String, Long> a = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(a);

        Map<String, Double> b = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSal)));

        System.out.println(b);

        Optional<Employee> c = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSal)));

        System.out.println(c.get().name);

        List<String> d  = employeeList.stream().filter(i-> i.sal==100).map(Employee::getName).collect(Collectors.toList());
        d.stream().forEach(i -> System.out.println("-"+i));

        Optional<Employee> e = employeeList.stream().filter(i -> i.gender == "M").min(Comparator.comparingInt(Employee::getSal));
        System.out.println(e.get().name);

        Optional<Employee> f = employeeList.stream().sorted(Comparator.comparingInt(Employee::getSal)).findFirst();
        System.out.println(f.get().name);


    }
}
