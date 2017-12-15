package dream.blog.practice.bridge.api.impl;

import dream.blog.practice.bridge.api.MessageImplementor;

public class MessageSMSImplementor implements MessageImplementor {
	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("簡訊通知:"+message + "收件人:"+ recipient);
	}
}

