package github.guimaraesp.cafe.springconcepts;

import github.guimaraesp.cafe.springconcepts.otherTests.*;
import github.guimaraesp.cafe.springconcepts.testCase12.AppConfigTestCase12;
import github.guimaraesp.cafe.springconcepts.testCase12.CollectionBeanTestCase12;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringConceptsApplicationTests {

    @Value("${value.from.properties}")
    String variableFromProperties;

    @Autowired
    Teacher teacher1;
    @Autowired
    @Qualifier("mathTeacher")
    Teacher teacher2;


    @Test
    void test_Question2_AtValueAnnotation() {
        System.out.println(variableFromProperties);
    }

    @Test
    void test_Question3_AtPropertySourcesAnnotation() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        System.out.println(context.getBean(ApplicationConfiguration.class).getExampleValueFromExternalPropertiesFile());
        context.close();
    }

    @Test
    void test_Question4_SpringIOC() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.getBean(CollectionBean.class).printNames();
        context.close();
    }

    @Test
    void test_Question6and7_AtPrimaryAtQualifierAnnotations() {
        teacher1.teach(); // Tests Primary
        teacher2.teach(); // Tests Qualifier
    }

    @Test
    void test_Question9and10_BeanLazyInitialization() {
        System.out.println("Test method for Question 9 and 10 were initialized!");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        System.out.println("Application context initialized!!!");
        context.getBean(ApplicationConfiguration.class).lazyBeansPrint();
        context.close();
    }

    @Test
    void test_Question11_DependencyInjection() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        UserService userService = context.getBean(UserService.class);
        User user = new User("John");
        userService.saveUser(user);
        context.close();

    }

    @Test
    void test_Question12_DependencyInjectionForList() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigTestCase12.class);
        context.getBean(CollectionBeanTestCase12.class).printNames();
        context.close();
    }

}
