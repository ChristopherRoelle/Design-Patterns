public class AcademicEmailHandler extends MainEmailHandler{
    
    protected String[] keyWords(){
        //setup keywords for the receiver team
        return new String[] {"academic"};
    }

    protected void ProcessEmailFinal(String emailString){
        System.out.println("The Academic Team processed the email.");
    }

    @Override
    public void SetNextEmailHandler(UniversityEmailHandler emailHandler){
        
    }

}
