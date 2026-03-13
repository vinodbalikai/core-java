class SoapRunner{
	public static void main(String [] item){
		Soap soap=new Soap("Lux","Bath","Pink","Rose","Oval","Box");
		System.out.println(soap.brand);
		System.out.println(soap.type);
		System.out.println(soap.colour);
		System.out.println(soap.fragrance);
		System.out.println(soap.shape);
		System.out.println(soap.packType);
		
		Soap soap1=new Soap(100,40,4);
		System.out.println(soap1.weight);
		System.out.println(soap1.price);
		System.out.println(soap1.quantity);
		
		Soap soap2=new Soap(true,true,true);
		System.out.println(soap2.isHerbal);
		System.out.println(soap2.hasMoisturizer);
		System.out.println(soap2.isAntibacterial);
		
	}
}