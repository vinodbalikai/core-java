class GardenExecuterTwo{
	public static void main(String[] fool){
		Flower flower=new Flower();
		flower.flowerName="Rose";
		flower.flowerColour="Red";
		flower.flowerShape="Cup shape";
		flower.flowerFragnance="Sweet fragnace";
		
		Garden garden=new Garden();
		boolean isFlowerAdded=garden.addFlower(18,flower);
		System.out.println("The flower is added in the garden: "+isFlowerAdded);
		
		garden.getGardenDetails();
	}
}