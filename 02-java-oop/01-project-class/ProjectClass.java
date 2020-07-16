

public class ProjectClass {
    private String name;
    private String description;
    private Double initialCost;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Double getInitialCost(){
        return this.initialCost;
    }

    public void setInitialCost(Double initialCost){
        this.initialCost = initialCost;
    }
    
    public ProjectClass() {
    
    }

    public ProjectClass(String name){
        this.name = name;
    }

    public ProjectClass(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String elevatorPitch(){
        return name + ":" + description + "the initial cost " + Double.toString(initialCost);
    }

}