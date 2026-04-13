class GardenExecuterThree{
	public static void main(String[] fool){
		Flower flower=new Flower();
		flower.flowerName="Lily";
		flower.flowerColour="white";
		flower.flowerShape="round shape";
		flower.flowerFragnance="Sweet fragnace";
		
		Garden garden=new Garden(23,flower);		
		garden.getGardenDetails();
	}
}