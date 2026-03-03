class MatRunner{
	public static void main(String [] mat){
		Mat matObj = new Mat();
		matObj.brand="DoorMat";
		matObj.price=300;
		matObj.color="Brown";
		matObj.size="Large";
		matObj.material="Rubber";
		matObj.type="Floor Mat";
		matObj.shape="Rectangle";
		matObj.washable="Yes";
		System.out.println("Brand is: "+matObj.brand);
		System.out.println("Price is: "+matObj.price);
		System.out.println("Color is: "+matObj.color);
		System.out.println("Size is: "+matObj.size);
		System.out.println("Material is: "+matObj.material);
		System.out.println("Type is: "+matObj.type);
		System.out.println("Shape is: "+matObj.shape);
		System.out.println("Washable: "+matObj.washable);
	}
}