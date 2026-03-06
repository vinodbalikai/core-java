class KettleExecutor{
	public static void main(String[] args){

		Kettle kettle=new Kettle();

		System.out.println("Brand:"+kettle.brand);
		kettle.brand="Prestige";
		System.out.println("Brand:"+kettle.brand);

		System.out.println("Price:"+kettle.price);
		kettle.price=1800;
		System.out.println("Price:"+kettle.price);

		System.out.println("Capacity:"+kettle.capacityML);
		kettle.capacityML=1500;
		System.out.println("Capacity:"+kettle.capacityML);

		System.out.println("Color:"+kettle.color);
		kettle.color="Black";
		System.out.println("Color:"+kettle.color);

		System.out.println("Material:"+kettle.material);
		kettle.material="Steel";
		System.out.println("Material:"+kettle.material);

		System.out.println("Auto Shut Off:"+kettle.autoShutOff);
		kettle.autoShutOff=true;
		System.out.println("Auto Shut Off:"+kettle.autoShutOff);

		System.out.println("Cordless:"+kettle.cordless);
		kettle.cordless=true;
		System.out.println("Cordless:"+kettle.cordless);

		System.out.println("Wattage:"+kettle.wattage);
		kettle.wattage=1500;
		System.out.println("Wattage:"+kettle.wattage);

		System.out.println("Manufacturing Country:"+kettle.manufacturingCountry);
		kettle.manufacturingCountry="India";
		System.out.println("Manufacturing Country:"+kettle.manufacturingCountry);

		System.out.println("Model Number:"+kettle.modelNumber);
		kettle.modelNumber="KT101";
		System.out.println("Model Number:"+kettle.modelNumber);

		System.out.println("Release Year:"+kettle.releaseYear);
		kettle.releaseYear="2024";
		System.out.println("Release Year:"+kettle.releaseYear);

		System.out.println("Temperature Control:"+kettle.temperatureControl);
		kettle.temperatureControl=true;
		System.out.println("Temperature Control:"+kettle.temperatureControl);

		System.out.println("Boil Dry Protection:"+kettle.boilDryProtection);
		kettle.boilDryProtection=true;
		System.out.println("Boil Dry Protection:"+kettle.boilDryProtection);

		System.out.println("Handle Type:"+kettle.handleType);
		kettle.handleType="Cool Touch";
		System.out.println("Handle Type:"+kettle.handleType);

		System.out.println("Lid Type:"+kettle.lidType);
		kettle.lidType="Flip";
		System.out.println("Lid Type:"+kettle.lidType);

		System.out.println("Packaging:"+kettle.packagingType);
		kettle.packagingType="Box";
		System.out.println("Packaging:"+kettle.packagingType);

		System.out.println("Weight:"+kettle.weightInGrams);
		kettle.weightInGrams=900;
		System.out.println("Weight:"+kettle.weightInGrams);

		System.out.println("Energy Rating:"+kettle.energyRating);
		kettle.energyRating="5 Star";
		System.out.println("Energy Rating:"+kettle.energyRating);

		System.out.println("LED Indicator:"+kettle.ledIndicator);
		kettle.ledIndicator=true;
		System.out.println("LED Indicator:"+kettle.ledIndicator);

		System.out.println("Base Type:"+kettle.baseType);
		kettle.baseType="360 Rotation";
		System.out.println("Base Type:"+kettle.baseType);

		System.out.println("Heating Element:"+kettle.heatingElement);
		kettle.heatingElement="Concealed";
		System.out.println("Heating Element:"+kettle.heatingElement);

		System.out.println("Fast Boil:"+kettle.fastBoil);
		kettle.fastBoil=true;
		System.out.println("Fast Boil:"+kettle.fastBoil);

		System.out.println("Design:"+kettle.design);
		kettle.design="Modern";
		System.out.println("Design:"+kettle.design);

		System.out.println("Warranty:"+kettle.warrantyYears);
		kettle.warrantyYears=2;
		System.out.println("Warranty:"+kettle.warrantyYears);

		System.out.println("Stock:"+kettle.stockAvailable);
		kettle.stockAvailable=180;
		System.out.println("Stock:"+kettle.stockAvailable);
	}
}