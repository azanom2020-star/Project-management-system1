package projectmanagemntsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectManagemntSystem {

    public static void main(String[] args) {
        ArrayList<Project> projects = new ArrayList<>();
        app(projects);
    }

    public static void app(ArrayList<Project> projects) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("       Project Management System   ");
        System.out.println("===================================");
        System.out.print("\nPlease enter your name: ");
        String name = scanner.nextLine();
        User user = new User(name);

        System.out.println("===================================");
        System.out.println("       Welcome " + user.getName());
        System.out.println("===================================\n");

        while (true) {
            System.out.println("\nPlease choose an option by entering the number:");
            System.out.println("1. Create Project");
            System.out.println("2. Delete Project");
            System.out.println("3. Edit Project");
            System.out.println("4. View My Projects");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 

            switch (choice) {
                case 1:
                    System.out.print("Enter Project Name: ");
                    String projectName = scanner.nextLine();

                    System.out.print("Enter Project Description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter Project number of workers: ");
                    int numOfWorkers = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Project status: ");
                    String status = scanner.nextLine();

                    System.out.print("Enter Project funder: ");
                    String funder = scanner.nextLine();

                    Project project = new Project(projectName, description, status, numOfWorkers, funder);
                    projects.add(project);
                    System.out.println("\n Project created successfully!");
                    break;

                case 2:
                    if (projects.isEmpty()) {
                        System.out.println("\n  No projects to delete!");
                    } else {
                        System.out.print("Enter the project name to delete: ");
                        String delName = scanner.nextLine();

                        boolean found = false;
                        for (int i = 0; i < projects.size(); i++) {
                            if (projects.get(i).getName().equalsIgnoreCase(delName)) {
                                projects.remove(i);
                                System.out.println(" Project '" + delName + "' deleted successfully!");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println(" Project with name '" + delName + "' not found!");
                        }
                    }
                    break;

                case 3: 
                    if (projects.isEmpty()) {
                        System.out.println("\n  No projects to edit!");
                    } else {
                        System.out.print("Enter the project name to edit: ");
                        String editName = scanner.nextLine();

                        Project projectToEdit = null;
                        for (Project p : projects) {
                            if (p.getName().equalsIgnoreCase(editName)) {
                                projectToEdit = p;
                                break;
                            }
                        }

                        if (projectToEdit == null) {
                            System.out.println(" Project with name '" + editName + "' not found!");
                        } else {
                            System.out.println("\nEditing Project: " + projectToEdit.getName());
                            System.out.println("1. Edit Name");
                            System.out.println("2. Edit Description");
                            System.out.println("3. Edit Number of Workers");
                            System.out.println("4. Edit Status");
                            System.out.println("5. Edit Funder");
                            System.out.print("Enter the number of the field you want to edit: ");
                            int fieldChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (fieldChoice) {
                                case 1:
                                    System.out.print("Enter new name: ");
                                    String newName = scanner.nextLine();
                                    projectToEdit.setName(newName);
                                    break;
                                case 2:
                                    System.out.print("Enter new description: ");
                                    String newDesc = scanner.nextLine();
                                    projectToEdit.setDescription(newDesc);
                                    break;
                                case 3:
                                    System.out.print("Enter new number of workers: ");
                                    int newWorkers = scanner.nextInt();
                                    scanner.nextLine();
                                    projectToEdit.setNumWorkers(newWorkers);
                                    break;
                                case 4:
                                    System.out.print("Enter new status: ");
                                    String newStatus = scanner.nextLine();
                                    projectToEdit.setStatus(newStatus);
                                    break;
                                case 5:
                                    System.out.print("Enter new funder: ");
                                    String newFunder = scanner.nextLine();
                                    projectToEdit.setFunder(newFunder);
                                    break;
                                default:
                                    System.out.println(" Invalid field choice!");
                                    break;
                            }

                            System.out.println(" Project updated successfully!");
                        }
                    }
                    break;

                case 4:
                    if (projects.isEmpty()) {
                        System.out.println("\n  No projects found!");
                    } else {
                        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        System.out.println("           My Projects List");
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

                        for (int i = 0; i < projects.size(); i++) {
                            Project p = projects.get(i);
                            System.out.println(" Project " + (i + 1));
                            p.printInfo();
                            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        }
                    }
                    break;

                case 0:
                    System.out.println("\n Goodbye, " + user.getName() + "!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
    }
}
