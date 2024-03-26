public class Main {
    public static void main(String[] args) throws Exception {
    
        ConferenceEvent conferenceevent=new ConferenceEvent("E001", "AI Conference", "Paris", "Mei Ling", 8.99, 0, 0, 0, 0, 0);
        conferenceevent.calculateEventCost();
        System.out.println(conferenceevent);

        MusicConcertEvent musicconcertevent=new MusicConcertEvent("E001", "AI Conference", "Paris", "Mei Ling", 0, 0, 0, false, 0);
        musicconcertevent.calculateEventCost();
        System.out.println(musicconcertevent);

        PastEvent pastevent=new PastEvent("E003", "AI Conference", null, null, 0, 0, null, null, null, false, null);
        pastevent.getPaymentDetails();
        System.out.println(pastevent);
    }


}
