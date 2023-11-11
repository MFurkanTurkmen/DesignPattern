import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Customer customer= Customer.CustomerBuilder.startBuilder()

                .name("fff")
                .age(22).build();
        System.out.println(customer.toString());

        Customer customer1= CustomerBuilder2.builder()
                .setName("furkannn")
                .age(2222)
                .setPhone("45454545454")
                .build();
        System.out.println("***");

        System.out.println("customer2: "+customer1);
    }
}