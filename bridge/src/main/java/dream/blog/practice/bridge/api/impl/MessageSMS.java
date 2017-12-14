package dream.blog.practice.bridge.api.impl;

import dream.blog.practice.bridge.api.Message;

public class MessageSMS implements Message {
	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("簡訊通知普通訊息:"+message + "收件人:"+ recipient);
	}
}
