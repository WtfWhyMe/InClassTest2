package ie.gmit;

public class Employee {
  private String name = "0";
  private String phone = "0";
  private String id = "0";
  private int age = 0;
  private boolean verify = false;

  Employee(String name, String phone, String id, int age) {
    verify = verifyNameLength(name);
    if (verify) {
      this.name = name;
      verify = false;
    }
    verify = verifyPhoneLength(phone);
    if (verify) {
      this.phone = phone;
      verify = false;
    }
    verify = verifyIdLength(id);
    if (verify) {
      this.id = id;
      verify = false;
    }
    verify = verifyAge(age);
    if (verify) {
      this.age = age;
      verify = false;
    }
  }

  public boolean verifyNameLength(String name) {
    int length = name.length();
    if (length < 3 || length > 25) {
      throw new IllegalArgumentException("Invalid name");
    } else return true;
  }

  public boolean verifyIdLength(String id) {
    int length = id.length();
    if (length != 5) {
      throw new IllegalArgumentException("Invalid ID");
    } else return true;
  }

  public boolean verifyPhoneLength(String phone) {
    int length = phone.length();
    if (length != 8) {
      throw new IllegalArgumentException("Invalid Phone");
    } else return true;
  }

  public boolean verifyAge(int age) {
    if (age < 17) {
      throw new IllegalArgumentException("Invalid age. Too young");
    } else return true;
  }

  public boolean verifyAllFieldsSet() {
    if (name.equals("0") && phone.equals("0") && id.equals("0") && age == 0) {
      return false;
    }
    return true;
  }
}
