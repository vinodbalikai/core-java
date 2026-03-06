class ChargerExecutor{
	public static void main(String[] args){

		Charger charger=new Charger();

		System.out.println("Brand:"+charger.brand);
		charger.brand="Samsung";
		System.out.println("Brand:"+charger.brand);

		System.out.println("Price:"+charger.price);
		charger.price=1200;
		System.out.println("Price:"+charger.price);

		System.out.println("Wattage:"+charger.wattage);
		charger.wattage=25;
		System.out.println("Wattage:"+charger.wattage);

		System.out.println("Color:"+charger.color);
		charger.color="White";
		System.out.println("Color:"+charger.color);

		System.out.println("Type:"+charger.type);
		charger.type="Mobile Charger";
		System.out.println("Type:"+charger.type);

		System.out.println("Fast Charging:"+charger.fastCharging);
		charger.fastCharging=true;
		System.out.println("Fast Charging:"+charger.fastCharging);

		System.out.println("Detachable Cable:"+charger.detachableCable);
		charger.detachableCable=true;
		System.out.println("Detachable Cable:"+charger.detachableCable);

		System.out.println("Cable Type:"+charger.cableType);
		charger.cableType="USB-C";
		System.out.println("Cable Type:"+charger.cableType);

		System.out.println("Manufacturing Country:"+charger.manufacturingCountry);
		charger.manufacturingCountry="India";
		System.out.println("Manufacturing Country:"+charger.manufacturingCountry);

		System.out.println("Model Number:"+charger.modelNumber);
		charger.modelNumber="CH101";
		System.out.println("Model Number:"+charger.modelNumber);

		System.out.println("Release Year:"+charger.releaseYear);
		charger.releaseYear="2024";
		System.out.println("Release Year:"+charger.releaseYear);

		System.out.println("Over Voltage Protection:"+charger.overVoltageProtection);
		charger.overVoltageProtection=true;
		System.out.println("Over Voltage Protection:"+charger.overVoltageProtection);

		System.out.println("Over Current Protection:"+charger.overCurrentProtection);
		charger.overCurrentProtection=true;
		System.out.println("Over Current Protection:"+charger.overCurrentProtection);

		System.out.println("Short Circuit Protection:"+charger.shortCircuitProtection);
		charger.shortCircuitProtection=true;
		System.out.println("Short Circuit Protection:"+charger.shortCircuitProtection);

		System.out.println("Connector Type:"+charger.connectorType);
		charger.connectorType="Type C";
		System.out.println("Connector Type:"+charger.connectorType);

		System.out.println("Cable Length:"+charger.cableLength);
		charger.cableLength=1;
		System.out.println("Cable Length:"+charger.cableLength);

		System.out.println("Packaging Type:"+charger.packagingType);
		charger.packagingType="Box";
		System.out.println("Packaging Type:"+charger.packagingType);

		System.out.println("Energy Rating:"+charger.energyRating);
		charger.energyRating="5 Star";
		System.out.println("Energy Rating:"+charger.energyRating);

		System.out.println("Weight:"+charger.weightInGrams);
		charger.weightInGrams=120;
		System.out.println("Weight:"+charger.weightInGrams);

		System.out.println("Input Voltage:"+charger.inputVoltage);
		charger.inputVoltage="220V";
		System.out.println("Input Voltage:"+charger.inputVoltage);

		System.out.println("Output Voltage:"+charger.outputVoltage);
		charger.outputVoltage="9V";
		System.out.println("Output Voltage:"+charger.outputVoltage);

		System.out.println("LED Indicator:"+charger.ledIndicator);
		charger.ledIndicator=true;
		System.out.println("LED Indicator:"+charger.ledIndicator);

		System.out.println("Compatibility:"+charger.compatibility);
		charger.compatibility="Android";
		System.out.println("Compatibility:"+charger.compatibility);

		System.out.println("Warranty Years:"+charger.warrantyYears);
		charger.warrantyYears=1;
		System.out.println("Warranty Years:"+charger.warrantyYears);

		System.out.println("Stock Available:"+charger.stockAvailable);
		charger.stockAvailable=250;
		System.out.println("Stock Available:"+charger.stockAvailable);
	}
}