package github.guimaraesp.cafe.springconcepts.otherTests;

import org.springframework.stereotype.Component;


@Component
public class MathTeacher  implements Teacher {
    @Override
    public void teach() {
        System.out.println("Teaching from MathTeacher class!");
    }
}
