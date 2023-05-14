public class Driver {

    public static void main(String[] args){
        
        PrinterOffLine initialPrinterState = new PrinterOffLine();
        Printer printer = new Printer(initialPrinterState);

        System.out.println("\n");

        printer.PushPrint();
        printer.PushPrint();
        printer.PushPrint();

        System.out.println("\n\n");

    }
    
}
