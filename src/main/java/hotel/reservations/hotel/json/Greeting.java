package hotel.reservations.hotel.json;

public class Greeting {
    // Really simple Greeting object to test the JSON serialization
    private final String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' +
                '}';
    }
}
