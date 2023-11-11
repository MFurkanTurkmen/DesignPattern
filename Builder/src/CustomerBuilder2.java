// yöntem 2
public class CustomerBuilder2 {
    private String name;
    private String surname;
    private String email;
    private int age;
    private String phone;

    public static CustomerBuilder2 builder(){
        return new CustomerBuilder2();
    }

    public CustomerBuilder2 age(int age) {
        this.age = age;
        return this;
    }

    public CustomerBuilder2 setName(String name) {
        this.name = name;
        return this;

    }

    public CustomerBuilder2 setSurname(String surname) {
        this.surname = surname;
        return this;

    }

    public CustomerBuilder2 setEmail(String email) {
        this.email = email;
        return this;

    }

    public CustomerBuilder2 setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public Customer build(){
        return new Customer(
                this.name,this.surname,this.email,this.age,this.phone
        );
    }
}
