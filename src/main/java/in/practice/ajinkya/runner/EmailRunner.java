package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.util.MyUtil;

@Component
public class EmailRunner implements CommandLineRunner {

	@Autowired
	private MyUtil mailUtil;

	public void run(String... args) throws Exception {
		Resource file = new FileSystemResource("C:\\Users\\HP\\Desktop\\mailDemo.txt");

		boolean sent = mailUtil.send(
				"ajinkyaghodekar1998@gmail.com", 
				new String[] {}, 
				new String[] {}, 
				"This First Mail Configration Example...", 
				"Greetings of the day, Hello Ajinkya",
				file);
		if(sent) 
			System.out.println("SUCCESS");
		else
			System.out.println("FAILED");
	}

}