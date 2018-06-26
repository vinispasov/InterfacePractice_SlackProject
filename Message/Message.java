package Message;
import java.util.Calendar;
import java.util.Date;

public abstract class Message {
	private String author;
	private Calendar time;
	
	//constructor
	public Message(String author) {
		setAuthor(author);
		time=Calendar.getInstance();
	}

	//getters and setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getTime() {
		return this.time.getTime();
	}
	
	public abstract void showMessage();

	
}
