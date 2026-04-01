class CaseEvidenceExecutor {
    public static void main(String[] args) {

        CaseEvidence evidence = new CaseEvidence();

        evidence.setEvidenceName("Fingerprint");
        System.out.println("Evidence Name: " + evidence.getEvidenceName());

        evidence.setEvidenceType("Physical");
        System.out.println("Evidence Type: " + evidence.getEvidenceType());

        evidence.setCaseId(17);
        System.out.println("Case Id: " + evidence.getCaseId());

        evidence.setCollectedBy("Inspector Vinod");
        System.out.println("Collected By: " + evidence.getCollectedBy());

        evidence.setLocationFound("Main Hall");
        System.out.println("Location Found: " + evidence.getLocationFound());

        evidence.setEvidenceNumber(27);
        System.out.println("Evidence Number: " + evidence.getEvidenceNumber());

        evidence.setStorageLocation("Shelf");
        System.out.println("Storage Location: " + evidence.getStorageLocation());


        CaseEvidence evidence1 = new CaseEvidence();

        evidence1.setEvidenceName("Broken Glass");
        System.out.println("Evidence Name: " + evidence1.getEvidenceName());

        evidence1.setEvidenceType("Material");
        System.out.println("Evidence Type: " + evidence1.getEvidenceType());

        evidence1.setCaseId(19);
        System.out.println("Case Id: " + evidence1.getCaseId());

        evidence1.setCollectedBy("Officer Snehit");
        System.out.println("Collected By: " + evidence1.getCollectedBy());

        evidence1.setLocationFound("Window Side");
        System.out.println("Location Found: " + evidence1.getLocationFound());

        evidence1.setEvidenceNumber(83);
        System.out.println("Evidence Number: " + evidence1.getEvidenceNumber());

        evidence1.setStorageLocation("Box");
        System.out.println("Storage Location: " + evidence1.getStorageLocation());


        CaseEvidence evidence2 = new CaseEvidence();

        evidence2.setEvidenceName("USB Drive");
        System.out.println("Evidence Name: " + evidence2.getEvidenceName());

        evidence2.setEvidenceType("Digital");
        System.out.println("Evidence Type: " + evidence2.getEvidenceType());

        evidence2.setCaseId(7);
        System.out.println("Case Id: " + evidence2.getCaseId());

        evidence2.setCollectedBy("Inspector Sankalp");
        System.out.println("Collected By: " + evidence2.getCollectedBy());

        evidence2.setLocationFound("Office Desk");
        System.out.println("Location Found: " + evidence2.getLocationFound());

        evidence2.setEvidenceNumber(305);
        System.out.println("Evidence Number: " + evidence2.getEvidenceNumber());

        evidence2.setStorageLocation("Locker");
        System.out.println("Storage Location: " + evidence2.getStorageLocation());


        CaseEvidence evidence3 = new CaseEvidence();

        evidence3.setEvidenceName("Handwritten Note");
        System.out.println("Evidence Name: " + evidence3.getEvidenceName());

        evidence3.setEvidenceType("Document");
        System.out.println("Evidence Type: " + evidence3.getEvidenceType());

        evidence3.setCaseId(1);
        System.out.println("Case Id: " + evidence3.getCaseId());

        evidence3.setCollectedBy("Officer Kiran");
        System.out.println("Collected By: " + evidence3.getCollectedBy());

        evidence3.setLocationFound("Drawer");
        System.out.println("Location Found: " + evidence3.getLocationFound());

        evidence3.setEvidenceNumber(66);
        System.out.println("Evidence Number: " + evidence3.getEvidenceNumber());

        evidence3.setStorageLocation("Cabinet");
        System.out.println("Storage Location: " + evidence3.getStorageLocation());


        CaseEvidence evidence4 = new CaseEvidence();

        evidence4.setEvidenceName("Footwear Impression");
        System.out.println("Evidence Name: " + evidence4.getEvidenceName());

        evidence4.setEvidenceType("Forensic");
        System.out.println("Evidence Type: " + evidence4.getEvidenceType());

        evidence4.setCaseId(3);
        System.out.println("Case Id: " + evidence4.getCaseId());

        evidence4.setCollectedBy("Inspector Dev");
        System.out.println("Collected By: " + evidence4.getCollectedBy());

        evidence4.setLocationFound("Backyard");
        System.out.println("Location Found: " + evidence4.getLocationFound());

        evidence4.setEvidenceNumber(142);
        System.out.println("Evidence Number: " + evidence4.getEvidenceNumber());

        evidence4.setStorageLocation("Rack");
        System.out.println("Storage Location: " + evidence4.getStorageLocation());

    }
}