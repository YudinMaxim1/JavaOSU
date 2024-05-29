//Задание 3

import java.util.*;
import java.util.List;

class Clients {
    private int id;
    private String name;
    private int age;
    private String gender;
    private List<Phone> phones;

    public Clients(int id, String name, int age, String gender, List<Phone> phones){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phones = phones;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public List<Phone> getPhones(){
        return phones;
    }
    public boolean haveMobilePhone(){
        return phones.stream().anyMatch(phone ->phone.getType().equals("mobile"));
    }
    public static Comparator<Clients> ageComparator = Comparator.comparingInt(Clients::getAge);

    @Override
    public String toString(){
        return "Client:" +
                "\nid:" + getId() +
                "\nname:" + getName() +
                "\nage:" + getAge() +
                "\ngender:" + getGender() +
                "\n\n";
    }
}

class Phone{
    private String number;
    private String type;

    public Phone(String number, String type){
        this.number = number;
        this.type = type;
    }

    public String getNumber(){
        return number;
    }

    public String getType(){
        return type;
    }
}

public class Client{
    public static void main(String[] args){
        List<Clients> clients = new ArrayList<>();
        clients.add(new Clients(1, "Ivan", 15, "male", List.of(new Phone("123456789", "mobile"))));
        clients.add(new Clients(2, "Eugene", 28, "male", List.of(new Phone("234567891", "mobile"))));
        clients.add(new Clients(3, "Sara", 65, "female", List.of(new Phone("456456", "stationary"))));
        clients.add(new Clients(4, "Henry", 55, "male", List.of(new Phone("789456", "stationary"))));
        clients.add(new Clients(5, "Valery", 25, "female", List.of(new Phone("789456123", "mobile"))));

        double averageAge = clients.stream()
                .filter(client -> client.getPhones().stream().anyMatch(phone -> phone.getType().equals("stationary")))
                .mapToInt(Clients::getAge)
                .average()
                .orElse(0.0);
        System.out.println("Average age with stationary phones: " + averageAge);

        System.out.println("Clients 18+ with mobile phones: ");
        clients.stream()
                .filter(clients1 -> clients1.getAge() >= 18 && clients1.haveMobilePhone())
                .forEach(System.out::println);

        boolean isFemaleSixteen = clients.stream()
                .anyMatch(clients2 -> clients2.getAge() >= 60 && clients2.getGender().equals("female") && clients2.getPhones().stream()
                .anyMatch(phone -> phone.getType().equals("stationary")));
        System.out.println("Female sixteen+ with stationary phone: " + isFemaleSixteen);

        System.out.println("Phones directory (by name and age): ");
        clients.stream()
                .sorted(Comparator.comparing(Clients::getName).thenComparing(Clients::getAge))
                .forEach(System.out::println);
    }

}

