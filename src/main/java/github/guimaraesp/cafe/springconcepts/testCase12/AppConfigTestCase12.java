package github.guimaraesp.cafe.springconcepts.testCase12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("github.guimaraesp.cafe.springconcepts.testCase12")
public class AppConfigTestCase12 {

    @Bean
    public List<Integer> numbersssss() {
        return Arrays.asList(1, 12, 455, 500);
    }

}
