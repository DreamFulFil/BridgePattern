package dream.blog.practice.bridge.api;

public abstract class AbstractMessage {

	protected MessageImplementor messageImplementor;
	
	public AbstractMessage(MessageImplementor messageImplementor) {
		this.messageImplementor = messageImplementor;
	}
	
	public void sendMessage(String message, String recipient) {
		messageImplementor.sendMessage(message, recipient);
	}
}
