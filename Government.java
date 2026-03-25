class Government {
    String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExam(String examName) {
        boolean isAdded = false;

        if (examName != null && !examName.isEmpty()) {
            competitiveExamNames[index++] = examName;
            isAdded = true;
        } else {
            System.out.println("Invalid exam name");
        }
        return isAdded;
    }

    public void getExamNames() {
        System.out.println("The competitive exam names are:");
        for (String exam : competitiveExamNames) {
            System.out.println(exam);
        }
    }
}
