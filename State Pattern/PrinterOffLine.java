public class PrinterOffLine extends PrinterController {

    @Override
    public void PushPrint(Printer printJob){
        System.out.println("\nPowering printer on, please wait...");
        printJob.SetPrinterState(new PrinterOnLine());
    }
    
}
