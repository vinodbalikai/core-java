class PastaExecutor{
   public static void main(String[] pastas){
      Pasta pasta = new Pasta();
	  pasta.addPastaNames("Penne");
	  pasta.addPastaNames("Fusilli");
	  pasta.addPastaNames("Macaroni");
	  pasta.addPastaNames("Spaghetti");
	  pasta.addPastaNames("Ravioli");
	  
	  pasta.getPastaNames();
	  
	  pasta.getNameByIndex(0);
	  
	  pasta.getIndexByName("Penne");

	  pasta.updatePastaName("Macaroni", "Lasagna");

	  pasta.deletePastaName("Fusilli");
	  
	   pasta.getPastaNames();
	  
	 }
 }