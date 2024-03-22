public class Event{
    public static final double insurance=1000.00;
    public static final double tax=0.6;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    
    


public  Event(String eventID,String eventName,String eventLocation,String eventPointContact,double eventCost,int totalParticipants,int totalEventDays){
    this.eventID=eventID;
    this.eventName=eventName;
    this.eventLocation=eventLocation;
    this.eventPointContact=eventPointContact;
    this.eventCost=eventCost;}

    public  String getEventid() {
        return eventID;
    }
    public void setEventID(String eventID){
        this.eventID=eventID;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
    public String getEventPointContact() {
        return eventPointContact;
    }
    public void setEventPointContact(String eventPointContact) {
        this.eventPointContact = eventPointContact;
    }
    public double getEventCost() {
        return eventCost;
    }
    public void setEventCost(double eventCost) {
        this.eventCost = eventCost;
    }
    public int getTotalParticipants() {
        return totalParticipants;
    }
    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }
    public int getTotalEventDays() {
        return totalEventDays;
    }
    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
    }
public String toString(){
    return eventID+""+eventName+""+eventLocation+""+eventPointContact+""+eventCost+""+totalParticipants+""+totalEventDays+"";
}
public void calculateEventCost(){
this.eventCost=eventCost+(eventCost*tax)+insurance;
}
}

