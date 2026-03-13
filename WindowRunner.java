class WindowRunner{
	public static void main(String [] item){
		Window window=new Window("Fenesta","Sliding","White","Aluminium","Modern","Rectangle");
		System.out.println(window.brand);
		System.out.println(window.type);
		System.out.println(window.colour);
		System.out.println(window.material);
		System.out.println(window.design);
		System.out.println(window.shape);
		
		Window window1=new Window(120,5000,30);
		System.out.println(window1.height);
		System.out.println(window1.price);
		System.out.println(window1.weight);
		
		Window window2=new Window(true,true,true);
		System.out.println(window2.isSliding);
		System.out.println(window2.hasGlass);
		System.out.println(window2.hasGrill);
		
	}
}