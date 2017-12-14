package dream.blog.practice.bridge.api;

public interface EmergentMessage extends Message{
	void handleEmergency(Object matterToHandle);
}
