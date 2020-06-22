package hp.springboot.data.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class data {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long iD;
	
	int day;
	int month;
	int year;
	int hour;
	int minutes;
	int seconds;
	int value;
	String country;
		
	public data()
	{
		
	}
	
	public data(int day, int month, int year, int hour, int minutes, int seconds, int value, String country) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
		this.value = value;
		this.country = country;
	}
	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public long getId()
	{
		return iD;
	}

}
