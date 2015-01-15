package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Author extends User {
	
	@Override
	public void setUsername(String x) throws IOException {
		if (x.length() > 8){
			throw new IOException("Name too long!");
		}
		this.username = x;
	}
}
