class ArchitectExecutor {
    public static void main(String[] args) {
        Architect arch = new Architect();

        arch.addDesign("Modern");
        arch.addDesign("Contemporary");
        arch.addDesign("Minimalist");
        arch.addDesign("Industrial");
        arch.addDesign("Scandinavian");
        arch.addDesign("Traditional");
        arch.addDesign("Bohemian");
        arch.addDesign("Rustic");
        arch.addDesign("Art Deco");
        arch.addDesign("Mid-Century");
        arch.addDesign("Eclectic");

        arch.getDesigns();
    }
}