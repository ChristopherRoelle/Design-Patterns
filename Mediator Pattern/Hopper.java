public class Hopper {
    
    private WidgetProductionSystem mediator;
    private boolean enabled;

    //constructor
    public Hopper(WidgetProductionSystem mediator){
        this.mediator = mediator;
        enabled = false;
        mediator.MediateHopper(this);
    }

    //accessor
    public boolean GetHopperEnabled(){
        return enabled;
    }

    public void Enable(){
        enabled = true;
        mediator.HopperEnabled();
        System.out.println("Mediated Event: Hopper Initialized.");
    }

    public void Disable(){
        enabled = false;
        mediator.HopperDisabled();
        System.out.println("Mediated Event: Hopper DeInitialized.");
    }

}
