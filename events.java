public class Event {

    private String name;
    private String date;
    private String location;
    private int attendees;

   
    public Event(String name, String date, String location, int attendees) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.attendees = attendees;
    }

  
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int getAttendees() {
        return attendees;
    }


    public void displayEventDetails() {
        System.out.println("Event Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
        System.out.println("Attendees: " + attendees);
    }


    }
