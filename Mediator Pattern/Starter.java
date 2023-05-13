public class Starter {
    
    private WidgetProductionSystem mediator;
    private boolean poweredOn;

    //Constructor
    public Starter(WidgetProductionSystem mediator){
        this.mediator = mediator;
        poweredOn = false;

        mediator.MediateStarter(this);
    }

    //accessor
    public boolean IsSystemOn(){
        return poweredOn;
    }

    public void TurnOn(){
        poweredOn = true;
        mediator.StarterPoweredOn();
        System.out.println("Mediated Event: Starter Powered On.");
    }

    public void TurnOff(){
        poweredOn = false;
        mediator.StarterPoweredOff();
        System.out.println("Mediated Event: Started Powered Off.");
    }

}
