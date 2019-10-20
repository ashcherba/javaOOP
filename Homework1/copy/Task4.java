package Homework1.copy;

import java.util.Arrays;

public class Task4 {

public static void main(String[] args) {
		
		Network lifeCell = new Network();
		lifeCell.setName("Lifecell");
		Phone myPhone = new Phone("555-55-55");
		myPhone.registerPhone(lifeCell);
		myPhone.call(myPhone.getNumber());
		
		Network kyivstar = new Network();
		kyivstar.setName("Kyivstar");
		Phone firstPhone = new Phone("333-33-33");
		firstPhone.registerPhone(lifeCell);
		firstPhone.call(firstPhone.getNumber());

	}

}

class Phone {
	private String number;
	private Network network;
	
	
	Phone(String number) {
		this.number = number;
	}

	public void registerPhone(Network network) {
		this.network = network;
		network.registerNumber(number); 
	}

	public String call(String number) {
		return network.searchAndCall(number);	
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

}

class Network {
	private String name;
	private String[] phoneList = new String[100];

	public Network() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(String[] phoneList) {
		this.phoneList = phoneList;
	}
	
	public String searchAndCall(String number){

		for(int i = 0; i < phoneList.length; i++){
			if(phoneList[i] == number){
				System.out.println("Call to  " + number);
				break;
			}else {
				System.out.println("Invalid number.");
				break;
			}
		}
		return number;
	}
	
	public void registerNumber(String number){
		for(int i = 0; i < phoneList.length; i++){
			if(phoneList[i] == null){
				phoneList[i] = number;
				break;
			}
			else {
				String[] copiedPhoneList = Arrays.copyOf(phoneList, phoneList.length+1);
				setPhoneList(copiedPhoneList);
				for(int i1 = 0; i1 < copiedPhoneList.length; i1++){
						copiedPhoneList[i1] = number;
						break;
			}
		}
	
	}
}
}
