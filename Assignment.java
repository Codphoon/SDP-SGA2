/**
 * Git and Docker Assignment - Simple Java Application
 * This class demonstrates basic Java programming concepts
 */
public class AssignmentDemo {
    
    // Class variables
    private String projectName;
    private String[] technologies;
    
    /**
     * Constructor to initialize the assignment
     */
    public AssignmentDemo(String projectName) {
        this.projectName = projectName;
        this.technologies = new String[]{"Git", "Docker", "HTML", "CSS", "Java"};
    }
    
    /**
     * Display project information
     */
    public void displayInfo() {
        System.out.println("=================================");
        System.out.println("Project: " + projectName);
        System.out.println("=================================");
        System.out.println("Technologies Used:");
        
        for (int i = 0; i < technologies.length; i++) {
            System.out.println((i + 1) + ". " + technologies[i]);
        }
        System.out.println("=================================");
    }
    
    /**
     * Calculate a simple demonstration
     */
    public int calculateSum(int a, int b) {
        return a + b;
    }
    
    /**
     * Check if Git repository is initialized
     */
    public boolean isGitInitialized() {
        System.out.println("Checking Git repository status...");
        return true; // Simplified for demonstration
    }
    
    /**
     * Display Docker information
     */
    public void displayDockerInfo() {
        System.out.println("\nDocker Container Information:");
        System.out.println("- Container Name: assignment-container");
        System.out.println("- Base Image: openjdk:11");
        System.out.println("- Status: Ready for deployment");
    }
    
    /**
     * Main method - Entry point of the application
     */
    public static void main(String[] args) {
        System.out.println("Starting Git & Docker Assignment Demo...\n");
        
        // Create instance
        AssignmentDemo demo = new AssignmentDemo("Git & Docker Assignment");
        
        // Display project information
        demo.displayInfo();
        
        // Demonstrate calculation
        int result = demo.calculateSum(10, 20);
        System.out.println("\nSample Calculation: 10 + 20 = " + result);
        
        // Check Git status
        boolean gitStatus = demo.isGitInitialized();
        System.out.println("Git Initialized: " + gitStatus);
        
        // Display Docker info
        demo.displayDockerInfo();
        
        System.out.println("\n=================================");
        System.out.println("Demo completed successfully!");
        System.out.println("=================================");
    }
}