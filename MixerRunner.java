class MixerRunner{
	public static void main(String[] mixer){
		boolean status=Mixer.onOrOf();
		System.out.println("The mixer is ON: "+status);
	}
}