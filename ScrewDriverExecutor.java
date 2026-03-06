class ScrewDriverExecutor{
	public static void main(String[] args){

		ScrewDriver tool=new ScrewDriver();

		System.out.println("Brand:"+tool.brand);
		tool.brand="Bosch";
		System.out.println("Brand:"+tool.brand);

		System.out.println("Price:"+tool.price);
		tool.price=300;
		System.out.println("Price:"+tool.price);

		System.out.println("Type:"+tool.type);
		tool.type="Flat";
		System.out.println("Type:"+tool.type);

		System.out.println("Material:"+tool.material);
		tool.material="Steel";
		System.out.println("Material:"+tool.material);

		System.out.println("Color:"+tool.color);
		tool.color="Red";
		System.out.println("Color:"+tool.color);

		System.out.println("Magnetic Tip:"+tool.magneticTip);
		tool.magneticTip=true;
		System.out.println("Magnetic Tip:"+tool.magneticTip);

		System.out.println("Insulated:"+tool.insulated);
		tool.insulated=true;
		System.out.println("Insulated:"+tool.insulated);

		System.out.println("Length:"+tool.lengthInCm);
		tool.lengthInCm=20;
		System.out.println("Length:"+tool.lengthInCm);

		System.out.println("Manufacturing Country:"+tool.manufacturingCountry);
		tool.manufacturingCountry="Germany";
		System.out.println("Manufacturing Country:"+tool.manufacturingCountry);

		System.out.println("Model Number:"+tool.modelNumber);
		tool.modelNumber="SD101";
		System.out.println("Model Number:"+tool.modelNumber);

		System.out.println("Release Year:"+tool.releaseYear);
		tool.releaseYear="2023";
		System.out.println("Release Year:"+tool.releaseYear);

		System.out.println("Handle Material:"+tool.handleMaterial);
		tool.handleMaterial="Rubber";
		System.out.println("Handle Material:"+tool.handleMaterial);

		System.out.println("Anti Slip Grip:"+tool.antiSlipGrip);
		tool.antiSlipGrip=true;
		System.out.println("Anti Slip Grip:"+tool.antiSlipGrip);

		System.out.println("Tip Type:"+tool.tipType);
		tool.tipType="Flat";
		System.out.println("Tip Type:"+tool.tipType);

		System.out.println("Rust Resistant:"+tool.rustResistant);
		tool.rustResistant=true;
		System.out.println("Rust Resistant:"+tool.rustResistant);

		System.out.println("Packaging:"+tool.packagingType);
		tool.packagingType="Packet";
		System.out.println("Packaging:"+tool.packagingType);

		System.out.println("Weight:"+tool.weightInGrams);
		tool.weightInGrams=150;
		System.out.println("Weight:"+tool.weightInGrams);

		System.out.println("Electrician Use:"+tool.electricianUse);
		tool.electricianUse=true;
		System.out.println("Electrician Use:"+tool.electricianUse);

		System.out.println("Interchangeable Bits:"+tool.interchangeableBits);
		tool.interchangeableBits=false;
		System.out.println("Interchangeable Bits:"+tool.interchangeableBits);

		System.out.println("Size:"+tool.size);
		tool.size="Medium";
		System.out.println("Size:"+tool.size);

		System.out.println("Shape:"+tool.shape);
		tool.shape="Straight";
		System.out.println("Shape:"+tool.shape);

		System.out.println("Finish:"+tool.finishType);
		tool.finishType="Chrome";
		System.out.println("Finish:"+tool.finishType);

		System.out.println("Warranty:"+tool.warrantyYears);
		tool.warrantyYears=2;
		System.out.println("Warranty:"+tool.warrantyYears);

		System.out.println("Stock:"+tool.stockAvailable);
		tool.stockAvailable=100;
		System.out.println("Stock:"+tool.stockAvailable);

		System.out.println("Distributor:"+tool.distributor);
		tool.distributor="Hardware Store";
		System.out.println("Distributor:"+tool.distributor);
	}
}