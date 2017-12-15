package dream.blog.practice.bridge.api.impl;

import dream.blog.practice.bridge.api.MessageImplementor;

public class MessageEmailImplementor implements MessageImplementor {
	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("EMAIL通知:"+message + "收件人:"+ recipient);
	}
}


