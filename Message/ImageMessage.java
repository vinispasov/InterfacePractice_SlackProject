package Message;

public class ImageMessage extends Message implements Likeable,Downloadable{

	private String imageName;
	
	public ImageMessage(String author,String imageName) {
		super(author);
		this.imageName=imageName;
	}

	@Override
	public void showMessage() {
		System.out.println("Image name: "+imageName);
		System.out.println(super.getTime());
	}

	@Override
	public void likeMessage(String name) {
		System.out.println(name+" liked this Message.");
		System.out.println(super.getTime());
	}

	@Override
	public void downloadMessage(String name) {
		System.out.println(name+" downloaded this Image.");
		System.out.println(super.getTime());
	}
	

}
