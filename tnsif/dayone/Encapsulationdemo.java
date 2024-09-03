package com.tnsif.dayone;

public class Encapsulationdemo {
	//team-RCB
	private static String Playername;
	private static int Jersyno;
	private static int Orderno;
	
	//non-parameterized constructor
	public Encapsulationdemo() {
		
		
	}
	
	
	//parameterized constructor
	public Encapsulationdemo(String playername,int jersyno,int orderno) {
		this.Playername=playername;
		this.Jersyno=jersyno;
		this.Orderno=orderno;
	}

	public String getPlayername() {
		return Playername;
	}


	public void setPlayername(String playername) {
		this.Playername = playername;
	}

	public int getJersyno() {
		return Jersyno;
	}


	public void setJersyno(int jersyno) {
		this.Jersyno = jersyno;
	}


	public int getOrderno() {
		return Orderno;
	}


	public void setOrderno(int orderno) {
		this.Orderno = orderno;
	}

	@Override//source->to string->click 
	public String toString() {
		return "Encapsulationdemo playername=" + Playername + ", jersyno=" + Jersyno + ", orderno=" + Orderno  ;
	}


	public static void main(String[] args) {
		
		Encapsulationdemo obj=new Encapsulationdemo(Playername,Jersyno,Orderno);
		obj.setPlayername("virat koli");
		obj.setJersyno(18);
		obj.setOrderno(1);
		System.out.println(obj);
	}

}
