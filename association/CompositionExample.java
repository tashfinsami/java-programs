package association;

class Room {
    String name;

    Room(String name) {
        this.name = name;
    }

    void roomDetails() {
        System.out.println("Room: " + name);
    }
}

class House {
    private Room room;

    House() {
        // House creates and owns the Room
        room = new Room("Bedroom");
    }

    void showRoom() {
        room.roomDetails();
    }
}

public class CompositionExample {
    public static void main(String[] args) {

        House house = new House();

        house.showRoom();
    }
}