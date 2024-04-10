package github.guimaraesp.cafe.springconcepts.otherTests;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("Teaching from ScienceTeacher class!");
    }
}
