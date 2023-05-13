public class WidgetProductionSystem {

    //Class variables
    private Starter starter;
    private AssemblySystem assemblySystem;
    private SystemAccelerator systemAccelerator;
    private EmergencyBrake emergencyBrake;
    private Hopper hopper;
    private int currentSpeed;

    //constructor
    public WidgetProductionSystem(){
        currentSpeed = 0;
    }

    //Mediation Methods
    public void MediateStarter(Starter starter){
        this.starter = starter;
    }

    public void MediateAssemblySystem(AssemblySystem assemblySystem){
        this.assemblySystem = assemblySystem;
    }

    public void MediateSystemAcceleration(SystemAccelerator systemAccelerator){
        this.systemAccelerator = systemAccelerator;
    }

    public void MediateEmergencyBrake(EmergencyBrake emergencyBrake){
        this.emergencyBrake = emergencyBrake;
    }

    public void MediateHopper(Hopper hopper){
        this.hopper = hopper;
    }

    //Object Interaction Methods
    public void StarterPoweredOn(){
        assemblySystem.Enable();
        hopper.Enable();
        systemAccelerator.Enable();
        emergencyBrake.Enable();
    }

    public void StarterPoweredOff(){
        assemblySystem.Disable();
        hopper.Disable();
        systemAccelerator.Disable();
        emergencyBrake.Disable();
    }

    public void AssemblySystemEnabled(){
        System.out.println("Mediation Decision: Hopper Enabled.");
    }

    public void AssemblySystemDisabled(){
        System.out.println("Mediation Decision: Hopper Disabled.");
    }

    public void HopperEnabled(){
        System.out.println("Mediation Decision: Assembly System Enabled.");
    }

    public void HopperDisabled(){
        System.out.println("Mediation Decision: Assembly System Disabled.");
    }

    public void AssemblySystemSpeedChanged(){
        System.out.println("Mediation Decision: Permissable Speed Change.");
    }

    public void SystemAcceleratorEnabled(){
        System.out.println("Mediation Decision: Emergency Brake Disabled.");
    }

    public void SystemAcceleratorDisabled(){
        System.out.println("Mediation Decision: Emergency Brake Enabled.");
    }

    public void SystemAcceleratorUsed(){
        emergencyBrake.Disable();
        while(currentSpeed < systemAccelerator.GetAcceleratorSpeed()){
            currentSpeed++;
            System.out.println("Mediation Event: Speed Changed to: " + currentSpeed + ".");

            if(currentSpeed <= 10){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.ONE);
            }
            else if(currentSpeed <= 20){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.TWO);
            }
            else if(currentSpeed <= 30){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.THREE);
            }
            else if(currentSpeed <= 40){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.FOUR);
            }
            else if(currentSpeed <= 50){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.FIVE);
            }
            else if(currentSpeed <= 60){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.SIX);
            }
            else if(currentSpeed <= 70){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.SEVEN);
            }
            else if(currentSpeed <= 80){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.EIGHT);
            }
            else if(currentSpeed <= 90){
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.NINE);
            }
            else {
                assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.TEN);
            }
        }
        emergencyBrake.Enable();
    }

    public void SetEmergencyBrakeEnabled(){
        System.out.println("Mediation Decision: System Accelerator Disbaled.");
    }

    public void SetEmergencyBrakeDisabled(){
        System.out.println("Mediation Decision: System Accelerator Enabled.");
    }

    public void SetEmergencyBrakeEngaged(){
        systemAccelerator.Disable();
        currentSpeed = 0;
    }

    public void SetEmergencyBrakeDisengaged(){
        assemblySystem.SetSystemSpeed(AssemblySystem.SystemSpeed.ZERO);
        currentSpeed = 0;
    }
    

}
