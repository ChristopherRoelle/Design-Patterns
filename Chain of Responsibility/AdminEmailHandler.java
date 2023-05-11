public class AdminEmailHandler extends MainEmailHandler{
    
    protected String[] keyWords(){
        //Doesnt matter what the keywords are
        return new String[0];
    }

    protected void ProcessEmailFinal(String emailString){
        System.out.println("The Admin Team processed the email.");
    }

    @Override
    public void SetNextEmailHandler(UniversityEmailHandler emailHandler){
        
    }

}