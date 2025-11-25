package projectmanagemntsystem;

public class Project extends Entity {

    private String description;
    private String status;
    private int numWorkers;
    private String funder;
    public Project() {
    }

    public Project(String name, String description, String status, int numWorkers, String funder) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.numWorkers = numWorkers;
        this.funder = funder;
    }

    public void setDescription(String description){
        this.description = description;
    }    

    public String getDescription(){
        return this.description;
    }  

    public void setStatus(String status){
        this.status = status;
    }   

    public String getStatus(){
        return this.status;
    }
    public void setNumWorkers(int numWorkers){
        this.numWorkers = numWorkers;
    }   
    public int getNumWorkers(){
        return this.numWorkers;
    }
    public void setFunder(String funder){
        this.funder = funder;
    }   
    public String getFunder(){
        return this.funder;
    }
    
    @Override
    public void printInfo(){
        System.out.println("    Name        : " + this.getName());
        System.out.println("    Description : " + this.getDescription());
        System.out.println("    Workers     : " + this.getNumWorkers());
        System.out.println("    Status      : " + this.getStatus());
        System.out.println("    Funder      : " + this.getFunder());
    }
}
