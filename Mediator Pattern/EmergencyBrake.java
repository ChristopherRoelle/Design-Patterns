public class EmergencyBrake {
    
    //class variables
    private WidgetProductionSystem mediator;
    private boolean enabled;
    private boolean applied;

    //constructor
    public EmergencyBrake(WidgetProductionSystem mediator){
        this.mediator = mediator;
        enabled = false;
        applied = false;
        mediator.MediateEmergencyBrake(this);
    }

    public void Enable(){
        enabled = true;
        mediator.SetEmergencyBrakeEnabled();
        System.out.println("Mediated Event: System Decelerator Enabled.");
    }

    public void Disable(){
        enabled = false;
        mediator.SetEmergencyBrakeDisabled();
        System.out.println("Mediated Event: System Decelerator Disabled.");
    }

    public boolean IsEnabled(){
        return enabled;
    }

    public void Apply(){
        if(IsEnabled()){
            applied = true;
            mediator.SetEmergencyBrakeEngaged();
            System.out.println("Mediator Event: Emergency Brake Engaged.");
        }
    }

    public void Release(){
        if(IsEnabled()){
            applied = false;
            mediator.SetEmergencyBrakeDisengaged();
            System.out.println("Mediator Event: Emergency Brake Disengaged.");
        }
    }

}
