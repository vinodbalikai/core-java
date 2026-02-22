class JobPortal{
	static String[] searchJobsByCompany(String companyName){
		if(companyName.equals("TCS")){
			System.out.println("The company name is: "+companyName);
			String[] jobsInTCS={"System Engineer","Senior Engineer","Test Engineer","Quality Engineer","Senior Test Engineer","IT analyst","SAP consultant","System analyst","Technical consultant","Test Analyst","Technology analyst","Software Engineer","Developer","Java Developer","Technical lead","IT enginner","Software Test enginner","Process lead","Consultant","Shift Leader"};
			return jobsInTCS;
		}else if(companyName.equals("Wipro")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInWipro={"Project Enginner","Program Manager","Senior project manager","Senior program manager","Senior associate","Associate","Executive","Engineer","Senior Engineer","Associate Engineer","Softeware Enginner","Technical Lead","Developer","Software Test Engineer","Java Developer","Admisitrator","Data Entry Cleark","Consultant","Project lead","Team leader"};
			return jobsInWipro;
		}else if(companyName.equals("Amazon")){
			System.out.println("The Company name is: "+companyName);
			String []jobsInAmazon={"Associate","Ambassador","Tier 1 Agent","Team Member","Spacialist","Receiving cleark","Delivery Driver","Driver","Area Manager","manager","Shift Leader","Supervioser","Clerk","Store Shopper","Receiving Associate","Personal Shopper","Inventory specilist","Laborer","Builder","Tractor Operator","Safety specilist","Recruiter","Program manager","Project coordinator","Logiatics Associate"} ;
			return jobsInAmazon;
		}else if(companyName.equals("Google")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInGoogle={"Intern","Enginner","Spacialist","Contractor","Associate","Assistant","Analyst","Data Scientist","data evaluator","Senior Analyst","Junior Analyst","Manager","Operation lead","Shift Leader","Operation manager","Chief Executive Officer","Team Leader","Sales associate","Account manager","Sales Representative"};
			return jobsInGoogle;
		}else if(companyName.equals("Microsoft")){
			System.out.println("The Company name is: "+companyName);
			String []jobsInMicrosoft={"Software enginner","Senior Software enginner","Software test Engineer","Developer","Technical Leader","Product Manager","Consultant","Shift Leader","Technical Advisor","Associate Consultant","Manager","Duty manager","Intern","Partner","Executive","Enginner","Associate","New Graduate","Sales Executive","Account manager"};
			return jobsInMicrosoft;
		}else if (companyName.equals("Bosch")){
			System.out.println("The company name is: "+companyName);
			String []jobsInBosch={"Software Engineer","Senior Software Enginner","Product Enginner","Developer","Technical Lead","Product Manager","Senior Engineer","Intern","Engineer","Spacialist","Apprentice","Trainee Engineer","Assistant Manager","Deputy Manager","Manager","Process Lead","Management Trainee","Technical Trainee","Technician","Operator","Fitter"};
			return jobsInBosch;
		}else if(companyName.equals("Infosys")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInInfosys={"System Engineer","Senior System Engineer","Software Engineer","Senior Software Engineer","Test Engineer","Quality Analyst","Technology Analyst","Technology Lead","Project Manager","Consultant","Associate Consultant","Developer","Java Developer","Support Engineer","IT Analyst","Business Analyst","Data Analyst","Technical Lead","Process Executive","Delivery Manager"};
			return jobsInInfosys;
		}else if(companyName.equals("Accenture")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAccenture={"Associate","Senior Associate","Software Engineer","Application Developer","Test Engineer","Quality Engineer","Project Manager","Program Manager","Business Analyst","Consultant","Technical Consultant","System Analyst","Security Analyst","Cloud Engineer","Data Engineer","Java Developer","Support Analyst","Team Lead","Operations Lead","Delivery Lead"};
			return jobsInAccenture;
		}else if(companyName.equals("Capgemini")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCapgemini={"Software Engineer","Senior Software Engineer","Consultant","Senior Consultant","Test Engineer","Quality Analyst","Project Manager","Program Manager","Associate Consultant","Technical Lead","System Analyst","Java Developer","Cloud Engineer","Network Engineer","Support Engineer","Business Analyst","Data Analyst","Operations Manager","Team Leader","Delivery Manager"};
			return jobsInCapgemini;
		}else if(companyName.equals("HCL")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHCL={"Software Engineer","Senior Software Engineer","System Engineer","Senior System Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Associate","Senior Associate","Consultant","Infrastructure Engineer","Network Engineer","Support Analyst","Business Analyst","Data Analyst","Java Developer","Cloud Specialist","Operations Lead","Delivery Manager"};
			return jobsInHCL;
		}else if(companyName.equals("IBM")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInIBM={"Software Developer","Senior Developer","System Engineer","Technical Specialist","Consultant","Senior Consultant","Data Scientist","AI Engineer","Cloud Engineer","Security Analyst","Project Manager","Program Manager","Business Analyst","Support Engineer","Java Developer","Test Engineer","Researcher","Product Manager","Operations Manager","Technical Lead"};
			return jobsInIBM;
		}else if(companyName.equals("Oracle")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInOracle={"Software Developer","Senior Software Developer","Database Administrator","Cloud Engineer","Technical Analyst","Consultant","Senior Consultant","Support Engineer","Java Developer","Test Engineer","Quality Analyst","Product Manager","Project Manager","Program Manager","Business Analyst","Data Engineer","Security Engineer","Operations Manager","Technical Lead","System Analyst"};
			return jobsInOracle;
		}else if(companyName.equals("Deloitte")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDeloitte={"Analyst","Senior Analyst","Consultant","Senior Consultant","Associate Consultant","Business Analyst","Risk Analyst","Audit Associate","Tax Consultant","Project Manager","Program Manager","Technology Consultant","Cyber Security Analyst","Data Analyst","Cloud Consultant","Software Engineer","Quality Analyst","Operations Lead","Manager","Delivery Manager"};
			return jobsInDeloitte;
		}else if(companyName.equals("Cognizant")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCognizant={"Programmer Analyst","Senior Programmer Analyst","Software Engineer","Senior Software Engineer","Test Engineer","Quality Analyst","Project Manager","Associate","Senior Associate","Consultant","Technical Lead","Java Developer","Cloud Engineer","Infrastructure Engineer","Support Analyst","Business Analyst","Data Analyst","Team Leader","Operations Manager","Delivery Manager"};
			return jobsInCognizant;
		}else if(companyName.equals("Tech Mahindra")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTechMahindra={"Software Engineer","Senior Software Engineer","System Engineer","Technical Associate","Associate Engineer","Test Engineer","Quality Analyst","Project Manager","Program Manager","Consultant","Business Analyst","Java Developer","Network Engineer","Cloud Engineer","Support Engineer","Data Analyst","Technical Lead","Operations Lead","Team Leader","Delivery Manager"};
			return jobsInTechMahindra;
		}else if(companyName.equals("L&T")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLT={"Graduate Engineer Trainee","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Project Manager","Design Engineer","Site Engineer","Quality Engineer","Safety Officer","Planning Engineer","Procurement Engineer","Maintenance Engineer","Technical Lead","Consultant","Operations Manager","Supervisor","Technician","Fitter"};
			return jobsInLT;
		}else if(companyName.equals("Flipkart")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInFlipkart={"Software Engineer","Senior Software Engineer","Associate","Senior Associate","Warehouse Associate","Delivery Executive","Area Manager","Operations Manager","Product Manager","Business Analyst","Data Analyst","Support Engineer","Java Developer","Test Engineer","Quality Analyst","Team Leader","Shift Manager","Supply Chain Analyst","Inventory Specialist","Program Manager"};
			return jobsInFlipkart;
		}else if(companyName.equals("Paytm")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPaytm={"Software Engineer","Senior Software Engineer","Android Developer","iOS Developer","Backend Developer","Frontend Developer","Product Manager","Business Analyst","Data Analyst","Security Analyst","Support Engineer","Test Engineer","Quality Engineer","Operations Executive","Team Leader","Technical Lead","Project Manager","Program Manager","Associate","Consultant"};
			return jobsInPaytm;
		}else if(companyName.equals("PhonePe")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPhonePe={"Software Engineer","Senior Software Engineer","Backend Engineer","Frontend Engineer","Android Developer","Product Manager","Business Analyst","Data Scientist","Security Engineer","Test Engineer","Quality Analyst","Support Engineer","Operations Manager","Technical Lead","Project Manager","Associate","Senior Associate","Consultant","Risk Analyst","Compliance Officer"};
			return jobsInPhonePe;
		}else if(companyName.equals("Byjus")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInByjus={"Business Development Associate","Senior Associate","Sales Executive","Academic Specialist","Content Developer","Software Engineer","Senior Software Engineer","Product Manager","Support Executive","Customer Success Manager","Operations Manager","Team Leader","Project Manager","Program Manager","Data Analyst","Marketing Executive","Trainer","Consultant","Quality Analyst","Technical Lead"};
			return jobsInByjus;
		}else if(companyName.equals("Swiggy")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSwiggy={"Delivery Partner","Associate","Senior Associate","Operations Executive","Operations Manager","Area Manager","Software Engineer","Senior Software Engineer","Product Manager","Business Analyst","Data Analyst","Support Executive","Customer Success Executive","Supply Chain Analyst","Inventory Specialist","Team Leader","Shift Manager","Program Manager","Project Manager","Quality Analyst"};
			return jobsInSwiggy;
		}else if(companyName.equals("Zomato")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInZomato={"Delivery Executive","Associate","Senior Associate","Operations Executive","Operations Manager","Area Manager","Software Engineer","Senior Software Engineer","Product Manager","Business Analyst","Data Analyst","Customer Support Executive","Quality Analyst","Supply Chain Analyst","Inventory Specialist","Team Leader","Shift Manager","Program Manager","Project Manager","Marketing Executive"};
			return jobsInZomato;
		}else if(companyName.equals("Reliance")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInReliance={"Graduate Engineer Trainee","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Site Engineer","Maintenance Engineer","Safety Officer","Quality Engineer","Planning Engineer","Procurement Executive","Business Analyst","Data Analyst","Technical Lead","Supervisor","Technician","Operator","Consultant"};
			return jobsInReliance;
		}else if(companyName.equals("Adani")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAdani={"Graduate Engineer Trainee","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Site Engineer","Maintenance Engineer","Safety Officer","Quality Engineer","Planning Engineer","Procurement Executive","Business Analyst","Technical Lead","Supervisor","Technician","Operator","Consultant","Project Manager"};
			return jobsInAdani;
		}else if(companyName.equals("Tata Motors")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTataMotors={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Graduate Engineer Trainee","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Project Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Test Engineer"};
			return jobsInTataMotors;
		}else if(companyName.equals("Mahindra")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMahindra={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Graduate Engineer Trainee","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Project Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Test Engineer"};
			return jobsInMahindra;
		}else if(companyName.equals("Siemens")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSiemens={"Software Engineer","Senior Software Engineer","Design Engineer","Project Engineer","Automation Engineer","Control Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Consultant","Business Analyst","Data Analyst","Operations Manager","Maintenance Engineer","Support Engineer","Associate","Senior Associate","Manager"};
			return jobsInSiemens;
		}else if(companyName.equals("Samsung")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSamsung={"Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Research Engineer","Data Analyst","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager"};
			return jobsInSamsung;
		}else if(companyName.equals("Sony")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSony={"Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Test Engineer","Quality Analyst","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Data Analyst","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager","Sales Executive"};
			return jobsInSony;
		}else if(companyName.equals("Intel")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInIntel={"Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Validation Engineer","Test Engineer","Quality Engineer","Research Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Data Analyst","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager"};
			return jobsInIntel;
		}else if(companyName.equals("Nvidia")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInNvidia={"Software Engineer","Senior Software Engineer","GPU Engineer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Research Scientist","Product Manager","Project Manager","Technical Lead","Support Engineer","Data Scientist","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager"};
			return jobsInNvidia;
		}else if(companyName.equals("Cisco")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCisco={"Network Engineer","Senior Network Engineer","Software Engineer","Senior Software Engineer","Security Engineer","Cloud Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Support Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager"};
			return jobsInCisco;
		}else if(companyName.equals("HP")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHP={"Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager","Sales Executive"};
			return jobsInHP;
		}else if(companyName.equals("Dell")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDell={"Software Engineer","Senior Software Engineer","Hardware Engineer","System Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Security Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager","Sales Executive"};
			return jobsInDell;
		}else if(companyName.equals("Lenovo")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLenovo={"Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager","Sales Executive"};
			return jobsInLenovo;
		}else if(companyName.equals("Asus")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAsus={"Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Developer","Manager","Sales Executive"};
			return jobsInAsus;
		}else if(companyName.equals("Panasonic")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPanasonic={"Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Project Manager","Product Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Technician","Supervisor"};
			return jobsInPanasonic;
		}else if(companyName.equals("LG")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLG={"Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Project Manager","Product Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Technician","Supervisor"};
			return jobsInLG;
		}else if(companyName.equals("Philips")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPhilips={"Software Engineer","Senior Software Engineer","Biomedical Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Project Manager","Product Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Technician","Supervisor"};
			return jobsInPhilips;
		}else if(companyName.equals("Xiaomi")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInXiaomi={"Software Engineer","Senior Software Engineer","Android Developer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Sales Executive","Manager"};
			return jobsInXiaomi;
		}else if(companyName.equals("Oppo")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInOppo={"Software Engineer","Senior Software Engineer","Android Developer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Sales Executive","Manager"};
			return jobsInOppo;
		}else if(companyName.equals("Vivo")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInVivo={"Software Engineer","Senior Software Engineer","Android Developer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Sales Executive","Manager"};
			return jobsInVivo;
		}else if(companyName.equals("Realme")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInRealme={"Software Engineer","Senior Software Engineer","Android Developer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Sales Executive","Manager"};
			return jobsInRealme;
		}else if(companyName.equals("OnePlus")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInOnePlus={"Software Engineer","Senior Software Engineer","Android Developer","Hardware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Technical Lead","Support Engineer","Research Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Sales Executive","Manager"};
			return jobsInOnePlus;
		}else if(companyName.equals("Havells")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHavells={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInHavells;
		}else if(companyName.equals("Bajaj")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBajaj={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInBajaj;
		}else if(companyName.equals("Hero")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHero={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInHero;
		}else if(companyName.equals("TVS")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTVS={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInTVS;
		}else if(companyName.equals("Ashok Leyland")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAshokLeyland={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInAshokLeyland;
		}else if(companyName.equals("Maruti Suzuki")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMarutiSuzuki={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInMarutiSuzuki;
		}else if(companyName.equals("Hyundai")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHyundai={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInHyundai;
		}else if(companyName.equals("Honda")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHonda={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInHonda;
		}else if(companyName.equals("Ford")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInFord={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInFord;
		}else if(companyName.equals("Toyota")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInToyota={"Design Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Safety Officer","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Sales Executive","Service Engineer"};
			return jobsInToyota;
		}else if(companyName.equals("Nestle")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInNestle={"Production Executive","Quality Analyst","Food Technologist","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant"};
			return jobsInNestle;
		}else if(companyName.equals("PepsiCo")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPepsiCo={"Production Executive","Quality Analyst","Food Technologist","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant"};
			return jobsInPepsiCo;
		}else if(companyName.equals("CocaCola")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCocaCola={"Production Executive","Quality Analyst","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant","Packaging Engineer"};
			return jobsInCocaCola;
		}else if(companyName.equals("ITC")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInITC={"Production Executive","Quality Analyst","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant","Packaging Engineer"};
			return jobsInITC;
		}else if(companyName.equals("Hindustan Unilever")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHindustanUnilever={"Production Executive","Quality Analyst","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant","Packaging Engineer"};
			return jobsInHindustanUnilever;
		}else if(companyName.equals("Patanjali")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPatanjali={"Production Executive","Quality Analyst","Ayurveda Specialist","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant"};
			return jobsInPatanjali;
		}else if(companyName.equals("Britannia")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBritannia={"Production Executive","Quality Analyst","Food Technologist","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant"};
			return jobsInBritannia;
		}else if(companyName.equals("Amul")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAmul={"Production Executive","Quality Analyst","Dairy Technologist","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant"};
			return jobsInAmul;
		}else if(companyName.equals("Dabur")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDabur={"Production Executive","Quality Analyst","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant","Research Associate"};
			return jobsInDabur;
		}else if(companyName.equals("Colgate")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInColgate={"Production Executive","Quality Analyst","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant","Packaging Engineer"};
			return jobsInColgate;
		}else if(companyName.equals("Procter & Gamble")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPG={"Production Executive","Quality Analyst","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant","Packaging Engineer"};
			return jobsInPG;
		}else if(companyName.equals("L'Oreal")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLOreal={"Production Executive","Quality Analyst","Research Scientist","Maintenance Engineer","Supply Chain Analyst","Operations Manager","Assistant Manager","Deputy Manager","Manager","Project Manager","Procurement Executive","Planning Executive","Technical Lead","Supervisor","Technician","Operator","Sales Executive","Marketing Executive","Business Analyst","Consultant"};
			return jobsInLOreal;
		}else if(companyName.equals("Walmart")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInWalmart={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInWalmart;
		}else if(companyName.equals("Target")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTarget={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInTarget;
		}else if(companyName.equals("Ikea")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInIkea={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInIkea;
		}else if(companyName.equals("Metro")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMetro={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInMetro;
		}else if(companyName.equals("Big Bazaar")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBigBazaar={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInBigBazaar;
		}else if(companyName.equals("Reliance Retail")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInRelianceRetail={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInRelianceRetail;
		}else if(companyName.equals("DMart")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDMart={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInDMart;
		}else if(companyName.equals("Spencer's")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSpencers={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInSpencers;
		}else if(companyName.equals("Future Group")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInFutureGroup={"Store Associate","Senior Associate","Warehouse Associate","Inventory Specialist","Operations Manager","Assistant Manager","Store Manager","Area Manager","Supply Chain Analyst","Business Analyst","Data Analyst","Customer Service Executive","Sales Executive","Team Leader","Shift Manager","Project Manager","Program Manager","Support Engineer","Consultant","Supervisor"};
			return jobsInFutureGroup;
		}else if(companyName.equals("Tata Steel")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTataSteel={"Production Engineer","Quality Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Metallurgist","Consultant","Research Engineer","Shift Manager"};
			return jobsInTataSteel;
		}else if(companyName.equals("JSW Steel")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInJSWSteel={"Production Engineer","Quality Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Metallurgist","Consultant","Research Engineer","Shift Manager"};
			return jobsInJSWSteel;
		}else if(companyName.equals("SAIL")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSAIL={"Production Engineer","Quality Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Metallurgist","Consultant","Research Engineer","Shift Manager"};
			return jobsInSAIL;
		}else if(companyName.equals("Vedanta")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInVedanta={"Mining Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Research Engineer","Shift Manager"};
			return jobsInVedanta;
		}else if(companyName.equals("Coal India")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCoalIndia={"Mining Engineer","Production Engineer","Quality Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Surveyor","Shift Manager"};
			return jobsInCoalIndia;
		}else if(companyName.equals("ONGC")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInONGC={"Petroleum Engineer","Production Engineer","Drilling Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Geologist","Consultant","Shift Manager"};
			return jobsInONGC;
		}else if(companyName.equals("Indian Oil")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInIndianOil={"Production Engineer","Chemical Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Research Engineer","Consultant","Shift Manager","Quality Engineer"};
			return jobsInIndianOil;
		}else if(companyName.equals("Bharat Petroleum")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBPCL={"Production Engineer","Chemical Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Research Engineer","Consultant","Shift Manager","Quality Engineer"};
			return jobsInBPCL;
		}else if(companyName.equals("Hindustan Petroleum")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHPCL={"Production Engineer","Chemical Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Research Engineer","Consultant","Shift Manager","Quality Engineer"};
			return jobsInHPCL;
		}else if(companyName.equals("GAIL")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInGAIL={"Production Engineer","Pipeline Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Research Engineer","Consultant","Shift Manager","Quality Engineer"};
			return jobsInGAIL;
		}else if(companyName.equals("NTPC")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInNTPC={"Electrical Engineer","Mechanical Engineer","Production Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Shift Manager","Quality Engineer"};
			return jobsInNTPC;
		}else if(companyName.equals("Power Grid")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPowerGrid={"Electrical Engineer","Transmission Engineer","Maintenance Engineer","Safety Officer","Project Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Shift Manager","Quality Engineer","Site Engineer"};
			return jobsInPowerGrid;
		}else if(companyName.equals("ABB")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInABB={"Automation Engineer","Electrical Engineer","Software Engineer","Senior Software Engineer","Design Engineer","Project Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Support Engineer","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Service Engineer","Manager","Supervisor"};
			return jobsInABB;
		}else if(companyName.equals("Schneider Electric")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSchneiderElectric={"Automation Engineer","Electrical Engineer","Software Engineer","Senior Software Engineer","Design Engineer","Project Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Support Engineer","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Service Engineer","Manager","Supervisor"};
			return jobsInSchneiderElectric;
		}else if(companyName.equals("Honeywell")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHoneywell={"Automation Engineer","Software Engineer","Senior Software Engineer","Hardware Engineer","Design Engineer","Project Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Support Engineer","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Service Engineer","Manager","Supervisor"};
			return jobsInHoneywell;
		}else if(companyName.equals("3M")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsIn3M={"Production Engineer","Quality Engineer","Maintenance Engineer","Research Scientist","Project Engineer","Senior Engineer","Assistant Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Consultant","Business Analyst","Product Manager","Service Engineer","Shift Manager"};
			return jobsIn3M;
		}else if(companyName.equals("General Electric")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInGE={"Software Engineer","Senior Software Engineer","Mechanical Engineer","Electrical Engineer","Design Engineer","Project Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Support Engineer","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Service Engineer","Manager","Supervisor"};
			return jobsInGE;
		}else if(companyName.equals("Boeing")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBoeing={"Aerospace Engineer","Design Engineer","Mechanical Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Research Engineer","Consultant","Test Engineer","Shift Manager"};
			return jobsInBoeing;
		}else if(companyName.equals("Airbus")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAirbus={"Aerospace Engineer","Design Engineer","Mechanical Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Assistant Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Research Engineer","Consultant","Test Engineer","Shift Manager"};
			return jobsInAirbus;
		}else if(companyName.equals("SpaceX")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSpaceX={"Aerospace Engineer","Design Engineer","Mechanical Engineer","Software Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Research Engineer","Consultant","Test Engineer","Shift Manager"};
			return jobsInSpaceX;
		}else if(companyName.equals("Blue Origin")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBlueOrigin={"Aerospace Engineer","Design Engineer","Mechanical Engineer","Software Engineer","Quality Engineer","Maintenance Engineer","Project Engineer","Senior Engineer","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Operator","Research Engineer","Consultant","Test Engineer","Shift Manager"};
			return jobsInBlueOrigin;
		}else if(companyName.equals("Uber")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInUber={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Operations Manager","Support Engineer","Business Analyst","Associate","Senior Associate","Technical Lead","Security Engineer","Driver Partner","Team Leader","Consultant"};
			return jobsInUber;
		}else if(companyName.equals("Ola")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInOla={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Operations Manager","Support Engineer","Business Analyst","Associate","Senior Associate","Technical Lead","Security Engineer","Driver Partner","Team Leader","Consultant"};
			return jobsInOla;
		}else if(companyName.equals("Zoom")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInZoom={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Manager"};
			return jobsInZoom;
		}else if(companyName.equals("Slack")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSlack={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Manager"};
			return jobsInSlack;
		}else if(companyName.equals("Dropbox")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDropbox={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Data Analyst","Associate","Senior Associate","Operations Manager","Consultant","Manager"};
			return jobsInDropbox;
		}else if(companyName.equals("Spotify")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSpotify={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Security Engineer","Cloud Engineer","Associate","Senior Associate","Operations Manager","Consultant","Manager","Research Engineer"};
			return jobsInSpotify;
		}else if(companyName.equals("Netflix")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInNetflix={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Security Engineer","Cloud Engineer","Associate","Senior Associate","Operations Manager","Consultant","Manager","Content Analyst"};
			return jobsInNetflix;
		}else if(companyName.equals("Disney")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDisney={"Software Engineer","Senior Software Engineer","Animator","Graphic Designer","Content Creator","Video Editor","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Marketing Executive","Associate","Senior Associate","Operations Manager","Consultant","Manager","Research Analyst","Sales Executive"};
			return jobsInDisney;
		}else if(companyName.equals("Warner Bros")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInWarnerBros={"Software Engineer","Senior Software Engineer","Animator","Graphic Designer","Content Creator","Video Editor","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Marketing Executive","Associate","Senior Associate","Operations Manager","Consultant","Manager","Research Analyst","Sales Executive"};
			return jobsInWarnerBros;
		}else if(companyName.equals("Sony Pictures")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSonyPictures={"Software Engineer","Senior Software Engineer","Animator","Graphic Designer","Content Creator","Video Editor","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Marketing Executive","Associate","Senior Associate","Operations Manager","Consultant","Manager","Research Analyst","Sales Executive"};
			return jobsInSonyPictures;
		}else if(companyName.equals("Facebook")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInFacebook={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Security Engineer","Cloud Engineer","Associate","Senior Associate","Operations Manager","Consultant","Manager"};
			return jobsInFacebook;
		}else if(companyName.equals("Twitter")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTwitter={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Security Engineer","Cloud Engineer","Associate","Senior Associate","Operations Manager","Consultant","Manager"};
			return jobsInTwitter;
		}else if(companyName.equals("LinkedIn")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLinkedIn={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Security Engineer","Cloud Engineer","Associate","Senior Associate","Operations Manager","Consultant","Manager","Recruiter"};
			return jobsInLinkedIn;
		}else if(companyName.equals("Pinterest")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPinterest={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Security Engineer","Cloud Engineer","Associate","Senior Associate","Operations Manager","Consultant","Manager","Designer"};
			return jobsInPinterest;
		}else if(companyName.equals("Snapchat")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSnapchat={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Security Engineer","Cloud Engineer","Associate","Senior Associate","Operations Manager","Consultant","Manager"};
			return jobsInSnapchat;
		}else if(companyName.equals("Reddit")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInReddit={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Security Engineer","Cloud Engineer","Associate","Senior Associate","Operations Manager","Consultant","Manager","Community Manager"};
			return jobsInReddit;
		}else if(companyName.equals("Telegram")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTelegram={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Security Engineer","Cloud Engineer","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Manager","Research Engineer"};
			return jobsInTelegram;
		}else if(companyName.equals("PayPal")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPayPal={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Security Engineer","Cloud Engineer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Manager","Risk Analyst"};
			return jobsInPayPal;
		}else if(companyName.equals("Stripe")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInStripe={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Security Engineer","Cloud Engineer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Manager","Risk Analyst"};
			return jobsInStripe;
		}else if(companyName.equals("Razorpay")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInRazorpay={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Security Engineer","Cloud Engineer","Data Scientist","Data Analyst","Product Manager","Project Manager","Program Manager","Technical Lead","Support Engineer","Business Analyst","Associate","Senior Associate","Operations Manager","Consultant","Manager","Risk Analyst"};
			return jobsInRazorpay;
		}else if(companyName.equals("Infosys")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInInfosys={"Software Engineer","Senior Software Engineer","System Engineer","Test Engineer","Quality Analyst","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Java Developer","Cloud Engineer","Security Engineer","Developer","Team Leader"};
			return jobsInInfosys;
		}else if(companyName.equals("HCL")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHCL={"Software Engineer","Senior Software Engineer","System Engineer","Test Engineer","Quality Analyst","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Java Developer","Cloud Engineer","Security Engineer","Developer","Team Leader"};
			return jobsInHCL;
		}else if(companyName.equals("Capgemini")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCapgemini={"Software Engineer","Senior Software Engineer","System Engineer","Test Engineer","Quality Analyst","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Java Developer","Cloud Engineer","Security Engineer","Developer","Team Leader"};
			return jobsInCapgemini;
		}else if(companyName.equals("Accenture")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAccenture={"Software Engineer","Senior Software Engineer","System Engineer","Test Engineer","Quality Analyst","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Java Developer","Cloud Engineer","Security Engineer","Developer","Team Leader"};
			return jobsInAccenture;
		}else if(companyName.equals("Cognizant")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCognizant={"Software Engineer","Senior Software Engineer","System Engineer","Test Engineer","Quality Analyst","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Java Developer","Cloud Engineer","Security Engineer","Developer","Team Leader"};
			return jobsInCognizant;
		}else if(companyName.equals("Mindtree")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMindtree={"Software Engineer","Senior Software Engineer","System Engineer","Test Engineer","Quality Analyst","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Java Developer","Cloud Engineer","Security Engineer","Developer","Team Leader"};
			return jobsInMindtree;
		}else if(companyName.equals("L&T")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLT={"Project Engineer","Senior Engineer","Site Engineer","Quality Engineer","Design Engineer","Maintenance Engineer","Assistant Manager","Deputy Manager","Manager","Operations Manager","Planning Engineer","Procurement Engineer","Technical Lead","Supervisor","Technician","Consultant","Safety Officer","Project Manager","Shift Manager","Civil Engineer"};
			return jobsInLT;
		}else if(companyName.equals("Tech Mahindra")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTechMahindra={"Software Engineer","Senior Software Engineer","System Engineer","Test Engineer","Quality Analyst","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Java Developer","Cloud Engineer","Security Engineer","Developer","Team Leader"};
			return jobsInTechMahindra;
		}else if(companyName.equals("Oracle")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInOracle={"Software Engineer","Senior Software Engineer","Database Administrator","Cloud Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Java Developer","Security Engineer","Developer","Manager"};
			return jobsInOracle;
		}else if(companyName.equals("SAP")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSAP={"Software Engineer","Senior Software Engineer","SAP Consultant","SAP Developer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Cloud Engineer","Security Engineer","Developer","Manager"};
			return jobsInSAP;
		}else if(companyName.equals("VMware")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInVMware={"Software Engineer","Senior Software Engineer","Cloud Engineer","Virtualization Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Manager","Research Engineer"};
			return jobsInVMware;
		}else if(companyName.equals("ServiceNow")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInServiceNow={"Software Engineer","Senior Software Engineer","Cloud Engineer","Platform Developer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Manager","Product Manager"};
			return jobsInServiceNow;
		}else if(companyName.equals("Atlassian")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAtlassian={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Product Manager"};
			return jobsInAtlassian;
		}else if(companyName.equals("Adobe")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAdobe={"Software Engineer","Senior Software Engineer","Frontend Developer","Backend Developer","Cloud Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Designer"};
			return jobsInAdobe;
		}else if(companyName.equals("Autodesk")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAutodesk={"Software Engineer","Senior Software Engineer","Design Engineer","Frontend Developer","Backend Developer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Product Manager"};
			return jobsInAutodesk;
		}else if(companyName.equals("Salesforce")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSalesforce={"Software Engineer","Senior Software Engineer","Salesforce Developer","Salesforce Administrator","Cloud Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Product Manager"};
			return jobsInSalesforce;
		}else if(companyName.equals("Zoho")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInZoho={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Product Manager","Research Engineer"};
			return jobsInZoho;
		}else if(companyName.equals("Freshworks")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInFreshworks={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Product Manager"};
			return jobsInFreshworks;
		}else if(companyName.equals("Tally")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTally={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Accountant","Product Manager"};
			return jobsInTally;
		}else if(companyName.equals("QuickBooks")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInQuickBooks={"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer","Test Engineer","Quality Engineer","Technical Lead","Project Manager","Program Manager","Business Analyst","Data Analyst","Support Engineer","Consultant","Associate","Senior Associate","Operations Manager","Security Engineer","Developer","Accountant","Product Manager"};
			return jobsInQuickBooks;
		}else if(companyName.equals("Nvidia")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInNvidia={"Software Engineer","GPU Engineer","Hardware Engineer","Design Engineer","Verification Engineer","AI Engineer","Deep Learning Engineer","System Software Engineer","Research Engineer","Technical Program Manager","Product Manager","Developer","Senior Engineer","Test Engineer","Architect","Data Engineer","Solutions Architect","Application Engineer","Intern","Technical Lead"};
			return jobsInNvidia;
		}else if(companyName.equals("AMD")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAMD={"Processor Engineer","Hardware Engineer","Design Engineer","Verification Engineer","Software Engineer","Firmware Engineer","System Engineer","Product Engineer","Test Engineer","Application Engineer","Senior Engineer","Developer","Architect","Performance Engineer","Validation Engineer","Technical Lead","Project Manager","Research Engineer","Intern","Quality Engineer"};
			return jobsInAMD;
		}else if(companyName.equals("Intel")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInIntel={"Chip Design Engineer","Software Engineer","Hardware Engineer","System Engineer","Validation Engineer","Test Engineer","Firmware Engineer","Product Engineer","Process Engineer","Research Scientist","AI Engineer","Technical Lead","Architect","Developer","Senior Engineer","Security Engineer","Quality Engineer","Application Engineer","Intern","Program Manager"};
			return jobsInIntel;
		}else if(companyName.equals("Capgemini")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCapgemini={"Associate Consultant","Consultant","Senior Consultant","Software Engineer","Test Engineer","Business Analyst","Project Manager","Technical Lead","Developer","SAP Consultant","Data Analyst","Cloud Engineer","System Analyst","Support Engineer","Quality Analyst","Application Developer","Infrastructure Engineer","Technology Lead","Intern","Process Associate"};
			return jobsInCapgemini;
		}else if(companyName.equals("Cognizant")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCognizant={"Programmer Analyst","Associate","Senior Associate","Software Engineer","Test Engineer","Business Analyst","Consultant","Technical Lead","Project Manager","Developer","Data Analyst","Cloud Engineer","System Engineer","Support Engineer","Quality Engineer","Process Executive","Technology Specialist","Infrastructure Engineer","Intern","Delivery Manager"};
			return jobsInCognizant;
		}else if(companyName.equals("HCL")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHCL={"Software Engineer","Senior Software Engineer","Technical Lead","Project Manager","Developer","Test Engineer","System Engineer","Infrastructure Engineer","Support Engineer","Business Analyst","Consultant","Cloud Engineer","Network Engineer","Security Engineer","Quality Analyst","Process Associate","Data Engineer","Automation Engineer","Intern","Service Manager"};
			return jobsInHCL;
		}else if(companyName.equals("Tech Mahindra")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTechMahindra={"Software Engineer","Associate Software Engineer","Test Engineer","Developer","Technical Lead","Project Manager","Business Analyst","System Engineer","Network Engineer","Support Engineer","Quality Engineer","Cloud Engineer","Automation Engineer","Data Analyst","Process Associate","Consultant","Infrastructure Engineer","Service Desk Analyst","Intern","Delivery Lead"};
			return jobsInTechMahindra;
		}else if(companyName.equals("Mindtree")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMindtree={"Software Engineer","Associate Engineer","Test Engineer","Developer","Technical Lead","Project Manager","Business Analyst","Cloud Engineer","Data Engineer","Automation Engineer","Support Engineer","Quality Analyst","Consultant","System Engineer","Infrastructure Engineer","Process Executive","UI Developer","Full Stack Developer","Intern","Delivery Manager"};
			return jobsInMindtree;
		}else if(companyName.equals("L&T")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLNT={"Project Engineer","Site Engineer","Design Engineer","Planning Engineer","Civil Engineer","Mechanical Engineer","Electrical Engineer","Quality Engineer","Safety Engineer","Construction Manager","Supervisor","Technician","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Project Manager","Consultant","Trainee Engineer","Intern"};
			return jobsInLNT;
		}else if(companyName.equals("Siemens")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSiemens={"Automation Engineer","Electrical Engineer","Software Engineer","Design Engineer","Project Engineer","System Engineer","Control Engineer","Technical Lead","Project Manager","Product Engineer","Quality Engineer","Service Engineer","Application Engineer","Consultant","Research Engineer","Technician","Operator","Senior Engineer","Intern","Manager"};
			return jobsInSiemens;
		}else if(companyName.equals("Philips")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPhilips={"Biomedical Engineer","Software Engineer","Hardware Engineer","Product Engineer","Design Engineer","Quality Engineer","Test Engineer","Research Scientist","Clinical Specialist","Application Engineer","Technical Consultant","Project Manager","Service Engineer","Support Engineer","Data Analyst","Manufacturing Engineer","Senior Engineer","Technician","Intern","Manager"};
			return jobsInPhilips;
		}else if(companyName.equals("Panasonic")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPanasonic={"Electronics Engineer","Design Engineer","Production Engineer","Quality Engineer","Service Engineer","Technical Lead","Software Engineer","Hardware Engineer","Test Engineer","System Engineer","Manufacturing Engineer","Process Engineer","Technician","Operator","Senior Engineer","Product Manager","Project Manager","Support Engineer","Intern","Manager"};
			return jobsInPanasonic;
		}else if(companyName.equals("Hitachi")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHitachi={"Software Engineer","System Engineer","Electrical Engineer","Mechanical Engineer","Project Engineer","Design Engineer","Quality Engineer","Production Engineer","Service Engineer","Technical Consultant","Data Engineer","Cloud Engineer","Automation Engineer","Research Engineer","Senior Engineer","Technician","Operator","Intern","Project Manager","Manager"};
			return jobsInHitachi;
		}else if(companyName.equals("Oracle")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInOracle={"Software Developer","Database Administrator","Cloud Engineer","Application Engineer","Technical Consultant","Support Engineer","Data Analyst","Java Developer","System Analyst","Product Manager","Project Manager","Test Engineer","Quality Analyst","Security Engineer","DevOps Engineer","Solutions Architect","Business Analyst","Senior Engineer","Intern","Technical Lead"};
			return jobsInOracle;
		}else if(companyName.equals("Salesforce")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSalesforce={"Salesforce Developer","Salesforce Administrator","Cloud Engineer","Software Engineer","Technical Consultant","Business Analyst","Product Manager","Project Manager","Support Engineer","Application Engineer","Data Analyst","Solutions Architect","Test Engineer","Quality Engineer","Security Engineer","DevOps Engineer","Technical Lead","Senior Engineer","Intern","Account Executive"};
			return jobsInSalesforce;
		}else if(companyName.equals("SAP")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSAP={"SAP Consultant","SAP ABAP Developer","Software Engineer","Application Engineer","Technical Consultant","Business Analyst","Product Manager","Project Manager","Support Engineer","Cloud Engineer","Data Analyst","Test Engineer","Quality Engineer","Security Engineer","Solutions Architect","Technical Lead","Senior Engineer","System Engineer","Intern","Account Manager"};
			return jobsInSAP;
		}else if(companyName.equals("Dell")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDell={"Hardware Engineer","Software Engineer","Technical Support Engineer","System Engineer","Network Engineer","Cloud Engineer","Security Engineer","Data Analyst","Product Manager","Project Manager","Quality Engineer","Test Engineer","Application Engineer","Sales Executive","Account Manager","Field Engineer","Senior Engineer","Technician","Intern","Technical Lead"};
			return jobsInDell;
		}else if(companyName.equals("HP")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHP={"Hardware Engineer","Software Engineer","Technical Support Engineer","System Engineer","Network Engineer","Cloud Engineer","Security Engineer","Data Analyst","Product Manager","Project Manager","Quality Engineer","Test Engineer","Application Engineer","Sales Executive","Account Manager","Field Engineer","Senior Engineer","Technician","Intern","Technical Lead"};
			return jobsInHP;
		}else if(companyName.equals("Lenovo")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLenovo={"Hardware Engineer","Software Engineer","System Engineer","Technical Support Engineer","Network Engineer","Cloud Engineer","Security Engineer","Product Engineer","Quality Engineer","Test Engineer","Application Engineer","Sales Executive","Account Manager","Field Engineer","Manufacturing Engineer","Senior Engineer","Technician","Operator","Intern","Project Manager"};
			return jobsInLenovo;
		}else if(companyName.equals("Asus")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAsus={"Hardware Engineer","Software Engineer","Design Engineer","Test Engineer","System Engineer","Product Engineer","Quality Engineer","Application Engineer","Technical Support Engineer","Firmware Engineer","Manufacturing Engineer","Process Engineer","Field Engineer","Sales Executive","Account Manager","Senior Engineer","Technician","Operator","Intern","Project Manager"};
			return jobsInAsus;
		}else if(companyName.equals("Acer")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAcer={"Hardware Engineer","Software Engineer","System Engineer","Technical Support Engineer","Firmware Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Engineer","Application Engineer","Manufacturing Engineer","Process Engineer","Field Engineer","Network Engineer","Security Engineer","Sales Executive","Account Manager","Senior Engineer","Technician","Intern"};
			return jobsInAcer;
		}else if(companyName.equals("Cisco")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCisco={"Network Engineer","Software Engineer","Security Engineer","System Engineer","Technical Support Engineer","Cloud Engineer","DevOps Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Solutions Architect","Technical Consultant","Data Analyst","Automation Engineer","Infrastructure Engineer","Senior Engineer","Technical Lead","Intern","Service Engineer"};
			return jobsInCisco;
		}else if(companyName.equals("VMware")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInVMware={"Software Engineer","Cloud Engineer","Virtualization Engineer","System Engineer","Technical Support Engineer","DevOps Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Security Engineer","Automation Engineer","Infrastructure Engineer","Solutions Architect","Technical Consultant","Data Engineer","Senior Engineer","Technical Lead","Intern","Service Manager"};
			return jobsInVMware;
		}else if(companyName.equals("RedHat")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInRedHat={"Linux Engineer","Software Engineer","Cloud Engineer","System Administrator","DevOps Engineer","Technical Support Engineer","Security Engineer","Automation Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Solutions Architect","Technical Consultant","Infrastructure Engineer","Data Engineer","Senior Engineer","Technical Lead","Intern","Service Engineer"};
			return jobsInRedHat;
		}else if(companyName.equals("Zoho")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInZoho={"Software Developer","Web Developer","Product Developer","Test Engineer","Quality Analyst","Technical Support Engineer","System Engineer","UI Developer","Full Stack Developer","Cloud Engineer","Security Engineer","Data Analyst","Business Analyst","Project Manager","Product Manager","Technical Lead","Senior Engineer","Customer Support Executive","Intern","Service Engineer"};
			return jobsInZoho;
		}else if(companyName.equals("Paytm")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPaytm={"Software Engineer","Backend Developer","Frontend Developer","Mobile App Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Analyst","Business Analyst","Cloud Engineer","Security Engineer","Technical Support Engineer","Operations Executive","Customer Support Executive","Technical Lead","Senior Engineer","Account Manager","Intern","Service Manager"};
			return jobsInPaytm;
		}else if(companyName.equals("PhonePe")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPhonePe={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Analyst","Business Analyst","Cloud Engineer","Security Engineer","Technical Support Engineer","Operations Executive","Customer Support Executive","Technical Lead","Senior Engineer","Account Manager","Intern","Risk Analyst"};
			return jobsInPhonePe;
		}else if(companyName.equals("Flipkart")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInFlipkart={"Software Engineer","Backend Developer","Frontend Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Analyst","Business Analyst","Supply Chain Executive","Operations Manager","Warehouse Associate","Logistics Executive","Technical Support Engineer","Cloud Engineer","Security Engineer","Senior Engineer","Technical Lead","Intern","Account Manager"};
			return jobsInFlipkart;
		}else if(companyName.equals("Reliance")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInReliance={"Project Engineer","Process Engineer","Production Engineer","Mechanical Engineer","Electrical Engineer","Civil Engineer","Quality Engineer","Safety Engineer","Operations Manager","Plant Supervisor","Technician","Operator","Maintenance Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Project Manager","Trainee Engineer","Intern"};
			return jobsInReliance;
		}else if(companyName.equals("Adani")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAdani={"Project Engineer","Process Engineer","Production Engineer","Mechanical Engineer","Electrical Engineer","Civil Engineer","Quality Engineer","Safety Engineer","Operations Manager","Plant Supervisor","Technician","Operator","Maintenance Engineer","Senior Engineer","Assistant Manager","Deputy Manager","Manager","Project Manager","Trainee Engineer","Intern"};
			return jobsInAdani;
		}else if(companyName.equals("Tata Motors")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTataMotors={"Automobile Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Mechanical Engineer","Electrical Engineer","Service Engineer","Process Engineer","Manufacturing Engineer","Maintenance Engineer","Senior Engineer","Technician","Operator","Assistant Manager","Deputy Manager","Manager","Project Manager","Trainee Engineer","Intern"};
			return jobsInTataMotors;
		}else if(companyName.equals("Mahindra")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMahindra={"Automobile Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Mechanical Engineer","Electrical Engineer","Service Engineer","Process Engineer","Manufacturing Engineer","Maintenance Engineer","Senior Engineer","Technician","Operator","Assistant Manager","Deputy Manager","Manager","Project Manager","Trainee Engineer","Intern"};
			return jobsInMahindra;
		}else if(companyName.equals("Bajaj")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBajaj={"Automobile Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Mechanical Engineer","Electrical Engineer","Service Engineer","Process Engineer","Manufacturing Engineer","Maintenance Engineer","Senior Engineer","Technician","Operator","Assistant Manager","Deputy Manager","Manager","Project Manager","Trainee Engineer","Intern"};
			return jobsInBajaj;
		}else if(companyName.equals("TVS")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTVS={"Automobile Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Mechanical Engineer","Electrical Engineer","Service Engineer","Process Engineer","Manufacturing Engineer","Maintenance Engineer","Senior Engineer","Technician","Operator","Assistant Manager","Deputy Manager","Manager","Project Manager","Trainee Engineer","Intern"};
			return jobsInTVS;
		}else if(companyName.equals("Infosys")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInInfosys={"Systems Engineer","Software Engineer","Senior Systems Engineer","Test Engineer","Quality Analyst","Business Analyst","Consultant","Technical Lead","Project Manager","Developer","Data Analyst","Cloud Engineer","System Administrator","Support Engineer","Process Executive","Technology Analyst","Infrastructure Engineer","Associate","Intern","Delivery Manager"};
			return jobsInInfosys;
		}else if(companyName.equals("Accenture")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAccenture={"Associate Software Engineer","Software Engineer","Test Engineer","Quality Analyst","Business Analyst","Consultant","Technical Lead","Project Manager","Application Developer","Cloud Engineer","Security Engineer","Data Analyst","System Administrator","Support Engineer","Process Associate","Technology Analyst","Infrastructure Engineer","Senior Engineer","Intern","Delivery Lead"};
			return jobsInAccenture;
		}else if(companyName.equals("IBM")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInIBM={"Software Engineer","System Engineer","Cloud Engineer","AI Engineer","Data Scientist","Test Engineer","Quality Engineer","Technical Consultant","Business Analyst","Project Manager","Product Manager","Security Engineer","DevOps Engineer","Application Developer","Support Engineer","Research Scientist","Technical Lead","Senior Engineer","Intern","Service Engineer"};
			return jobsInIBM;
		}else if(companyName.equals("Uber")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInUber={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","Data Analyst","Product Manager","Project Manager","Operations Manager","Logistics Executive","Security Engineer","Cloud Engineer","Test Engineer","Quality Engineer","Technical Support Engineer","Business Analyst","Senior Engineer","Technical Lead","Intern","Driver Partner Manager"};
			return jobsInUber;
		}else if(companyName.equals("Ola")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInOla={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","Product Manager","Project Manager","Operations Manager","Logistics Executive","Security Engineer","Cloud Engineer","Test Engineer","Quality Engineer","Technical Support Engineer","Business Analyst","Senior Engineer","Technical Lead","Intern","Driver Support Executive","Fleet Manager"};
			return jobsInOla;
		}else if(companyName.equals("Swiggy")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSwiggy={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","Product Manager","Project Manager","Operations Executive","Logistics Executive","Delivery Executive","Cloud Engineer","Security Engineer","Test Engineer","Quality Engineer","Technical Support Engineer","Business Analyst","Senior Engineer","Technical Lead","Intern","Customer Support Executive"};
			return jobsInSwiggy;
		}else if(companyName.equals("Zomato")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInZomato={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","Product Manager","Project Manager","Operations Executive","Delivery Partner Manager","Logistics Executive","Cloud Engineer","Security Engineer","Test Engineer","Quality Engineer","Technical Support Engineer","Business Analyst","Senior Engineer","Technical Lead","Intern","Customer Support Executive"};
			return jobsInZomato;
		}else if(companyName.equals("Byju's")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInByjus={"Content Developer","Software Engineer","Test Engineer","Quality Analyst","Product Manager","Project Manager","Business Development Associate","Sales Executive","Academic Counselor","Technical Support Engineer","UI Developer","Full Stack Developer","Data Analyst","Cloud Engineer","Security Engineer","Operations Executive","Senior Engineer","Technical Lead","Intern","Customer Support Executive"};
			return jobsInByjus;
		}else if(companyName.equals("Unacademy")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInUnacademy={"Educator","Content Developer","Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Test Engineer","Quality Analyst","Product Manager","Project Manager","Business Analyst","Technical Support Engineer","Data Analyst","Cloud Engineer","Security Engineer","Operations Executive","Senior Engineer","Technical Lead","Intern","Customer Support Executive"};
			return jobsInUnacademy;
		}else if(companyName.equals("PayPal")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPayPal={"Software Engineer","Backend Developer","Frontend Developer","Security Engineer","Cloud Engineer","Data Analyst","Risk Analyst","Product Manager","Project Manager","Business Analyst","Test Engineer","Quality Engineer","Technical Support Engineer","Fraud Analyst","DevOps Engineer","Senior Engineer","Technical Lead","Account Manager","Intern","Operations Executive"};
			return jobsInPayPal;
		}else if(companyName.equals("Stripe")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInStripe={"Software Engineer","Backend Developer","Frontend Developer","API Engineer","Security Engineer","Cloud Engineer","Data Analyst","Product Manager","Project Manager","Business Analyst","Test Engineer","Quality Engineer","Technical Support Engineer","DevOps Engineer","Risk Analyst","Senior Engineer","Technical Lead","Account Executive","Intern","Operations Manager"};
			return jobsInStripe;
		}else if(companyName.equals("SpaceX")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSpaceX={"Aerospace Engineer","Design Engineer","Propulsion Engineer","Avionics Engineer","Mechanical Engineer","Electrical Engineer","Software Engineer","Test Engineer","Quality Engineer","Manufacturing Engineer","Production Engineer","Research Engineer","Technician","Operator","Safety Engineer","Senior Engineer","Project Manager","Technical Lead","Intern","Mission Specialist"};
			return jobsInSpaceX;
		}else if(companyName.equals("Tesla")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTesla={"Automotive Engineer","Software Engineer","Battery Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Mechanical Engineer","Electrical Engineer","Manufacturing Engineer","Process Engineer","Service Engineer","Technician","Operator","Safety Engineer","Senior Engineer","Project Manager","Technical Lead","Intern","Product Manager"};
			return jobsInTesla;
		}else if(companyName.equals("General Electric")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInGE={"Mechanical Engineer","Electrical Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Project Engineer","Service Engineer","Process Engineer","Manufacturing Engineer","Maintenance Engineer","Senior Engineer","Technician","Operator","Safety Engineer","Assistant Manager","Manager","Project Manager","Trainee Engineer","Intern"};
			return jobsInGE;
		}else if(companyName.equals("Honeywell")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHoneywell={"Automation Engineer","Control Engineer","Software Engineer","Mechanical Engineer","Electrical Engineer","Design Engineer","Project Engineer","Quality Engineer","Test Engineer","Manufacturing Engineer","Process Engineer","Service Engineer","Safety Engineer","Senior Engineer","Technician","Operator","Project Manager","Technical Lead","Intern","Product Manager"};
			return jobsInHoneywell;
		}else if(companyName.equals("3M")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsIn3M={"Production Engineer","Process Engineer","Mechanical Engineer","Chemical Engineer","Quality Engineer","Design Engineer","Project Engineer","Manufacturing Engineer","Safety Engineer","Research Scientist","Technician","Operator","Maintenance Engineer","Senior Engineer","Assistant Manager","Manager","Project Manager","Technical Lead","Intern","Product Specialist"};
			return jobsIn3M;
		}else if(companyName.equals("PepsiCo")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPepsiCo={"Production Supervisor","Process Engineer","Quality Analyst","Food Technologist","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Logistics Executive","Maintenance Engineer","Technician","Operator","Safety Officer","Senior Executive","Assistant Manager","Manager","Project Manager","Intern","Customer Support Executive"};
			return jobsInPepsiCo;
		}else if(companyName.equals("CocaCola")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCocaCola={"Production Supervisor","Process Engineer","Quality Analyst","Food Technologist","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Logistics Executive","Maintenance Engineer","Technician","Operator","Safety Officer","Senior Executive","Assistant Manager","Manager","Project Manager","Intern","Customer Support Executive"};
			return jobsInCocaCola;
		}else if(companyName.equals("Nestle")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInNestle={"Food Technologist","Production Engineer","Process Engineer","Quality Analyst","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Logistics Executive","Maintenance Engineer","Technician","Operator","Safety Officer","Senior Executive","Assistant Manager","Manager","Project Manager","Intern","Research Scientist"};
			return jobsInNestle;
		}else if(companyName.equals("Deloitte")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDeloitte={"Associate Analyst","Business Analyst","Consultant","Senior Consultant","Audit Associate","Tax Consultant","Risk Analyst","Software Engineer","Data Analyst","Cloud Engineer","Security Engineer","Project Manager","Product Manager","Technical Consultant","Support Engineer","Senior Associate","Manager","Technical Lead","Intern","Delivery Manager"};
			return jobsInDeloitte;
		}else if(companyName.equals("KPMG")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInKPMG={"Audit Associate","Tax Consultant","Business Analyst","Consultant","Senior Consultant","Risk Analyst","Data Analyst","Software Engineer","Cloud Engineer","Security Engineer","Project Manager","Product Manager","Technical Consultant","Support Engineer","Senior Associate","Manager","Technical Lead","Intern","Process Associate","Delivery Manager"};
			return jobsInKPMG;
		}else if(companyName.equals("EY")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInEY={"Audit Associate","Tax Consultant","Business Analyst","Consultant","Senior Consultant","Risk Analyst","Data Analyst","Software Engineer","Cloud Engineer","Security Engineer","Project Manager","Product Manager","Technical Consultant","Support Engineer","Senior Associate","Manager","Technical Lead","Intern","Process Associate","Delivery Manager"};
			return jobsInEY;
		}else if(companyName.equals("PwC")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPwC={"Audit Associate","Tax Consultant","Business Analyst","Consultant","Senior Consultant","Risk Analyst","Data Analyst","Software Engineer","Cloud Engineer","Security Engineer","Project Manager","Product Manager","Technical Consultant","Support Engineer","Senior Associate","Manager","Technical Lead","Intern","Process Associate","Delivery Manager"};
			return jobsInPwC;
		}else if(companyName.equals("HSBC")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHSBC={"Banking Associate","Relationship Manager","Financial Analyst","Risk Analyst","Operations Executive","Loan Officer","Credit Analyst","Account Manager","Customer Service Executive","Software Engineer","Data Analyst","Business Analyst","Security Analyst","Project Manager","Product Manager","Senior Executive","Assistant Manager","Manager","Intern","Compliance Officer"};
			return jobsInHSBC;
		}else if(companyName.equals("ICICI Bank")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInICICI={"Banking Associate","Relationship Manager","Financial Analyst","Risk Analyst","Operations Executive","Loan Officer","Credit Analyst","Account Manager","Customer Service Executive","Software Engineer","Data Analyst","Business Analyst","Security Analyst","Project Manager","Product Manager","Senior Executive","Assistant Manager","Manager","Intern","Compliance Officer"};
			return jobsInICICI;
		}else if(companyName.equals("HDFC Bank")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInHDFC={"Banking Associate","Relationship Manager","Financial Analyst","Risk Analyst","Operations Executive","Loan Officer","Credit Analyst","Account Manager","Customer Service Executive","Software Engineer","Data Analyst","Business Analyst","Security Analyst","Project Manager","Product Manager","Senior Executive","Assistant Manager","Manager","Intern","Compliance Officer"};
			return jobsInHDFC;
		}else if(companyName.equals("eBay")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsIneBay={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Analyst","Business Analyst","Cloud Engineer","Security Engineer","Technical Support Engineer","DevOps Engineer","Operations Executive","Senior Engineer","Technical Lead","Account Manager","Intern","Service Manager"};
			return jobsIneBay;
		}else if(companyName.equals("Dropbox")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDropbox={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Engineer","Cloud Engineer","Security Engineer","DevOps Engineer","Technical Support Engineer","Infrastructure Engineer","System Engineer","Senior Engineer","Technical Lead","Account Manager","Intern","Service Manager"};
			return jobsInDropbox;
		}else if(companyName.equals("Slack")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSlack={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Analyst","Cloud Engineer","Security Engineer","DevOps Engineer","Technical Support Engineer","System Engineer","UI Developer","Senior Engineer","Technical Lead","Account Executive","Intern","Service Engineer"};
			return jobsInSlack;
		}else if(companyName.equals("Atlassian")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAtlassian={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Engineer","Cloud Engineer","Security Engineer","DevOps Engineer","Technical Support Engineer","System Engineer","UI Developer","Senior Engineer","Technical Lead","Account Manager","Intern","Service Engineer"};
			return jobsInAtlassian;
		}else if(companyName.equals("Shopify")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInShopify={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Analyst","Cloud Engineer","Security Engineer","DevOps Engineer","Technical Support Engineer","System Engineer","UI Developer","Senior Engineer","Technical Lead","Merchant Success Manager","Intern","Service Engineer"};
			return jobsInShopify;
		}else if(companyName.equals("Square")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSquare={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Security Engineer","Cloud Engineer","Data Analyst","Product Manager","Project Manager","Business Analyst","Test Engineer","Quality Engineer","Technical Support Engineer","Risk Analyst","DevOps Engineer","Senior Engineer","Technical Lead","Account Manager","Intern","Operations Executive"};
			return jobsInSquare;
		}else if(companyName.equals("Razorpay")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInRazorpay={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Security Engineer","Cloud Engineer","Data Analyst","Product Manager","Project Manager","Business Analyst","Test Engineer","Quality Engineer","Technical Support Engineer","Risk Analyst","DevOps Engineer","Senior Engineer","Technical Lead","Account Manager","Intern","Operations Executive"};
			return jobsInRazorpay;
		}else if(companyName.equals("Freshworks")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInFreshworks={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Analyst","Cloud Engineer","Security Engineer","DevOps Engineer","Technical Support Engineer","System Engineer","UI Developer","Senior Engineer","Technical Lead","Customer Success Manager","Intern","Service Engineer"};
			return jobsInFreshworks;
		}else if(companyName.equals("MakeMyTrip")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMakeMyTrip={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Operations Executive","Travel Consultant","Customer Support Executive","Data Analyst","Cloud Engineer","Security Engineer","Technical Support Engineer","Senior Engineer","Technical Lead","Account Manager","Intern","Service Manager"};
			return jobsInMakeMyTrip;
		}else if(companyName.equals("Cleartrip")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInCleartrip={"Software Engineer","Backend Developer","Frontend Developer","Mobile Developer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Operations Executive","Travel Consultant","Customer Support Executive","Data Analyst","Cloud Engineer","Security Engineer","Technical Support Engineer","Senior Engineer","Technical Lead","Account Manager","Intern","Service Manager"};
			return jobsInCleartrip;
		}else if(companyName.equals("Indigo")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInIndigo={"Pilot","Cabin Crew","Aircraft Engineer","Maintenance Engineer","Ground Staff","Operations Executive","Customer Service Executive","Safety Officer","Flight Dispatcher","Technician","Quality Engineer","Security Officer","Senior Executive","Assistant Manager","Manager","Project Manager","Trainee Engineer","Intern","Logistics Executive","Service Engineer"};
			return jobsInIndigo;
		}else if(companyName.equals("Air India")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAirIndia={"Pilot","Cabin Crew","Aircraft Engineer","Maintenance Engineer","Ground Staff","Operations Executive","Customer Service Executive","Safety Officer","Flight Dispatcher","Technician","Quality Engineer","Security Officer","Senior Executive","Assistant Manager","Manager","Project Manager","Trainee Engineer","Intern","Logistics Executive","Service Engineer"};
			return jobsInAirIndia;
		}else if(companyName.equals("SpiceJet")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSpiceJet={"Pilot","Cabin Crew","Aircraft Engineer","Maintenance Engineer","Ground Staff","Operations Executive","Customer Service Executive","Safety Officer","Flight Dispatcher","Technician","Quality Engineer","Security Officer","Senior Executive","Assistant Manager","Manager","Project Manager","Trainee Engineer","Intern","Logistics Executive","Service Engineer"};
			return jobsInSpiceJet;
		}else if(companyName.equals("Axis Bank")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAxis={"Banking Associate","Relationship Manager","Financial Analyst","Risk Analyst","Operations Executive","Loan Officer","Credit Analyst","Account Manager","Customer Service Executive","Software Engineer","Data Analyst","Business Analyst","Security Analyst","Project Manager","Product Manager","Senior Executive","Assistant Manager","Manager","Intern","Compliance Officer"};
			return jobsInAxis;
		}else if(companyName.equals("Kotak Bank")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInKotak={"Banking Associate","Relationship Manager","Financial Analyst","Risk Analyst","Operations Executive","Loan Officer","Credit Analyst","Account Manager","Customer Service Executive","Software Engineer","Data Analyst","Business Analyst","Security Analyst","Project Manager","Product Manager","Senior Executive","Assistant Manager","Manager","Intern","Compliance Officer"};
			return jobsInKotak;
		}else if(companyName.equals("Yes Bank")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInYesBank={"Banking Associate","Relationship Manager","Financial Analyst","Risk Analyst","Operations Executive","Loan Officer","Credit Analyst","Account Manager","Customer Service Executive","Software Engineer","Data Analyst","Business Analyst","Security Analyst","Project Manager","Product Manager","Senior Executive","Assistant Manager","Manager","Intern","Compliance Officer"};
			return jobsInYesBank;
		}else if(companyName.equals("Standard Chartered")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSC={"Banking Associate","Relationship Manager","Financial Analyst","Risk Analyst","Operations Executive","Loan Officer","Credit Analyst","Account Manager","Customer Service Executive","Software Engineer","Data Analyst","Business Analyst","Security Analyst","Project Manager","Product Manager","Senior Executive","Assistant Manager","Manager","Intern","Compliance Officer"};
			return jobsInSC;
		}else if(companyName.equals("Goldman Sachs")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInGoldman={"Investment Banker","Financial Analyst","Risk Analyst","Operations Executive","Business Analyst","Software Engineer","Data Analyst","Security Analyst","Project Manager","Product Manager","Quant Analyst","Account Manager","Client Associate","Compliance Officer","Senior Analyst","Assistant Manager","Manager","Technical Lead","Intern","Consultant"};
			return jobsInGoldman;
		}else if(companyName.equals("Morgan Stanley")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMorgan={"Investment Banker","Financial Analyst","Risk Analyst","Operations Executive","Business Analyst","Software Engineer","Data Analyst","Security Analyst","Project Manager","Product Manager","Quant Analyst","Account Manager","Client Associate","Compliance Officer","Senior Analyst","Assistant Manager","Manager","Technical Lead","Intern","Consultant"};
			return jobsInMorgan;
		}else if(companyName.equals("JP Morgan")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInJPM={"Investment Banker","Financial Analyst","Risk Analyst","Operations Executive","Business Analyst","Software Engineer","Data Analyst","Security Analyst","Project Manager","Product Manager","Quant Analyst","Account Manager","Client Associate","Compliance Officer","Senior Analyst","Assistant Manager","Manager","Technical Lead","Intern","Consultant"};
			return jobsInJPM;
		}else if(companyName.equals("Adobe")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAdobe={"Software Engineer","Frontend Developer","Backend Developer","UI Developer","UX Designer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Cloud Engineer","Security Engineer","Data Analyst","Technical Support Engineer","DevOps Engineer","Business Analyst","Senior Engineer","Technical Lead","Account Manager","Intern","Solutions Architect"};
			return jobsInAdobe;
		}else if(companyName.equals("Autodesk")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAutodesk={"Software Engineer","CAD Engineer","Design Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Cloud Engineer","Security Engineer","Data Analyst","Technical Support Engineer","DevOps Engineer","Business Analyst","System Engineer","UI Developer","Senior Engineer","Technical Lead","Account Manager","Intern","Solutions Architect"};
			return jobsInAutodesk;
		}else if(companyName.equals("MathWorks")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMathWorks={"Software Engineer","Application Engineer","Test Engineer","Quality Engineer","Product Manager","Project Manager","Data Scientist","Research Engineer","Technical Support Engineer","System Engineer","Control Engineer","Signal Processing Engineer","Senior Engineer","Technical Lead","Account Manager","Consultant","Developer","Intern","Solutions Architect","Service Engineer"};
			return jobsInMathWorks;
		}else if(companyName.equals("Siemens Healthineers")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSiemensH={"Biomedical Engineer","Software Engineer","Hardware Engineer","Design Engineer","Quality Engineer","Test Engineer","Product Engineer","Research Scientist","Clinical Specialist","Application Engineer","Technical Consultant","Project Manager","Service Engineer","Support Engineer","Data Analyst","Manufacturing Engineer","Senior Engineer","Technician","Intern","Manager"};
			return jobsInSiemensH;
		}else if(companyName.equals("Johnson & Johnson")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInJNJ={"Biomedical Engineer","Research Scientist","Quality Analyst","Production Engineer","Process Engineer","Clinical Specialist","Regulatory Affairs Executive","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Maintenance Engineer","Technician","Safety Officer","Senior Executive","Assistant Manager","Manager","Intern","Product Specialist"};
			return jobsInJNJ;
		}else if(companyName.equals("Pfizer")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPfizer={"Research Scientist","Clinical Research Associate","Quality Analyst","Production Engineer","Process Engineer","Pharmacist","Regulatory Affairs Executive","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Maintenance Engineer","Technician","Safety Officer","Senior Executive","Assistant Manager","Manager","Intern","Product Specialist"};
			return jobsInPfizer;
		}else if(companyName.equals("Biocon")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBiocon={"Research Scientist","Biotech Engineer","Quality Analyst","Production Engineer","Process Engineer","Clinical Research Associate","Regulatory Affairs Executive","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Maintenance Engineer","Technician","Safety Officer","Senior Executive","Assistant Manager","Manager","Intern","Product Specialist"};
			return jobsInBiocon;
		}else if(companyName.equals("Dr Reddy's")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDrReddys={"Research Scientist","Pharmacist","Quality Analyst","Production Engineer","Process Engineer","Clinical Research Associate","Regulatory Affairs Executive","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Maintenance Engineer","Technician","Safety Officer","Senior Executive","Assistant Manager","Manager","Intern","Product Specialist"};
			return jobsInDrReddys;
		}else if(companyName.equals("Sun Pharma")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInSunPharma={"Research Scientist","Pharmacist","Quality Analyst","Production Engineer","Process Engineer","Clinical Research Associate","Regulatory Affairs Executive","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Maintenance Engineer","Technician","Safety Officer","Senior Executive","Assistant Manager","Manager","Intern","Product Specialist"};
			return jobsInSunPharma;
		}else if(companyName.equals("Lupin")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInLupin={"Research Scientist","Pharmacist","Quality Analyst","Production Engineer","Process Engineer","Clinical Research Associate","Regulatory Affairs Executive","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Account Manager","Maintenance Engineer","Technician","Safety Officer","Senior Executive","Assistant Manager","Manager","Intern","Product Specialist"};
			return jobsInLupin;
		}else if(companyName.equals("Decathlon")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDecathlon={"Store Associate","Sports Advisor","Operations Executive","Inventory Specialist","Supply Chain Executive","Sales Executive","Customer Support Executive","Store Manager","Assistant Manager","Warehouse Associate","Logistics Executive","Business Analyst","Data Analyst","Marketing Executive","Account Manager","Supervisor","Senior Executive","Manager","Intern","Service Executive"};
			return jobsInDecathlon;
		}else if(companyName.equals("Nike")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInNike={"Product Designer","Quality Analyst","Production Engineer","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Retail Associate","Store Manager","Inventory Specialist","Logistics Executive","Business Analyst","Data Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Intern","Service Executive"};
			return jobsInNike;
		}else if(companyName.equals("Adidas")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAdidas={"Product Designer","Quality Analyst","Production Engineer","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Retail Associate","Store Manager","Inventory Specialist","Logistics Executive","Business Analyst","Data Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Intern","Service Executive"};
			return jobsInAdidas;
		}else if(companyName.equals("Puma")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPuma={"Product Designer","Quality Analyst","Production Engineer","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Retail Associate","Store Manager","Inventory Specialist","Logistics Executive","Business Analyst","Data Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Intern","Service Executive"};
			return jobsInPuma;
		}else if(companyName.equals("Reebok")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInReebok={"Product Designer","Quality Analyst","Production Engineer","Supply Chain Executive","Operations Manager","Sales Executive","Marketing Executive","Retail Associate","Store Manager","Inventory Specialist","Logistics Executive","Business Analyst","Data Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Intern","Service Executive"};
			return jobsInReebok;
		}else if(companyName.equals("Bata")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBata={"Retail Associate","Store Manager","Sales Executive","Customer Support Executive","Inventory Specialist","Supply Chain Executive","Operations Executive","Quality Analyst","Production Supervisor","Logistics Executive","Business Analyst","Account Manager","Marketing Executive","Supervisor","Senior Executive","Assistant Manager","Manager","Technician","Intern","Service Executive"};
			return jobsInBata;
		}else if(companyName.equals("Titan")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInTitan={"Product Designer","Sales Executive","Store Associate","Retail Manager","Customer Support Executive","Operations Executive","Inventory Specialist","Supply Chain Executive","Quality Analyst","Production Engineer","Business Analyst","Marketing Executive","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Technician","Intern","Service Executive"};
			return jobsInTitan;
		}else if(companyName.equals("Fastrack")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInFastrack={"Sales Executive","Store Associate","Retail Manager","Customer Support Executive","Operations Executive","Inventory Specialist","Supply Chain Executive","Marketing Executive","Business Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Quality Analyst","Production Executive","Technician","Intern","Service Executive","Brand Executive"};
			return jobsInFastrack;
		}else if(companyName.equals("Raymond")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInRaymond={"Production Engineer","Quality Analyst","Textile Engineer","Operations Executive","Sales Executive","Marketing Executive","Retail Associate","Store Manager","Inventory Specialist","Supply Chain Executive","Business Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Technician","Intern","Service Executive","Designer"};
			return jobsInRaymond;
		}else if(companyName.equals("Arvind")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInArvind={"Textile Engineer","Production Engineer","Quality Analyst","Operations Executive","Sales Executive","Marketing Executive","Retail Associate","Store Manager","Inventory Specialist","Supply Chain Executive","Business Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Technician","Intern","Service Executive","Designer"};
			return jobsInArvind;
		}else if(companyName.equals("Asian Paints")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInAsianPaints={"Chemical Engineer","Production Engineer","Quality Analyst","Process Engineer","Operations Executive","Sales Executive","Marketing Executive","Supply Chain Executive","Inventory Specialist","Maintenance Engineer","Business Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Technician","Intern","Service Engineer","Project Engineer"};
			return jobsInAsianPaints;
		}else if(companyName.equals("Berger Paints")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBerger={"Chemical Engineer","Production Engineer","Quality Analyst","Process Engineer","Operations Executive","Sales Executive","Marketing Executive","Supply Chain Executive","Inventory Specialist","Maintenance Engineer","Business Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Technician","Intern","Service Engineer","Project Engineer"};
			return jobsInBerger;
		}else if(companyName.equals("Nerolac")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInNerolac={"Chemical Engineer","Production Engineer","Quality Analyst","Process Engineer","Operations Executive","Sales Executive","Marketing Executive","Supply Chain Executive","Inventory Specialist","Maintenance Engineer","Business Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Technician","Intern","Service Engineer","Project Engineer"};
			return jobsInNerolac;
		}else if(companyName.equals("Pidilite")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInPidilite={"Chemical Engineer","Production Engineer","Quality Analyst","Process Engineer","Operations Executive","Sales Executive","Marketing Executive","Supply Chain Executive","Inventory Specialist","Maintenance Engineer","Business Analyst","Account Manager","Supervisor","Senior Executive","Assistant Manager","Manager","Technician","Intern","Service Engineer","Project Engineer"};
			return jobsInPidilite;
		}else if(companyName.equals("Bosch")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInBosch={"Software Engineer","Mechanical Engineer","Electrical Engineer","Automation Engineer","Design Engineer","Test Engineer","Quality Engineer","Production Engineer","Maintenance Engineer","Service Engineer","Technical Lead","Project Manager","Business Analyst","Data Analyst","Supervisor","Senior Engineer","Assistant Manager","Manager","Intern","Research Engineer"};
			return jobsInBosch;
		}else if(companyName.equals("Continental")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInContinental={"Automotive Engineer","Software Engineer","Embedded Engineer","Test Engineer","Quality Engineer","Design Engineer","Production Engineer","Maintenance Engineer","Service Engineer","Technical Lead","Project Manager","Business Analyst","Data Analyst","Supervisor","Senior Engineer","Assistant Manager","Manager","Intern","Research Engineer","System Engineer"};
			return jobsInContinental;
		}else if(companyName.equals("Valeo")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInValeo={"Automotive Engineer","Software Engineer","Embedded Engineer","Test Engineer","Quality Engineer","Design Engineer","Production Engineer","Maintenance Engineer","Service Engineer","Technical Lead","Project Manager","Business Analyst","Data Analyst","Supervisor","Senior Engineer","Assistant Manager","Manager","Intern","Research Engineer","System Engineer"};
			return jobsInValeo;
		}else if(companyName.equals("Magna")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInMagna={"Automotive Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Mechanical Engineer","Electrical Engineer","Manufacturing Engineer","Process Engineer","Service Engineer","Maintenance Engineer","Senior Engineer","Technician","Operator","Assistant Manager","Manager","Project Manager","Trainee Engineer","Intern","Safety Engineer"};
			return jobsInMagna;
		}else if(companyName.equals("Denso")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInDenso={"Automotive Engineer","Embedded Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Mechanical Engineer","Electrical Engineer","Manufacturing Engineer","Process Engineer","Service Engineer","Maintenance Engineer","Senior Engineer","Technician","Operator","Assistant Manager","Manager","Project Manager","Intern","Safety Engineer"};
			return jobsInDenso;
		}else if(companyName.equals("ZF")){
			System.out.println("The Company name is: "+companyName);
			String[] jobsInZF={"Automotive Engineer","Embedded Engineer","Design Engineer","Production Engineer","Quality Engineer","Test Engineer","Mechanical Engineer","Electrical Engineer","Manufacturing Engineer","Process Engineer","Service Engineer","Maintenance Engineer","Senior Engineer","Technician","Operator","Assistant Manager","Manager","Project Manager","Intern","Safety Engineer"};
			return jobsInZF;
		}
		return null;
		
	}
		public static void getJobs(String[] jobs){
		System.out.println("The Jobs Are: ");
		for(String job:jobs){
			System.out.println(job);
		}
	}
	
}