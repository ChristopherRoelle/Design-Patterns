public class AssemblySystem {
    
    public enum SystemSpeed {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN};

    private WidgetProductionSystem mediator;
    private boolean enabled;
    private SystemSpeed currentSpeed;

    //constructor
    public AssemblySystem(WidgetProductionSystem mediator){
        this.mediator = mediator;
        enabled = false;
        currentSpeed = SystemSpeed.ZERO;
        mediator.MediateAssemblySystem(this);
    }

    //accessor
    public SystemSpeed GetSystemSpeed(){
        return currentSpeed;
    }

    //mutator
    public void SetSystemSpeed(SystemSpeed speed){
        if((IsEnabled()) && (GetSystemSpeed() != speed)){
            currentSpeed = speed;
            mediator.AssemblySystemSpeedChanged();
            System.out.println("Mediated Event: System Speed Changed to " + currentSpeed + ".");
        }
    }

    //additional methods
    public void Enable(){
        enabled = true;
        mediator.AssemblySystemEnabled();
        System.out.println("Mediated Event: System Initiated.");
    }

    public void Disable(){
        enabled = false;
        mediator.AssemblySystemDisabled();
        System.out.println("Mediated Event: System Deinitialized.");
    }

    public boolean IsEnabled(){
        return enabled;
    }

}
