class ChainRunner{
	public static void main(String [] item){
		Chain chain=new Chain("Malabar","Neck","Gold","Gold","Classic","Simple");
		System.out.println(chain.brand);
		System.out.println(chain.type);
		System.out.println(chain.colour);
		System.out.println(chain.material);
		System.out.println(chain.design);
		System.out.println(chain.style);
		
		Chain chain1=new Chain(24,30000,20);
		System.out.println(chain1.length);
		System.out.println(chain1.price);
		System.out.println(chain1.weight);
		
		Chain chain2=new Chain(true,false,true);
		System.out.println(chain2.isGold);
		System.out.println(chain2.hasPendant);
		System.out.println(chain2.isThick);
		
	}
}