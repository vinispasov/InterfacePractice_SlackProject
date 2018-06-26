import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import Message.*;
public class Slack {
	private ArrayList<Channel> channels;
	private Channel currentChannel;
	

	//constructor
	public Slack() {
	   channels=new ArrayList<Channel>();
	}
	
	public void createNewChannel(String name) {
		boolean correctName=false;
		for(Channel channel:channels) {
			if (channel.getName().equals(name)) {
				System.out.println("The name "+name+ " exist already.Please set another name:");
				System.out.println();
				Scanner sc=new Scanner(System.in);
				while (true) {
					name=sc.nextLine();
					if (!channel.getName().equals(name)) {
						correctName=true;
						break;
					}
				}
			}
			if (correctName) {
				break;
			}
		}
		currentChannel=new Channel(name);
		channels.add(currentChannel);
		System.out.println("New channel was created with name: "+name);
		System.out.println();
	}
	
	public void switchCurrentChannel(String channelName) {
		boolean isSwitched=false;
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < channels.size(); i++) {
			if (channels.get(i).getName().equals(channelName)) {
				currentChannel=channels.get(i);
				System.out.println("The channel is switched!");
				System.out.println();
				isSwitched=true;
				break;
			}
		}
		if (!isSwitched) {
			while(!isSwitched) {
				System.out.println(channelName+" channel is not existing.Try with another.");
				channelName=sc.nextLine();
				for (int i = 0; i < channels.size(); i++) {
					if (channelName.equals(channels.get(i).getName())) {
						System.out.println("Channel switched!");
						isSwitched=true;
						break;
					}
				}
				
				
			}
		}
	}
	
	
	public void postMessage(Message message) {
		currentChannel.getMessages().add(message);
		message.showMessage();
	}

	public void showChannelHistory(String channelName){
		boolean isExist=false;
		for (Channel channel : channels) {
			if (channel.getName().equals(channelName)) {
				isExist=true;
				for (Message message : channel.getMessages()) {
					System.out.print(message.getAuthor()+": ");
					message.showMessage();
					message.getTime();
					System.out.println();
					System.out.println("===============================");
				}
			}
		}
		if (!isExist) {
		Scanner sc=new Scanner(System.in);
			while(!isExist) {
				System.out.println(channelName+" channel is not existing.Try with another.");
				channelName=sc.nextLine();
				for (int i = 0; i < channels.size(); i++) {
					if (channelName.equals(channels.get(i).getName())) {
						isExist=true;
						break;
					}
				}
		}
		}

}
 public void clearHistory(String channelName) {
	 boolean isCleared=false;
	 for (Channel channel : channels) {
		if (channel.getName().equals(channelName)) {
			channel.getMessages().clear();
			isCleared=true;
			System.out.println("History cleared!");
			break;
		}
	}
	 if (!isCleared) {
		 Scanner sc=new Scanner(System.in);
			while(!isCleared) {
				System.out.println(channelName+" channel is not existing.Try with another.");
				channelName=sc.nextLine();
				for (int i = 0; i < channels.size(); i++) {
					if (channelName.equals(channels.get(i).getName())) {
						System.out.println("History cleared!");
						isCleared=true;
						break;
					}
				}
	}
 }
}
}

