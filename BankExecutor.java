class BankRunner {
    public static void main(String[] args) {

        Bank b1 = new Bank();

        b1.setAccountHolderName("Vinod");
        System.out.println("Account Holder: " + b1.getAccountHolderName());

        b1.setBankName("Canara");
        System.out.println("Bank Name: " + b1.getBankName());

        b1.setBranchName("BTM Layout");
        System.out.println("Branch: " + b1.getBranchName());

        b1.setAccountNumber(974163542173L);
        System.out.println("Account Number: " + b1.getAccountNumber());

        b1.setIfscCode("CNRB1717");
        System.out.println("IFSC: " + b1.getIfscCode());

        b1.setBalance(25000.50);
        System.out.println("Balance: " + b1.getBalance());

        b1.setAccountType("Savings");
        System.out.println("Type: " + b1.getAccountType());


        Bank b2 = new Bank();

        b2.setAccountHolderName("Snehit");
        System.out.println("Account Holder: " + b2.getAccountHolderName());
		
        b2.setBankName("HDFC Bank");
        System.out.println("Bank: " + b2.getBankName());

        b2.setAccountNumber(98765342322L);
        System.out.println("Account No: " + b2.getAccountNumber());

        b2.setBranchName("Indiranagar");
        System.out.println("Branch: " + b2.getBranchName());

        b2.setBalance(78000.00);
        System.out.println("Balance: " + b2.getBalance());

        b2.setIfscCode("HDFC033251");
        System.out.println("IFSC Code: " + b2.getIfscCode());

        b2.setAccountType("Current");
        System.out.println("Account Type: " + b2.getAccountType());


        Bank b3 = new Bank();

        b3.setAccountHolderName("Sharan");
        System.out.println("Account holder Name: " + b3.getAccountHolderName());

        b3.setBankName("ICICI Bank");
        System.out.println("Bank: " + b3.getBankName());

        b3.setBranchName("Whitefield");
        System.out.println("Branch: " + b3.getBranchName());

        b3.setAccountType("Savings");
        System.out.println("Type: " + b3.getAccountType());

        b3.setBalance(15000.75);
        System.out.println("Available Balance: " + b3.getBalance());

        b3.setAccountNumber(45678034233L);
        System.out.println("Account Number: " + b3.getAccountNumber());

        b3.setIfscCode("ICIC344353");
        System.out.println("IFSC: " + b3.getIfscCode());


        Bank b4 = new Bank();

        b4.setAccountHolderName("Rakshit");
        System.out.println("Account Holder: " + b4.getAccountHolderName());

        b4.setBankName("Axis Bank");
        System.out.println("Bank Name: " + b4.getBankName());

        b4.setAccountType("Current");
        System.out.println("Type: " + b4.getAccountType());

        b4.setBranchName("Marathahalli");
        System.out.println("Branch: " + b4.getBranchName());

        b4.setAccountNumber(7412534244L);
        System.out.println("A/C No: " + b4.getAccountNumber());

        b4.setBalance(92000.00);
        System.out.println("Balance: " + b4.getBalance());

        b4.setIfscCode("UTIB534554");
        System.out.println("IFSC: " + b4.getIfscCode());


        Bank b5 = new Bank();

        b5.setAccountHolderName("Siddu");
        System.out.println("Account Holder: " + b5.getAccountHolderName());

        b5.setBankName("Canara Bank");
        System.out.println("Bank: " + b5.getBankName());

        b5.setBranchName("Rajajinagar");
        System.out.println("Branch: " + b5.getBranchName());

        b5.setAccountNumber(8523604535L);
        System.out.println("Account Number: " + b5.getAccountNumber());

        b5.setAccountType("Savings");
        System.out.println("Type: " + b5.getAccountType());

        b5.setBalance(34000.25);
        System.out.println("Balance: " + b5.getBalance());

        b5.setIfscCode("CNRB0545435");
        System.out.println("IFSC Code: " + b5.getIfscCode());

    }
}