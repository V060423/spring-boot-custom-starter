import org.apache.tomcat.jni.Thread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 */
@SpringBootApplication(scanBasePackages = "com.springboot.custom")
public class Application {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Application.class, args);
	}
}
