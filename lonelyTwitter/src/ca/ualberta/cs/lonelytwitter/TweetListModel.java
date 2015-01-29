package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweetList;
	
	public void addTweet(LonelyTweetModel tweet) {
		tweetList.add(tweet);
	}

	public ArrayList<LonelyTweetModel> getTweets(){
		return tweetList;
	}
	
	public boolean hasTweet(LonelyTweetModel tweet){
		return true; 
	}
	
	public void removeTweet(LonelyTweetModel tweet){
		
	}
}
