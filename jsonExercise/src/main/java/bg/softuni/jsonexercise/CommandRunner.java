package bg.softuni.jsonexercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");

    }
}
