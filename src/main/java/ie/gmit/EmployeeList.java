package ie.gmit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    private List<Employee> list = new ArrayList<>();

    EmployeeList(){}

    public void addToList(Employee e){
        if (e.verifyAllFieldsSet()) {
            list.add(e);
        } else throw new IllegalArgumentException("Some Fields didnt set correctly");
    }

    public List<Employee> getList() {
        return list;
    }

}


