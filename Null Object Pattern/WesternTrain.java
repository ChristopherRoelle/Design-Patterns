public class WesternTrain implements TrainStatus{
    
    private boolean activated;

    public void Activate(){
        activated = true;
        System.out.println("Train Status Update: Western Train Activated.");
    }

    public void Deactivate(){
        activated = false;
        System.out.println("Train Status Update: Western Train Deactivated.");
    }

    public boolean IsActive(){
        return activated;
    }

}
