class GardenExecuterOne{
	public static void main(String[] fool){
		Flower flower=new Flower();
		flower.flowerName="Hebiscus";
		flower.flowerColour="Red";
		flower.flowerShape="Trumpet shape";
		flower.flowerFragnance="Mild floral";
		
		Garden garden=new Garden();
		garden.flower=flower;
		garden.gardenId=17;
		
		garden.getGardenDetails();
		
	}
}