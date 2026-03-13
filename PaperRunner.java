class PaperRunner{
	public static void main(String [] item){
		Paper paper=new Paper("JK","Printer","White","WoodPulp","Printing","Bundle");
		System.out.println(paper.brand);
		System.out.println(paper.type);
		System.out.println(paper.colour);
		System.out.println(paper.material);
		System.out.println(paper.usage);
		System.out.println(paper.packType);
		
		Paper paper1=new Paper(80,300,500);
		System.out.println(paper1.size);
		System.out.println(paper1.price);
		System.out.println(paper1.quantity);
		
		Paper paper2=new Paper(true,true,false);
		System.out.println(paper2.isA4);
		System.out.println(paper2.isRecycled);
		System.out.println(paper2.isGlossy);
		
	}
}