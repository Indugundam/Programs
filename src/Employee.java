public class Employee {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[4];
        emp[0] = new Employee("Arjun", 34, 60000);
        emp[1] = new Employee("Kalyan", 36, 40000);
        emp[2] = new Employee("Meena", 26, 80000);
        emp[3] = new Employee("Swetha", 25, 30000);
        sort(emp, new AgeCondition());
        System.out.println("sorting according to age");
        for (Employee e : emp) {
            System.out.println(e);
        }
        System.out.println();
        sort(emp, new SalaryCondition());
        System.out.println("sorting according to salary");
        for (Employee e : emp) {
            System.out.println(e);
        }
        System.out.println();
        sort(emp, new NameCondition());
        System.out.println("sorting according to name");
        for (Employee e : emp) {
            System.out.println(e);
        }
    }

    public static void sort(Employee[] emp, ICondition condition) {
        for (int i = 0; i < emp.length; i++) {
            for (int j = i; j < emp.length; j++) {
                if (condition.process(emp[i], emp[j])) {
                    Employee temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }
    }
}

interface ICondition {
    boolean process(Employee emp1, Employee emp2);
}

class AgeCondition implements ICondition {
    @Override
    public boolean process(Employee emp1, Employee emp2) {
        return emp1.age > emp2.age;
    }
}

class SalaryCondition implements ICondition {
    @Override
    public boolean process(Employee emp1, Employee emp2) {
        return emp1.salary > emp2.salary;
    }
}

class NameCondition implements ICondition {
    @Override
    public boolean process(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name) > 0;
    }
}