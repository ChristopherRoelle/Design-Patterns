public class Printer {

    //class variables
    private PrinterController printerState;

    //constructor
    public Printer(PrinterController pState){
        this.printerState = pState;
    }

    //accessor
    public PrinterController GetPrinterState(){
        return printerState;
    }

    //mutator
    public void SetPrinterState(PrinterController pState){
        this.printerState = pState;
    }

    public void PushPrint(){
        printerState.PushPrint(this);
    }
    
}
