public class AlumniEmailHandler extends MainEmailHandler{
    
    protected String[] keyWords(){
        //setup keywords for the receiver team
        return new String[] {"alumni", "transcript"};
    }

    protected void ProcessEmailFinal(String emailString){
        System.out.println("The Alumni Team processed the email.");
    }

    @Override
    public void SetNextEmailHandler(UniversityEmailHandler emailHandler){
        
    }

}