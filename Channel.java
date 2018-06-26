import java.util.ArrayList;
import Message.Message;
public class Channel {
	
	private String name;
	private ArrayList<Message>messages;
	
	//constructor
	public Channel(String name) {
		setName(name);
		messages=new ArrayList<Message>();
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	ArrayList<Message> getMessages() {
		return messages;
	}

	
	

}
