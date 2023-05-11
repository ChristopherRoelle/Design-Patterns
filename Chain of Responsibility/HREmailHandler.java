public class HREmailHandler extends MainEmailHandler{
    
    protected String[] AssignedKeyWords(){
        //setup keywords for the receiver team
        return new String[] {"career", "job", "faculty"};
    }

    @Override
    protected String[] keyWords(){
        return new String[0];
    }

    protected void ProcessEmailFinal(String emailString){
        System.out.println("The Human Resources Team processed the email.");
    }

    @Override
    public void SetNextEmailHandler(UniversityEmailHandler emailHandler){
        
    }

}