package ie.gmit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    private List<Employee> list = new ArrayList<>();

    EmployeeList(){}

    public void addToList(Employee e){
        if (e.verifyAllFieldsSet()) {
            if(list.size() > 0)
            {
               if (verifyUniqueInput(e))
               {
                   list.add(e);
               } else throw new IllegalArgumentException("This employee class is already in the list");
            } else{
                list.add(e);
            }
        } else throw new IllegalArgumentException("Some Fields didnt set correctly");
    }

    public List<Employee> getList() {
        return list;
    }
    public int getListSize(){
        return list.size();
    }
    public boolean verifyUniqueInput(Employee e){
        for(int i = 0; i < list.size(); i++){
            if(e.equals(list.get(i))){
                return false;
            }
        }
        return true;
    }
}

