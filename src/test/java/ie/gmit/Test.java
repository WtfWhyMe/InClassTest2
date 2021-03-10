/*Sergey Moiseenko 2021 inClassTest 2
* this is a test class that tests main functionality*/
package ie.gmit;

import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test {

    @org.junit.jupiter.api.Test
    void testInvalidInputName(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee e2 = new Employee("hi", "88888888", "55555", 18);
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }

    @org.junit.jupiter.api.Test
    void testInvalidInputPhone(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee e3 = new Employee("Sergey", "7777777", "55555", 18);
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }

    @org.junit.jupiter.api.Test
    void testInvalidInputId(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee e4 = new Employee("Sergey", "88888888", "4444", 18);
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }

    @org.junit.jupiter.api.Test
    void testInvalidInputAge(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee e5 = new Employee("Sergey", "88888888", "55555", 16);
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }

    @org.junit.jupiter.api.Test
    void testVerifyValidInput(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
              Employee e1 = new Employee("Sergey", "88888888", "55555", 18);
            }
        };
        assertDoesNotThrow(ex);
    }

    @org.junit.jupiter.api.Test
    void testVerifyAddingToList(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee e1 = new Employee("Sergey", "88888888", "55555", 18);
                Employee e2 = new Employee("hello", "44444444", "77777", 20);
                EmployeeList el = new EmployeeList();
                el.addToList(e1);
                el.addToList(e2);
            }
        };
        assertDoesNotThrow(ex);
    }
    @org.junit.jupiter.api.Test
    void testVerifyNotAddingToList(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee e2 = new Employee("gh", "4444", "77", 15);
                EmployeeList el = new EmployeeList();
                el.addToList(e2);
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }
    @org.junit.jupiter.api.Test
    void testVerifyNotAddingSameClasses(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee e1 = new Employee("Sergey", "88888888", "55555", 18);
                Employee e2 = new Employee("dfgdfg", "99999999", "666666", 20);
                Employee e3 = new Employee("Sergey", "88888888", "55555", 22);
                EmployeeList el = new EmployeeList();
                el.addToList(e1);
                el.addToList(e2);
                el.addToList(e3);
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }
}
