/*Sergey Moiseenko 2021 inClassTest 2
* This Class stores a list of employee class and has methods to add items to a list
* and can validate if the data is correct and unique*/
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

