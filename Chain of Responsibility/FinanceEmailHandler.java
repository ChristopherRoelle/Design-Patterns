public class FinanceEmailHandler extends MainEmailHandler{
    
    protected String[] keyWords(){
        //setup keywords for the receiver team
        return new String[] {"financial", "student aid", "tuition"};
    }

    protected void ProcessEmailFinal(String emailString){
        System.out.println("The Finance Team processed the email.");
    }

    @Override
    public void SetNextEmailHandler(UniversityEmailHandler emailHandler){
        
    }

}