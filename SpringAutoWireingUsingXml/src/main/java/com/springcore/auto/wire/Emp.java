package com.springcore.auto.wire;

public class Emp 
{
	// Address class is depent on the employee 
	
	// providing the getter and setter 
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
// default constuctor 
public Emp() {
	super();
	
}

public Emp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}



}
