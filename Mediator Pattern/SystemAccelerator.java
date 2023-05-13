public class SystemAccelerator {
    
    //class variables
    private WidgetProductionSystem mediator;
    private boolean enabled;
    private int speed;

    //constructor
    public SystemAccelerator(WidgetProductionSystem mediator){
        this.mediator = mediator;
        enabled = false;
        speed = 0;
        mediator.MediateSystemAcceleration(this);
    }

    //accessor
    public int GetAcceleratorSpeed(){
        return speed;
    }

    public boolean IsEnabled(){
        return enabled;
    }

    public void Enable(){
        enabled = true;
        mediator.SystemAcceleratorEnabled();
        System.out.println("Mediated Event: System Accelerator Enabled");
    }

    public void Disable(){
        enabled = false;
        mediator.SystemAcceleratorDisabled();
        System.out.println("Mediated Event: System Accelerator Disabled.");
    }

    public void AccelerateToSpeed(int speed){
        if(IsEnabled()){
            this.speed = speed;
            mediator.SystemAcceleratorUsed();
            System.out.println("Mediated Event: System Accelerator Set to " + speed + ".");
        }
    }

}
