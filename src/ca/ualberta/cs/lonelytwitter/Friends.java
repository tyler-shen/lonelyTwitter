package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class Friends extends User {
	
	private ArrayList<User> friendlist = new ArrayList<User>();
	
	public void addFriend(User name) {
		friendlist.add(name);
	}
	
	public void deleteFriend(User name){
		friendlist.remove(name);
	}
	
	public void showFriend(){
		if (friendlist.isEmpty()){
			System.out.println("You friend list is empty.");
		}
		else{
			for (User value:friendlist){
				System.out.println(value);
			}
		}
	}
}