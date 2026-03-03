class PillowRunner{
	public static void main(String [] pillow){
		Pillow pillowObj = new Pillow();
		pillowObj.brand="SleepWell";
		pillowObj.price=500;
		pillowObj.color="White";
		pillowObj.size="Medium";
		pillowObj.material="Cotton";
		pillowObj.shape="Rectangle";
		pillowObj.filledWith="Fiber";
		pillowObj.washable="Yes";
		System.out.println("Brand is: "+pillowObj.brand);
		System.out.println("Price is: "+pillowObj.price);
		System.out.println("Color is: "+pillowObj.color);
		System.out.println("Size is: "+pillowObj.size);
		System.out.println("Material is: "+pillowObj.material);
		System.out.println("Shape is: "+pillowObj.shape);
		System.out.println("Filled with: "+pillowObj.filledWith);
		System.out.println("Washable: "+pillowObj.washable);
	}
}