import java.time.LocalDate;

public class PastEvent extends Event{
   private LocalDate eventStartDate;
   private LocalDate eventEndDate;
   private String paymentStatus;
   private boolean requiresExtension;
   static final double eventCost=10_000;
   private String paymentDetails;


   public PastEvent(String eventID,String eventName,String eventLocation,String eventPointContact,double eventCost,int totalParticipants,int totalEventDays,LocalDate eventStartDate,LocalDate eventEndDate,String paymentStatus,boolean requiresExtension,String paymentDetails){
   
super(eventID, eventName,eventLocation, eventPointContact, eventCost, totalParticipants, totalEventDays);
    this.eventStartDate=eventStartDate;
    this.eventEndDate=eventEndDate;
    this.paymentStatus=paymentStatus;
    this.requiresExtension=requiresExtension;
    this.paymentDetails=paymentDetails;
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
@Override
public void calculateEventCost(){
    System.out.println();
}


@Override
public String toString() {
    return "PastEvent [eventStartDate=" + eventStartDate + ", eventEndDate=" + eventEndDate + ", paymentStatus="
            + paymentStatus + ", requiresExtension=" + requiresExtension + ", paymentDetails=" + paymentDetails + "]";
}



}
