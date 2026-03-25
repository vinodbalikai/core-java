class GunRunner{
public static void main(String[] weapon){
Gun gun=new Gun(1);
System.out.println(gun.gunId);
gun=new Gun("AKM");
System.out.println(gun.gunId);
System.out.println(gun.gunName);
}
}