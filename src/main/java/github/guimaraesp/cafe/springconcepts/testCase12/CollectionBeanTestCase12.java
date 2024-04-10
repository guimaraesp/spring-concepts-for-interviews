package github.guimaraesp.cafe.springconcepts.testCase12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CollectionBeanTestCase12 {

    @Autowired
    private List<Integer> numbers;

    @Autowired
    private List<Integer> anotherNumbers;

    public List<Integer> getAnotherNumbers() {
        return anotherNumbers;
    }

    public void setAnotherNumbers(List<Integer> anotherNumbers) {
        this.anotherNumbers = anotherNumbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void printNames() {
        System.out.println(numbers);
        System.out.println(anotherNumbers);
    }

}
