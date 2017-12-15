package dream.blog.practice.bridge.api.impl;

import dream.blog.practice.bridge.api.AbstractMessage;
import dream.blog.practice.bridge.api.MessageImplementor;

public class NormalMessage extends AbstractMessage {
	public NormalMessage(MessageImplementor messageImplementor) {
		super(messageImplementor);
	}
	public void sendMessage(String message, String recipient) {
		super.sendMessage(message, recipient);
	}
}

