class TrainRunner{
  public static void main(String[] args){
     Boggy boggy = new Boggy(17, "Wxpress", 778);
	 Train train = new Train(11, "SSB", "Hubli", "Dharwad", boggy);
	 train.getDetail();
	 
	 Boggy boggy1= new Boggy(300, "raw material", 1);
	 Train train1 = new Train(102, "non pasander", "Delhi", "Agra", boggy1);
	 train1.getDetail();
	 }
  }