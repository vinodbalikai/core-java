class PlayGround {

    private String groundName;
    private String location;
    private String sportType;
    private int capacity;
    private String surfaceType;
    private boolean floodLights;
    private String owner;

    public void setGroundName(String groundName){
        this.groundName = groundName;
    }
    public String getGroundName(){
        return this.groundName;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }

    public void setSportType(String sportType){
        this.sportType = sportType;
    }
    public String getSportType(){
        return this.sportType;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }

    public void setSurfaceType(String surfaceType){
        this.surfaceType = surfaceType;
    }
    public String getSurfaceType(){
        return this.surfaceType;
    }

    public void setFloodLights(boolean floodLights){
        this.floodLights = floodLights;
    }
    public boolean getFloodLights(){
        return this.floodLights;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return this.owner;
    }
}