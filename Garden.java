class Garden{
	int gardenId;
	Flower flower;
	
	Garden(){
		
	}
	
	public boolean addFlower(int gardenId, Flower flower){
		boolean isFlowerAdded=false;
		this.gardenId=gardenId;
		this.flower=flower;
		isFlowerAdded=true;
		return isFlowerAdded;
	}
	public Garden(int gardenId,Flower flower){
		this.gardenId=gardenId;
		this.flower=flower;
	}
	
	public void getGardenDetails(){
		System.out.println("The garden Id is: "+gardenId);
		System.out.println("The name of the flower is: "+flower.flowerName);
		System.out.println("The colour of the flower is: "+flower.flowerColour);
		System.out.println("The shape of the flower is: "+flower.flowerShape);
		System.out.println("The fragnance of the flower is: "+flower.flowerFragnance);
	}
	
}