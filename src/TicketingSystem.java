import java.util.*;

public class TicketingSystem {
    private final Map<String, LinkedList<Integer>>
            events;

    public TicketingSystem() {
        this.events = new HashMap<>();
    }

    // Add a new event
    public void addEvent(String eventId) {
        if (!events.containsKey(eventId)) {
            events.put(eventId, new LinkedList<>());
        }
    }

    // Issue a ticket for an event
    public void issueTicket(String eventId, int ticketNumber) {
        if (events.containsKey(eventId)) {
            events.get(eventId).add(ticketNumber);
        } else {
            System.out.println("Ticket not found");
        }
    }

    // Check if a ticket is valid for an event
    public boolean checkTicket(String eventId, int ticketNumber) {
        if (events.containsKey(eventId)) {
            return events.get(eventId).contains(ticketNumber);
        } else {
            System.out.println("Ticket not found");
            return false;
        }
    }

    // Use a ticket is valid for an event
    public boolean useTicket(String eventId, int ticketNumber) {
        if (events.containsKey(eventId)) {
            return events.get(eventId).removeFirstOccurrence(ticketNumber);
        } else {
            System.out.println("Ticket not found");
            return false;
        }
    }

    public static void main(String[] args) {
        TicketingSystem ts = new TicketingSystem();

            ts.addEvent();
            ts.issueTicket();
            ts.issueTicket();

        System.out.println(ts.checkTicket()); //Output: true

        System.out.println(ts.useTicket()); //Output: true

        System.out.println(ts.checkTicket()); //Output: false


    }

}
