class CaseEvidence {

    private String evidenceName;
    private String evidenceType;
    private int caseId;
    private String collectedBy;
    private String locationFound;
    private int evidenceNumber;
    private String storageLocation;

    public void setEvidenceName(String evidenceName){
        this.evidenceName = evidenceName;
    }
    public String getEvidenceName(){
        return this.evidenceName;
    }

    public void setEvidenceType(String evidenceType){
        this.evidenceType = evidenceType;
    }
    public String getEvidenceType(){
        return this.evidenceType;
    }

    public void setCaseId(String caseId){
        this.caseId = caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }

    public void setCollectedBy(String collectedBy){
        this.collectedBy = collectedBy;
    }
    public String getCollectedBy(){
        return this.collectedBy;
    }

    public void setLocationFound(String locationFound){
        this.locationFound = locationFound;
    }
    public String getLocationFound(){
        return this.locationFound;
    }

    public void setEvidenceNumber(int evidenceNumber){
        this.evidenceNumber = evidenceNumber;
    }
    public int getEvidenceNumber(){
        return this.evidenceNumber;
    }

    public void setStorageLocation(String storageLocation){
        this.storageLocation = storageLocation;
    }
    public String getStorageLocation(){
        return this.storageLocation;
    }
}