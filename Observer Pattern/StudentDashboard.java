public class StudentDashboard extends Observable{
    
    private int unreadMessages;

    //constructor
    public StudentDashboard(){
        unreadMessages = 0;
    }

    public void SetUnreadMessages(int messages){
        unreadMessages = messages;

        /*Add functionality here to notify observers of a change */
    }

    public int GetUnreadMessages(){
        return unreadMessages;
    }

}
