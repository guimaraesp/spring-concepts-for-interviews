package github.guimaraesp.cafe.springconcepts.otherTests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("github.guimaraesp.cafe.springconcepts.otherTests")
@PropertySource({"file:/home/guimap/develop/spring-concepts/src/main/resources/application.properties"})
public class ApplicationConfiguration {

    @Value("${example.value}")
    private String exampleValueFromExternalPropertiesFile;

    @Bean("lazyBean1")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public LazyBeanExample getLazyBean1() {
        return new LazyBeanExample("LazyBeanExample 1");
    }

    @Bean("lazyBean2")
    public LazyBeanExample getLazyBean2() {
        return new LazyBeanExample("LazyBeanExample 2");
    }

    @Bean
    public List<String> names() {
        return Arrays.asList("name1", "name2", "name3");
    }


    public void lazyBeansPrint() {
        this.getLazyBean1().write("hello from LazyBean1!");
        this.getLazyBean2().write("hello from LazyBean2!");
    }

    public String getExampleValueFromExternalPropertiesFile() {
        return exampleValueFromExternalPropertiesFile;
    }

}
