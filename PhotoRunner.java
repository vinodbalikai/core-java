class PhotoRunner{
	public static void main(String [] image){
		Photo photo=new Photo("Canon","Portrait","Multicolor","Paper","Nature","Rectangle");
		System.out.println(photo.brand);
		System.out.println(photo.type);
		System.out.println(photo.colour);
		System.out.println(photo.material);
		System.out.println(photo.theme);
		System.out.println(photo.shape);
		
		Photo photo1=new Photo(12,500,200);
		System.out.println(photo1.size);
		System.out.println(photo1.price);
		System.out.println(photo1.weight);
		
		Photo photo2=new Photo(true,true,true);
		System.out.println(photo2.isFramed);
		System.out.println(photo2.isPrinted);
		System.out.println(photo2.isGlossy);
		
	}
}