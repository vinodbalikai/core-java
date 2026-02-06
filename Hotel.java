class Resturant{
	public static void main(String[] args){
		String nameOfTheRestuarant="Ajanta";
		String nameOfTheOwner="Satish";
		String addressOfTheRestuarant="3rd main, Gandhi Nagar Bengaluru";
		String branches[]={"Rajajinagar","Mejastic","Vijaynagar"};
		String managers[]={"Vinod","Sankalp","Venkatesh"};
		String menuItems[]={"Masala Papad","Roti","Dal Tadka","Jeera Rice"};
		
		System.out.println("The name of the Restuarant is: "+nameOfTheRestuarant);
		System.out.println("The Owner of this Restuarant is: "+nameOfTheOwner);
		System.out.println("The address of the Restuarant is: "+addressOfTheRestuarant);
		System.out.println("The Branches of the Restuarant are");
		for(String branch:branches)System.out.println(branch);
		System.out.println("The Managers of these Resturants are");
		for(String manager:managers)System.out.println(manager);
		System.out.println("The menu of the Restuarant has");
		for(String menuItem:menuItems)System.out.println(menuItem);
	}
}

