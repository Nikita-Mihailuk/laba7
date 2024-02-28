import java.util.Scanner;
class Customer{
    String name;
    String surname;
    String patronymic;
    String address;
    String telephone;
    String cardNumber;
    int accountNumber;

    Customer(String name, String surname, String patronymic, String address, String telephone, String cardNumber, int accountNumber){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.telephone = telephone;
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
    }
    public void displayInfo(){
            System.out.println("Имя: " + name + "\n Фамилия: " + surname + "\n Отчество: " + patronymic + " \n Адрес: " + address + " \n Телефон: " + telephone + " \n Номер карты: " + cardNumber + " \n Номер счета: " + accountNumber);
        }
    }

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Иван", "Иванов", "Иванович", "ул. Пушкина, д. 10", "+7 (123) 456-78-90", "1234 5678 9012 3456", 123456789);
        customers[1] = new Customer("Петр", "Петров", "Петрович", "ул. Ленина, д. 5", "+7 (987) 654-32-10", "9876 5432 1098 7654", 987654321);
        customers[2] = new Customer("Мария", "Сидорова", "Ивановна", "пр. Гагарина, д. 15", "+7 (111) 222-33-44", "1111 2222 3333 4444", 111122223);

        System.out.print("Введите номер счета: ");
        int a = in.nextInt();

        System.out.println("Люди, номер счета которых совпадает с заданным: ");
        for (Customer n : customers){
            if (n.accountNumber == a) n.displayInfo();
        }
    }
}