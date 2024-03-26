public class MusicConcertEvent {
    private boolean merchandiseRequired;
    private double merchandiseCost;
   // private String calculateEventCost;
    private double musicConcertEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointContact;
    private double musiceventCost;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCostClass calculateEventCostObject;

        public MusicConcertEvent(String eventID,String eventName,String eventLocation,String eventPointContact,double musiceventCost,int totalParticipants,int totalEventDays,boolean merchandiseRequired,double merchandiseCost){
        
        this.merchandiseRequired=merchandiseRequired;
        this.merchandiseCost=merchandiseCost;
    
    this.totalParticipants=totalParticipants;
    this.totalEventDays=totalEventDays;
    this.eventID=eventID;
    this.eventName=eventName;
    this.eventLocation=eventLocation;
    this.eventPointContact=eventPointContact;
    this.musiceventCost=musiceventCost;
    this.totalEventDays=totalEventDays;
    this.totalParticipants=totalParticipants;}

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
      
        public String geteventID() {
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
        public double getMusicEventCost() {
            return musiceventCost;
        }
        public void setEventCost(double musiceventCost) {
            this.musiceventCost = musiceventCost;
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
        public CalculateEventCostClass getCalculateEventCostObject(){
            return calculateEventCostObject;
        }
        public void setCalculateEventCostObject(CalculateEventCostClass calculateEventCostObject){
            this.calculateEventCostObject=calculateEventCostObject;
        }
        public void calculateEventCost(){
            musiceventCost=calculateEventCostObject.calculateEventCost()+(getMerchandiseCost()+getTotalParticipants())*getTotalEventDays();
        }

public String toString(){
    return"MusicConcert Event details:"+"\n"+
    "Event ID:"+eventID+"\n"+
    "Event Name:"+eventName+"\n"+
    "Event Location:"+eventLocation+"\n"+
    "Total participants:"+totalParticipants+"\n"+
    "Total EventDays:"+totalEventDays+"\n"+
    "Total MusicConcert Cost:"+musicConcertEventCost;
}
    
    
}
