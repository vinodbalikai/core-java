class TreeExecutor{
   public static void main(String[] trees){
      Tree tree = new Tree();
	  tree.addTreeNames("Neem");
	  tree.addTreeNames("Mango");
	  tree.addTreeNames("Peepal");
	  tree.addTreeNames("Banyan");
	  tree.addTreeNames("Coconut");
	  
	  tree.getTreeNames();
	  
	  tree.getNameByIndex(0);
	  
	  tree.getIndexByName("Neem");

	  tree.updateTreeName("Peepal", "Ashoka");

	  tree.deleteTreeName("Mango");
	  
	   tree.getTreeNames();
	  
	 }
 }