package com.divyansh.covid19;

public class LocationStats {
	
	private String state;
	private String country;
	private int latestTotalCountry;
	private int diffOfCase;
	
	public int getDiffOfCase() {
		return diffOfCase;
	}
	public void setDiffOfCase(int diffOfCase) {
		this.diffOfCase = diffOfCase;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCountry() {
		return latestTotalCountry;
	}
	public void setLatestTotalCountry(int latestTotalCountry) {
		this.latestTotalCountry = latestTotalCountry;
	}
	
	
	@Override
	public String toString() {
		return "LocationStats {" + 
				"state='" + state + '\'' + 
				", country='" + country + '\'' + 
				", latestTotalCountry='" + latestTotalCountry + 
				"}";
	}
	
	
	
	
}
