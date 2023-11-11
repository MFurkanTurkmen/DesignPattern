public class Customer {
    private String name;
    private String surname;
    private String email;
    private int age;
    private String phone;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Customer(String name, String surname, String email, int age, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    // yöntem 1
    // bunun aynısını başka bir sınıfa atayarak da yapabiliriz.
    public static class CustomerBuilder {
        private String name;
        private String surname;
        private String email;
        private int age;
        private String phone;

        public static CustomerBuilder startBuilder() {
            return new CustomerBuilder();
        }

        public Customer build(){
            Customer customer= new Customer();
            customer.setAge(age);
            customer.setEmail(email);
            customer.setName(name);
            customer.setSurname(surname);
            customer.setPhone(phone);
            return customer;
        }

        public CustomerBuilder name(String name){
            this.name=name;
            return this;
        }
        public CustomerBuilder surname(String surname){
            this.surname=surname;
            return this;
        }
        public CustomerBuilder email(String email){
            this.email=email;
            return this;
        }
        public CustomerBuilder phone(String phone){
            this.phone=phone;
            return this;
        }
        public CustomerBuilder age(int age){
            this.age=age;
            return this;
        }






    }

}
