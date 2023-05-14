public class PrinterOnLine extends PrinterController{
    
    @Override
    public void PushPrint(Printer printJob){
        System.out.println("\nClearing buffer and shutting down...");
        printJob.SetPrinterState(new PrinterOffLine());
    }

}
