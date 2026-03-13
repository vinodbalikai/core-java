class DoorRunner{
	public static void main(String [] entry){
		Door door=new Door("Godrej","Main","Brown","Teak","Classic","Polish");
		System.out.println(door.brand);
		System.out.println(door.type);
		System.out.println(door.colour);
		System.out.println(door.material);
		System.out.println(door.design);
		System.out.println(door.finish);
		
		Door door1=new Door(210,15000,40);
		System.out.println(door1.height);
		System.out.println(door1.price);
		System.out.println(door1.weight);
		
		Door door2=new Door(true,true,true);
		System.out.println(door2.isWooden);
		System.out.println(door2.hasLock);
		System.out.println(door2.hasHandle);
		
	}
}