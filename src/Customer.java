import java.util.ArrayList;

public class Customer {
	public String pps;
	public String surname;
	public String firstname;
	public String dob;
	public int random;
	public String randomString;
public Customer() {
	this.pps="";
	this.surname="";
	this.firstname="";
	this.dob="";
	this.random=0;
	this.randomString="";
}
public Customer(String p, String sn, String fn, String d, int r, String rs) {
	this.pps=p;
	this.surname=sn;
	this.firstname=fn;
	this.dob=d;
	this.random=r;
	this.randomString=rs;
}
public void setPps(String p){
	this.pps= p;
}
public void setSurname(String sn){
	this.surname= sn;
}
public void setFirstname(String fn){
	this.firstname= fn;
}
public void setDob(String d){
	this.dob= d;
}
public void setRandom(int r){
	this.random= r;
}
public void setRandomString(String rs){
	this.randomString= rs;
}
public String getPps(){
	return pps;
}
public String getSurname(){
	return surname;
}
public String getFirstname(){
	return firstname;
}
public String getDob(){
	return dob;
}
public int getRandom(){
	return random;
}
public String getRandomString(){
	return randomString;
}
}