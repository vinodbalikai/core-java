class StateExecutor {
    public static void main(String[] args) {
        State state = new State();

        state.addHighway("NH44");
        state.addHighway("NH48");
        state.addHighway("NH75");
        state.addHighway("NH150");
        state.addHighway("NH67");
        state.addHighway("NH275");
        state.addHighway("NH50");
        state.addHighway("NH369");
        state.addHighway("NH766");

        state.getHighwayNames();
    }
}