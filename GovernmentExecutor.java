class GovernmentExecutor {
    public static void main(String[] args) {
        Government gov = new Government();

        gov.addExam("UPSC");
        gov.addExam("SSC CGL");
        gov.addExam("SSC CHSL");
        gov.addExam("IBPS PO");
        gov.addExam("IBPS Clerk");
        gov.addExam("RRB NTPC");
        gov.addExam("RRB Group D");
        gov.addExam("GATE");
        gov.addExam("NEET");

        gov.getExamNames();
    }
}