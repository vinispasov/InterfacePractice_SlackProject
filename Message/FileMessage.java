package Message;

public class FileMessage extends Message implements Downloadable{
	
	private String fileName;
	
	public FileMessage(String author,String fileName) {
		super(author);
		this.fileName=fileName;
	}

	@Override
	public void showMessage() {
		System.out.println("File name: "+fileName);
		System.out.println(super.getTime());
	}

	@Override
	public void downloadMessage(String name) {
		System.out.println(name+" downloaded this Image.");
		System.out.println(super.getTime());
	}

}
