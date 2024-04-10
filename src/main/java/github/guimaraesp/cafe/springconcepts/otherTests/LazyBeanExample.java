package github.guimaraesp.cafe.springconcepts.otherTests;

public class LazyBeanExample {
    private final String beanId;

    public LazyBeanExample(String beanId) {
        this.beanId = beanId;
        System.out.println(beanId + " initialized!!!");
    }

    public void write(String message) {
        System.out.println(beanId + ": " + message);
    }

}
