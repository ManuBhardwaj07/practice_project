class City {
    String name;

    public City(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class State {
    String name;

    public State(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Address {
    String addr;
    City city;
    State state;

    public Address(String addr, City city, State state) {
        this.addr = addr;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return addr + " - " + city + " - " + state;
    }
}

public class Test {
    public static void main(String[] args) {
        City c = new City("Ahmedabad");
        State s = new State("Gujarat");
        Address a = new Address("123 Street", c, s);

        System.out.println(a);
    }
}
