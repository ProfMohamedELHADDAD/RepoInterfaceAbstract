import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création d'employés
        Employee emp1 = new Employee(1, "Karima", 50000.0);
        Employee emp2 = new Employee(2, "Ali", 60000.0);
        Employee emp3 = new Employee(3, "Imane", 55000.0);

        // Création d'une liste d'employés
        List<Employee> team = new ArrayList<>();
        team.add(emp1);
        team.add(emp2);
        team.add(emp3);

        // Création d'un chef avec sa liste d'employés
        Chef chef = new Chef(100, "Hamza ", 80000.0, team);

        // Affichage des informations du chef et de son équipe
        System.out.println("Informations du chef:");
        System.out.println(chef);
        System.out.println("\nÉquipe du chef:");
        chef.displayTeam();

        // Ajout d'un nouvel employé à l'équipe
        Employee emp4 = new Employee(4, "Sara", 52000.0);
        chef.addEmployee(emp4);

        System.out.println("\nAprès ajout d'un nouvel employé:");
        chef.displayTeam();

        // Recherche d'un employé par son code
        Employee foundEmployee = chef.getEmployee(2);
        System.out.println("\nRecherche de l'employé avec le code 2:");
        System.out.println(foundEmployee);

        // Suppression d'un employé
        chef.deleteEmployee(3);
        System.out.println("\nAprès suppression de l'employé avec le code 3:");
        chef.displayTeam();




        // Création d'un chef sans équipe
        Chef chefWithoutTeam = new Chef(101, "Said", 75000.0);
        Employee emp5 = new Employee(5, "Adam", 53000.0);
        chefWithoutTeam.addEmployee(emp5);

        System.out.println("\nInformations du chef sans équipe:");
        System.out.println(chefWithoutTeam);
        System.out.println("\nÉquipe du chef sans équipe:");
        chefWithoutTeam.displayTeam();
    }
} 