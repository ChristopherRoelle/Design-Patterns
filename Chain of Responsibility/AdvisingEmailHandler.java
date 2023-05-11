public class AdvisingEmailHandler extends MainEmailHandler{
    
    protected String[] keyWords(){
        //setup keywords for the receiver team
        return new String[] {"advising", "schedule", "course"};
    }

    protected void ProcessEmailFinal(String emailString){
        System.out.println("The Advising Team processed the email.");
    }

    @Override
    public void SetNextEmailHandler(UniversityEmailHandler emailHandler){
        
    }

}