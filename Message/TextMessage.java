package Message;

public class TextMessage extends Message implements Likeable {
	
	private String text;
	
	public TextMessage(String author,String text) {
		super(author);
		this.text=text;
	}

	@Override
	public void showMessage() {
		System.out.println(text);
		System.out.println(super.getTime());
	}

	@Override
	public void likeMessage(String name) {
		System.out.println(name+" liked this Message.");
		System.out.println(super.getTime());
	}

	

}
