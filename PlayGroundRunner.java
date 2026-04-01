class PlayGroundRunner {
    public static void main(String[] args) {

        PlayGround ground = new PlayGround();

        ground.setGroundName("National Stadium");
        System.out.println("Ground Name: " + ground.getGroundName());

        ground.setLocation("Delhi");
        System.out.println("Location: " + ground.getLocation());

        ground.setSportType("Cricket");
        System.out.println("Sport: " + ground.getSportType());

        ground.setCapacity(45000);
        System.out.println("Capacity: " + ground.getCapacity());

        ground.setSurfaceType("Grass");
        System.out.println("Surface: " + ground.getSurfaceType());

        ground.setFloodLights(true);
        System.out.println("Flood Lights: " + ground.getFloodLights());

        ground.setOwner("Sports Authority");
        System.out.println("Owner: " + ground.getOwner());


        PlayGround ground1 = new PlayGround();

        ground1.setGroundName("City Turf");
        System.out.println("Ground Name: " + ground1.getGroundName());

        ground1.setLocation("Bangalore");
        System.out.println("Location: " + ground1.getLocation());

        ground1.setSportType("Football");
        System.out.println("Sport: " + ground1.getSportType());

        ground1.setCapacity(7000);
        System.out.println("Capacity: " + ground1.getCapacity());

        ground1.setSurfaceType("Artificial Turf");
        System.out.println("Surface: " + ground1.getSurfaceType());

        ground1.setFloodLights(true);
        System.out.println("Flood Lights: " + ground1.getFloodLights());

        ground1.setOwner("Private");
        System.out.println("Owner: " + ground1.getOwner());


        PlayGround ground2 = new PlayGround();

        ground2.setGroundName("School Play Area");
        System.out.println("Ground Name: " + ground2.getGroundName());

        ground2.setLocation("Mysore");
        System.out.println("Location: " + ground2.getLocation());

        ground2.setSportType("Multi Sport");
        System.out.println("Sport: " + ground2.getSportType());

        ground2.setCapacity(200);
        System.out.println("Capacity: " + ground2.getCapacity());

        ground2.setSurfaceType("Clay");
        System.out.println("Surface: " + ground2.getSurfaceType());

        ground2.setFloodLights(false);
        System.out.println("Flood Lights: " + ground2.getFloodLights());

        ground2.setOwner("School");
        System.out.println("Owner: " + ground2.getOwner());


        PlayGround ground3 = new PlayGround();

        ground3.setGroundName("Local Ground");
        System.out.println("Ground Name: " + ground3.getGroundName());

        ground3.setLocation("Hubli");
        System.out.println("Location: " + ground3.getLocation());

        ground3.setSportType("Cricket");
        System.out.println("Sport: " + ground3.getSportType());

        ground3.setCapacity(5000);
        System.out.println("Capacity: " + ground3.getCapacity());

        ground3.setSurfaceType("Matting");
        System.out.println("Surface: " + ground3.getSurfaceType());

        ground3.setFloodLights(false);
        System.out.println("Flood Lights: " + ground3.getFloodLights());

        ground3.setOwner("Municipality");
        System.out.println("Owner: " + ground3.getOwner());


        PlayGround ground4 = new PlayGround();

        ground4.setGroundName("Indoor Arena");
        System.out.println("Ground Name: " + ground4.getGroundName());

        ground4.setLocation("Hyderabad");
        System.out.println("Location: " + ground4.getLocation());

        ground4.setSportType("Badminton");
        System.out.println("Sport: " + ground4.getSportType());

        ground4.setCapacity(100);
        System.out.println("Capacity: " + ground4.getCapacity());

        ground4.setSurfaceType("Wooden");
        System.out.println("Surface: " + ground4.getSurfaceType());

        ground4.setFloodLights(true);
        System.out.println("Flood Lights: " + ground4.getFloodLights());

        ground4.setOwner("Academy");
        System.out.println("Owner: " + ground4.getOwner());

    }
}