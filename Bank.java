class Bank{

	private String bankName;
	private String branchName;
	private String ifscCode;
	private String accountHolderName;
	private long accountNumber;
	private double balance;
	private String accountType;

	public void setBankName(String bankName){
		this.bankName = bankName;
	}
	public String getBankName(){
		return this.bankName;
	}

	public void setAccountNumber(long accountNumber){
		this.accountNumber = accountNumber;
	}
	public long getAccountNumber(){
		return this.accountNumber;
	}

	public void setBranchName(String branchName){
		this.branchName = branchName;
	}
	public String getBranchName(){
		return this.branchName;
	}

	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderName(){
		return this.accountHolderName;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}

	public void setIfscCode(String ifscCode){
		this.ifscCode = ifscCode;
	}
	public String getIfscCode(){
		return this.ifscCode;
	}

	public void setAccountType(String accountType){
		this.accountType = accountType;
	}
	public String getAccountType(){
		return this.accountType;
	}

}