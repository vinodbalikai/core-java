class PipeExecutor{
	public static void main(String[] args){

		Pipe pipe=new Pipe();

		System.out.println("Brand:"+pipe.brand);
		pipe.brand="Ashirvad";
		System.out.println("Brand:"+pipe.brand);

		System.out.println("Price:"+pipe.price);
		pipe.price=600;
		System.out.println("Price:"+pipe.price);

		System.out.println("Material:"+pipe.material);
		pipe.material="PVC";
		System.out.println("Material:"+pipe.material);

		System.out.println("Color:"+pipe.color);
		pipe.color="White";
		System.out.println("Color:"+pipe.color);

		System.out.println("Length:"+pipe.lengthInMeters);
		pipe.lengthInMeters=3;
		System.out.println("Length:"+pipe.lengthInMeters);

		System.out.println("Diameter:"+pipe.diameterMM);
		pipe.diameterMM=20;
		System.out.println("Diameter:"+pipe.diameterMM);

		System.out.println("Flexible:"+pipe.flexible);
		pipe.flexible=true;
		System.out.println("Flexible:"+pipe.flexible);

		System.out.println("Rust Proof:"+pipe.rustProof);
		pipe.rustProof=true;
		System.out.println("Rust Proof:"+pipe.rustProof);

		System.out.println("Manufacturing Country:"+pipe.manufacturingCountry);
		pipe.manufacturingCountry="India";
		System.out.println("Manufacturing Country:"+pipe.manufacturingCountry);

		System.out.println("Model Number:"+pipe.modelNumber);
		pipe.modelNumber="PP101";
		System.out.println("Model Number:"+pipe.modelNumber);

		System.out.println("Release Year:"+pipe.releaseYear);
		pipe.releaseYear="2023";
		System.out.println("Release Year:"+pipe.releaseYear);

		System.out.println("Type:"+pipe.type);
		pipe.type="Water Pipe";
		System.out.println("Type:"+pipe.type);

		System.out.println("Waterproof:"+pipe.waterproof);
		pipe.waterproof=true;
		System.out.println("Waterproof:"+pipe.waterproof);

		System.out.println("Packaging:"+pipe.packagingType);
		pipe.packagingType="Bundle";
		System.out.println("Packaging:"+pipe.packagingType);

		System.out.println("Weight:"+pipe.weightInGrams);
		pipe.weightInGrams=1500;
		System.out.println("Weight:"+pipe.weightInGrams);

		System.out.println("Pressure Rating:"+pipe.pressureRating);
		pipe.pressureRating="High";
		System.out.println("Pressure Rating:"+pipe.pressureRating);

		System.out.println("Usage:"+pipe.usage);
		pipe.usage="Plumbing";
		System.out.println("Usage:"+pipe.usage);

		System.out.println("Heat Resistant:"+pipe.heatResistant);
		pipe.heatResistant=true;
		System.out.println("Heat Resistant:"+pipe.heatResistant);

		System.out.println("Finish:"+pipe.finishType);
		pipe.finishType="Matte";
		System.out.println("Finish:"+pipe.finishType);

		System.out.println("Connector Type:"+pipe.connectorType);
		pipe.connectorType="Thread";
		System.out.println("Connector Type:"+pipe.connectorType);

		System.out.println("Recyclable:"+pipe.recyclable);
		pipe.recyclable=true;
		System.out.println("Recyclable:"+pipe.recyclable);

		System.out.println("Shape:"+pipe.shape);
		pipe.shape="Round";
		System.out.println("Shape:"+pipe.shape);

		System.out.println("Warranty:"+pipe.warrantyYears);
		pipe.warrantyYears=5;
		System.out.println("Warranty:"+pipe.warrantyYears);

		System.out.println("Stock:"+pipe.stockAvailable);
		pipe.stockAvailable=90;
		System.out.println("Stock:"+pipe.stockAvailable);

		System.out.println("Distributor:"+pipe.distributor);
		pipe.distributor="Hardware Shop";
		System.out.println("Distributor:"+pipe.distributor);
	}
}