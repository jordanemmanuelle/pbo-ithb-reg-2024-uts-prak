package Model.Class;

public class Stage {

    String stageName;
    int capacity;
    String stageLocation;

    public Stage(String stageName, int capacity, String stageLocation) {
        this.stageName = stageName;
        this.capacity = capacity;
        this.stageLocation = stageLocation;
    }

    public String getStageName() {
        return stageName;
    }
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getStageLocation() {
        return stageLocation;
    }
    public void setStageLocation(String stageLocation) {
        this.stageLocation = stageLocation;
    }

}
