package listeners;

import java.io.File;

public class PhoneNotificationListener implements IEventListener {

	private String phone;

	public PhoneNotificationListener(String phone) {
		this.phone = phone;
	}

	@Override
	public void update(String eventType, File file) {
		System.out.println("Phone to " + phone + ": Someone has performed " + eventType
				+ " operation with the following file: " + file.getName());

	}

}
