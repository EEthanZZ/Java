package Quiz;

public class Employee {
    protected String name;

    protected String add;

    protected int phone;

public Employee(){}

public Employee(String name, String add){
    this.name = name;
    this.add = add;
}

public Employee(String name, String add, int phone){
    this.name = name;
    this.add = add;
    this.phone = phone;}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return this.add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", add='" + getAdd() + "'" +
            ", phone='" + getPhone() + "'" +
            "}";
    }

    public void run() {
    }

}