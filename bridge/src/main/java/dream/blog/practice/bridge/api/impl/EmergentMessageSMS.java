package dream.blog.practice.bridge.api.impl;

import dream.blog.practice.bridge.api.EmergentMessage;

public class EmergentMessageSMS implements EmergentMessage {
	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("簡訊通知緊急訊息:"+message + "收件人:"+ recipient);

	}
	@Override
	public void handleEmergency(Object matterToHandle) {
		System.out.println("處理緊急狀況:"+ matterToHandle);
	}
}
