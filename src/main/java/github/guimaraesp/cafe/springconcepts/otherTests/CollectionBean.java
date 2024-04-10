package github.guimaraesp.cafe.springconcepts.otherTests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CollectionBean {

    @Autowired
    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void printNames() {
        System.out.println(names);
    }

}
