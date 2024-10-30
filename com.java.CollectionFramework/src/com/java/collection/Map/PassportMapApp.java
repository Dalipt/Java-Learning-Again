package com.java.collection.Map;
import java.util.*;
import java.util.Map.Entry;
class Passport
{
	private String name;
	private String city;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}
}

public class PassportMapApp {

	public static void main(String[] args)
	{
		Passport pp=new Passport("Ram","Ludhiana","India");
		Passport pp1=new Passport("Raju","Mohali","India");
		Passport pp2=new Passport("Rajiv","Chandigarh","UT");
			
			Integer id=Integer.valueOf(101);
			Integer id1=Integer.valueOf(201);
			Integer id2=Integer.valueOf(301);
			HashMap<Integer, Passport>hm= new HashMap<>();
			hm.put(id,pp);
			hm.put(id1,pp1);
			hm.put(id2,pp2);
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter you passport Numb:");
			Integer userName=sc.nextInt();
			
			Set entry=hm.entrySet();
			Iterator itr= entry.iterator();
			//Boolean flag=false;
			while(itr.hasNext())
			{
				Map.Entry pair=(Entry) itr.next();
				Integer key=(Integer) pair.getKey();
				if(key.equals(userName))
				{
					System.out.println("Please find your passport infor");
					System.out.println(pair.getValue());
					//flag= true;
				}
				else if(key!=userName)
				{
					System.out.println("Information is not availble");
				}/*
				 * if(flag==false) 
				 * { //101
				 * System.out.println("Information is not availble");
				 *  }
				 */
			}
	}

}
