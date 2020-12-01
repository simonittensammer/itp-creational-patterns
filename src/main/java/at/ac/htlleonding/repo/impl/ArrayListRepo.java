package at.ac.htlleonding.repo.impl;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class ArrayListRepo {
    ArrayList<String> valueList = new ArrayList<>();

    public void addValue(String value) {
        valueList.add(value);
    }

    public String[] getValues() {
        return valueList.toArray(new String[valueList.size()]);
    }
}
