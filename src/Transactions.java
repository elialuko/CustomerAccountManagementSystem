
public class Transactions {
public String pps;
public double balance2;
public Transactions() {
	this.pps="";
	this.balance2=0;
}
public Transactions(String p, double b2) {
	this.pps=p;
	this.balance2=b2;
}
public void setPps(String p){
	this.pps= p;
}
public void setBalance2(double b2){
	this.balance2= b2;
}
public String getPps(){
	return pps;
}
public double getBalance2(){
	return balance2;
}

public String ToString() {
	return "The account of PPS Number: " + pps + "'s balance is: " + balance2 + "\n";
}
}
