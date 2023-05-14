public class ForumMonitor implements Observer{
    
    public static final int UNREAD_ALERT_LEVEL = 0; //Max alerts before notifying

    public void Update(Observable observable, Object object){

        StudentDashboard messages = (StudentDashboard) observable;

        if(messages.GetUnreadMessages() > UNREAD_ALERT_LEVEL) {
            System.out.println("You have " + messages.GetUnreadMessages() + " unread messages.");
        } 
        else 
        {
            System.out.println("No unread messages found.");
        }
    }

}
