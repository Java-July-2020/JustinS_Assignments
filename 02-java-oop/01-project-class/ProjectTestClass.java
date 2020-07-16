

public class ProjectTestClass {

    public static void main(String[] args) {
        ProjectClass codingProject = new ProjectClass();
        codingProject.setName("Coding Example");
        System.out.println("Project Name: " + codingProject.getName());
        codingProject.setDescription("Twitter Clone");
        System.out.println("Project Description: " + codingProject.getDescription());
        codingProject.setInitialCost(100.50);
        System.out.println("Estimated Initial Cost: " + codingProject.getInitialCost());
        
        ProjectClass newProject = new ProjectClass("Second Project");
        System.out.println("Project Name: " + newProject.getName());
        newProject.setDescription("This is the New Project");
        System.out.println("Project Description: " + newProject.getDescription());
        newProject.setInitialCost(50.50);
        System.out.println("Initial Cost: " + newProject.getInitialCost());

        ProjectClass newestProject = new ProjectClass("Third Iteration", "This is the Third Try");
        System.out.println("Project Name: " + newestProject.getName());
        System.out.println("Project Description: " + newestProject.getDescription());
        newestProject.setInitialCost(30.0);
        System.out.println("Initial Cost: " + newestProject.getInitialCost());


        System.out.println(newestProject.elevatorPitch());
    }

    
}