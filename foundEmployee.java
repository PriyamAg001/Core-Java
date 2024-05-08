import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class foundEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            employees.add(new Employee(id, name));
        }

        int X = sc.nextInt();
        String result = "employee not found";

        for(Employee e : employees) {
            if(e.id == X) {
                result = e.name;
                break;
            }
        }

        System.out.println(result);
    }
}
