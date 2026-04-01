class IndianArmy {

    private String regimentName;
    private String soldierName;
    private String rank;
    private String postingLocation;
    private String weapon;
    private int serviceYears;
    private boolean onDuty;

    public void setRegimentName(String regimentName){
        this.regimentName = regimentName;
    }
    public String getRegimentName(){
        return this.regimentName;
    }

    public void setSoldierName(String soldierName){
        this.soldierName = soldierName;
    }
    public String getSoldierName(){
        return this.soldierName;
    }

    public void setRank(String rank){
        this.rank = rank;
    }
    public String getRank(){
        return this.rank;
    }

    public void setPostingLocation(String postingLocation){
        this.postingLocation = postingLocation;
    }
    public String getPostingLocation(){
        return this.postingLocation;
    }

    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public String getWeapon(){
        return this.weapon;
    }

    public void setServiceYears(int serviceYears){
        this.serviceYears = serviceYears;
    }
    public int getServiceYears(){
        return this.serviceYears;
    }

    public void setOnDuty(boolean onDuty){
        this.onDuty = onDuty;
    }
    public boolean getOnDuty(){
        return this.onDuty;
    }
}