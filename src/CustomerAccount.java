
public class CustomerAccount {
	public String pps2;
	public int accountNum;
	public double balanceCus;

	public CustomerAccount() {
		this.accountNum = 0;
		this.balanceCus=0;
		this.pps2="";
	}
	public CustomerAccount(int an, double b, String p) {
		this.accountNum = an;
		this.balanceCus=b;
		this.pps2=p;
	}
	public void setAccountNum(int an){
		this.accountNum= an;
	}
	public void setBalance(double b){
		this.balanceCus= b;
	}
	public int getAccountNum(){
		return accountNum;
	}
	public double getBalance(){
		return balanceCus;
	}
	public void setPps(String p){
		this.pps2=p;
	}
	public String getPps(){
		return pps2;
	}
}
