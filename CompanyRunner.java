class CompanyRunner{
public static void main(String[] args){
   String[] technologies={"Java", "Servelets","Web-tech", "MySQL"};
   Project project = new Project(769, "Health Domain", "Medical", technologies);
   String[] department={"Development", "Testing", "HR"};
   Company company = new Company(117, "Tesla", "Musk", department,project);
   company.getDetails();
   
   String[] technologies1={"Java", "Spring","Web-tech", "MySQL"};
   Project project1 = new Project(360, "Finance", "Money transaction managemnet", technologies1);
   String[] department1={"DEvelopment", "Storage", "TEsting"};
   Company company1 = new Company(169, "Apple", "Steve", department1,project1);
   company1.getDetails();
   
   
   }
  }
   