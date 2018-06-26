import Message.*;
public class Demo {
	public static void main(String[] args) {
		Slack slack=new Slack();
		slack.createNewChannel("General");
		slack.createNewChannel("Spam");
		slack.switchCurrentChannel("General");
		slack.postMessage(new TextMessage("Vini","zdraveite kolegi"));
		slack.postMessage(new TextMessage("Veni","zdravei kak si"));
		slack.showChannelHistory("General");
		slack.clearHistory("AAA");
		slack.showChannelHistory("AD");
		
	}

}
