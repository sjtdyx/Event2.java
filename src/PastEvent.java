import java.time.LocalDate;

public class PastEvent {
   private LocalDate eventStartDate;
   private LocalDate eventEndDate;
   private String paymentStatus;
   private boolean requiresExtension;
   static final double eventCost=10_000;
   private String paymentDetails;
   private String eventID;
    private String eventName;
    private String  eventLocation;
    private String eventPointContact;
    private int totalParticipants;
    private int totalEventDays;


   public PastEvent(String eventID,String eventName,String eventLocation,String eventPointContact,int totalParticipants,int totalEventDays,LocalDate eventStartDate,LocalDate eventEndDate,String paymentStatus,boolean requiresExtension,String paymentDetails){
   

    this.eventStartDate=eventStartDate;
    this.eventEndDate=eventEndDate;
    this.paymentStatus=paymentStatus;
    this.requiresExtension=requiresExtension;
    this.paymentDetails=paymentDetails;
    this.eventID=eventID;
    this.eventName=eventName;
    this.eventLocation=eventLocation;
    this.eventPointContact=eventPointContact;
    this.totalEventDays=totalEventDays;
    this.totalParticipants=totalParticipants;
}


public LocalDate getEventStartDate() {
    return eventStartDate;
}


public void setEventStartDate(LocalDate eventStartDate) {
    this.eventStartDate = eventStartDate;
}


public LocalDate getEventEndDate() {
    return eventEndDate;
}


public void setEventEndDate(LocalDate eventEndDate) {
    this.eventEndDate = eventEndDate;
}


public String getPaymentStatus() {
    return paymentStatus;
}


public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
}


public boolean isRequiresExtension() {
    return requiresExtension;
}


public void setRequiresExtension(boolean requiresExtension) {
    this.requiresExtension = requiresExtension;
}


public String getPaymentDetails() {
    return paymentDetails;
}


public void setPaymentDetails(String paymentDetails) {
    this.paymentDetails = paymentDetails;
}


public String getEventID() {
    return eventID;
}


public void setEventID(String eventID) {
    this.eventID = eventID;
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


@Override
public String toString()
     {
    return "PastEvent [eventStartDate=" + eventStartDate + ", eventEndDate=" + eventEndDate + ", paymentStatus="
            + paymentStatus + ", requiresExtension=" + requiresExtension + ", paymentDetails=" + paymentDetails + "]";
}



}
