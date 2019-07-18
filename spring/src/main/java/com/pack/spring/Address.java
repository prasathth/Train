package com.pack.spring;

public class Address {
private String state;
private String city ;
private int pcode ;

public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPcode() {
	return pcode;
}
public void setPcode(int pcode) {
	this.pcode = pcode;
}
@Override
public String toString() {
	return "Address [state=" + state + ", city=" + city + ", pcode=" + pcode + "]";
}


}
