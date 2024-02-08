public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Иванов", "Иван");
        Client client2 = new Client("Алексеев", "Алексей");
        Client client3 = new Client("Семенов", "Семен");

        client1.addCard(new Card(1111, 111, 1000.0));
        client1.addCard(new Card(1111, 111, 2000.0));
        client1.addCard(new Card(2222, 111, 3000.0));
        client1.addCard(new Card(1111, 222, 4000.0));

        client2.addCard(new Card(1111, 111, 1000.0));
        client2.addCard(new Card(2222, 111, 3000.0));
        client2.addCard(new Card(1111, 222, 4000.0));

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);



    }
}
