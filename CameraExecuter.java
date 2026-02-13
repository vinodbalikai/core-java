class CameraExecuter{
	public static void main(String [] cam){
		Double price =Camera.getPrice();
        System.out.println("The price of the camera is: "+price);
		
		String brand=Camera.getBrand();
		System.out.println("The brand of the camera is: "+brand);
		
		int mp=Camera.getMegapixels();
		System.out.println("The megapixels are: "+mp);
		
		String lens=Camera.getLensType();
		System.out.println("The lens type is: "+lens);
		
		String video=Camera.getVideoQuality();
		System.out.println("The video quality is: "+video);
		
		boolean flash=Camera.hasFlash();
		System.out.println("Has flash: "+flash);
	}
}