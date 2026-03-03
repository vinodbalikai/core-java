class MilitaryHotelRunner{
	public static void main(String [] hotel){
		MilitaryHotel militaryhotel = new MilitaryHotel();
		militaryhotel.hotelName="Shivaji Military Hotel";
		militaryhotel.ownerName="Prathap";
		militaryhotel.hotelSince=1995;
		militaryhotel.address="Shivaji circle Belagavi";
		militaryhotel.hotelOpenTime="11am";
		militaryhotel.hotelCloseTime="11pm";
		militaryhotel.closedOn="Sunday";
		militaryhotel.menu="Chapati, Masala, Rice";
		
		System.out.println("Name of the Hotel is: "+militaryhotel.hotelName);
		System.out.println("Name of the Owner is: "+militaryhotel.ownerName);
		System.out.println("Hotel Started on: "+militaryhotel.hotelSince);
		System.out.println("The Address of the Hotel is: "+militaryhotel.address);
		System.out.println("Hotel opens at: "+militaryhotel.hotelOpenTime);
		System.out.println("Hotel closes at: "+militaryhotel.hotelCloseTime);
		System.out.println("Hotel will be closed on: "+militaryhotel.closedOn);
		System.out.println("The menu has: "+militaryhotel.menu);
	}
}