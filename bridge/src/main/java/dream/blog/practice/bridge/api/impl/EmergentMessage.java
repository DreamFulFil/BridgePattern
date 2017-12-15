package dream.blog.practice.bridge.api.impl;

import dream.blog.practice.bridge.api.AbstractMessage;
import dream.blog.practice.bridge.api.MessageImplementor;

public class EmergentMessage extends AbstractMessage {
	public EmergentMessage(MessageImplementor messageImplementor) {
		super(messageImplementor);
	}
	public void sendMessage(String message, String recipient) {
		message = "緊急！"+ message;
		super.sendMessage(message, recipient);
	}
	public Object observe(String messageId) {
		if(messageId.equals("Resolved")) {
			//Do something...
		}else {
			//Do something else...
		}
		return new Object();//Return something
	}
}
