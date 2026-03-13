
class PowerBankRunner{
	public static void main(String [] item){
		PowerBank powerbank=new PowerBank("Mi","Portable","Black","Plastic","Rectangle","USB-C");
		System.out.println(powerbank.brand);
		System.out.println(powerbank.type);
		System.out.println(powerbank.colour);
		System.out.println(powerbank.material);
		System.out.println(powerbank.shape);
		System.out.println(powerbank.portType);
		
		PowerBank powerbank1=new PowerBank(20000,1500,450);
		System.out.println(powerbank1.capacity);
		System.out.println(powerbank1.price);
		System.out.println(powerbank1.weight);
		
		PowerBank powerbank2=new PowerBank(true,true,true);
		System.out.println(powerbank2.isFastCharge);
		System.out.println(powerbank2.hasDisplay);
		System.out.println(powerbank2.hasTorch);
		
	}
}