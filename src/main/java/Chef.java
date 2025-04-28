import java.util.ArrayList;
import java.util.List;

public class Chef extends Employee {
    private List<Employee> team;

    public Chef(int code, String name, double salary, List<Employee> team) {
        super(code, name, salary);
        this.team = team;
    }
    public Chef(int code, String name, double salary) {
        super(code, name, salary);
        this.team = new ArrayList<>();
    }
    // Getter
    public List<Employee> getTeam() {
        return team;
    }

    // Setter
    public void setTeam(List<Employee> team) {
        this.team = team;
    }

    // Affiche les employés sous sa responsabilité
    public void displayTeam() {
        System.out.println("Chef: " + getName() + " supervise :");
        for (Employee e : team) {
            System.out.println("  - " + e);
        }
    }

    // Add an employee to the team
    public void addEmployee(Employee employee) {
        if (!team.contains(employee)) {
            team.add(employee);
        }
    }

    // Get an employee by their code
    public Employee getEmployee(int code) {
        if (team != null) {
            for (Employee e : team) {
                if (e.getCode() == code) {
                    return e;
                }
            }
        }
        return null;
    }

    // Delete an employee from the team by their code
    public boolean deleteEmployee(int code) {
        if (team != null) {
            for (Employee e : team) {
                if (e.getCode() == code) {
                    return team.remove(e);
                }
            }
        }
        return false;
    }

    // toString
    @Override
    public String toString() {
        return "Chef{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", teamSize=" + (team != null ? team.size() : 0) +
                '}';
    }
}
