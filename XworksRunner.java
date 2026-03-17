class XworksRunner{
public static void main(String[] args){
   Duration duration = new Duration(3);
   
   String[] courses= {"Java", "Web-Tech", "MySQL"};
   Course course = new Course(17, courses,duration);
  
   String[] branches={"Rajajinagar","BTM Layout"};
   Xworks xworks = new Xworks("Sg22rom_Intern",360, branches, course);
   
   xworks.getDetails();
}
}
   