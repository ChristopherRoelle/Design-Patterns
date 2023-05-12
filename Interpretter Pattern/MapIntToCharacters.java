public class MapIntToCharacters implements Expression {

    //Class variable
    private String tString;

    //Constructor
    public MapIntToCharacters(String tString){
        this.tString = tString;
    }

    @Override
    public void Interpret(Conversion originalContent){
        originalContent.ConvertToCharacters(tString);
    }
    
}
