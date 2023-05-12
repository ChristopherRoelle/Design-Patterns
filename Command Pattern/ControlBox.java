public class ControlBox {

    //Class variables - Public / Final
    public static final int SLIDER_MIN = 0;
    public static final int SLIDER_MAX = 100;

    //Class variables - Private
    private boolean poweredOn;
    private int sliderValue;

    //Constructor - Default
    public ControlBox(){
        poweredOn = false;
        sliderValue = 0;
    }

    //Accessors
    public boolean HasPower(){
        return poweredOn;
    }

    public int GetSliderValue(){
        return sliderValue;
    }

    //Power-Related Methods
    public void PowerOn(){
        poweredOn = true;
    }

    public void PowerOff(){
        poweredOn = false;
    }

    //Slider-Related Methods
    public void SliderIncrease(){
        if(HasPower()){
            if(GetSliderValue() < SLIDER_MAX){
                sliderValue++;
                System.out.println(sliderValue); //Simulate digital display
            }
        }
    }

    public void SliderDecrease(){
        if(HasPower()){
            if(GetSliderValue() > SLIDER_MIN){
                sliderValue--;
                System.out.println(sliderValue);
            }
        }
    }

}