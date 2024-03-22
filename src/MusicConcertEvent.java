public class MusicConcertEvent extends Event{
    private boolean merchandiseRequired;
    private double merchandiseCost;
   // private String calculateEventCost;
    private double musicConcertEventCost;
        public MusicConcertEvent(String eventID,String eventName,String eventLocation,String eventPointContact,double eventCost,int totalParticipants,int totalEventDays,boolean merchandiseRequired,double merchandiseCost){
        super(eventID, eventName,eventLocation, eventPointContact, eventCost, totalParticipants, totalEventDays); 
        this.merchandiseRequired=merchandiseRequired;
        this.merchandiseCost=merchandiseCost;
    }

        public boolean isMerchandiseRequired() {
            return merchandiseRequired;
        }

        public void setMerchandiseRequired(boolean merchandiseRequired) {
            this.merchandiseRequired = merchandiseRequired;
        }

        public double getMerchandiseCost() {
            return merchandiseCost;
        }

        public void setMerchandiseCost(double merchandiseCost) {
            this.merchandiseCost = merchandiseCost;
        }

       // public String getCalculateEventCost() {
           // return calculateEventCost;
       // }

       // public void setCalculateEventCost(String calculateEventCost) {
           // this.calculateEventCost = calculateEventCost;
       // }
@Override
public void calculateEventCost(){
    musicConcertEventCost=getEventCost()+(getMerchandiseCost()*getTotalParticipants()*getTotalEventDays());
}
public String toString(){
    return"MusicConcert Event details:"+"\n"+
    "Event ID:"+"getEventid()"+"\n"+
    "Event Name:"+"getEventName()"+"\n"+
    "Event Location:"+"getEventLocation()"+"\n"+
    "Event PointOfContact:"+"getEventPointOfContact()"+"\n"+
   // "Event Cost:"+"getEventCost()"+"\n"+
    "Total participants:"+"getTotalParticipants()"+"\n"+
    "Total EventDays:"+"getTotalEventDays()"+"\n"+
    "Total MusicConcert Cost:"+musicConcertEventCost;
}
    
    
}
