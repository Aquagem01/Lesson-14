package com.tc.train.bean;

import java.util.Date;
import java.util.Objects;
import java.util.Collections;

public class Train {
	private int number;
	private String depaturePlace;
	private Date depatureTime;
	
	
	public Train() {
		number = 0;
		depaturePlace = "";
		depatureTime = null;
	}
	
	public Train (int a, String b, Date c) {
		number = a;
		depaturePlace = b;
		depatureTime = c;
	}
	
	public void setNumber (int a) {
		this.number = a;
	}
	
	public int getNumber () {
		return number;
	}
	
	public void setDepaturePlace (String b) {
		this.depaturePlace = b;
	}
	
	public String getDepaturePlace () {
		return depaturePlace;
	}
	
	public void setDepatureTime (Date c) {
		this.depatureTime = c;
	}
	
	public Date getDepatureTime () {
		return depatureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depaturePlace, depatureTime, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(depaturePlace, other.depaturePlace) && Objects.equals(depatureTime, other.depatureTime)
				&& number == other.number;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", depaturePlace=" + depaturePlace + ", depatureTime=" + depatureTime + "]";
	}
	
	public String toStringKrasivoe() {
		return "\nTrainNumber: " + number + " \tDepaturePlace: " + depaturePlace + " \t\tDepatureTime: " + depatureTime;
	}

}
