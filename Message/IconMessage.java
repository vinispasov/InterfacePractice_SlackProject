package Message;

enum Icon{
	HAPPY,SAD,ANGRY,INLOVE
}
public class IconMessage extends Message {
	
	private Icon icon;
	public IconMessage(String author,Icon icon) {
		super(author);
		this.icon=icon;
	}
	@Override
	public void showMessage() {
		System.out.println(icon.toString());
		System.out.println(super.getTime());
	}

}
