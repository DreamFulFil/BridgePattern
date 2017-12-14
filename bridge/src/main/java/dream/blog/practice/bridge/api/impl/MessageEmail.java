package dream.blog.practice.bridge.api.impl;

import dream.blog.practice.bridge.api.Message;

public class MessageEmail implements Message{
	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("EMAIL通知普通訊息:"+message + "收件人:"+ recipient);
	}
}
