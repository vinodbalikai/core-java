class Tv{
	String brand;
	int size;
	Channel channel;
	
	public void getTvDetails(){
		System.out.println("The brand of the tv is: "+brand);
		System.out.println("The size of the tv is: "+size);
		this.channel.getChannelDetails();
	}
}

