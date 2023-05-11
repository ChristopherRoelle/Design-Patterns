public abstract class MainEmailHandler implements UniversityEmailHandler {

    private UniversityEmailHandler theNextHandlerInTheChain;

    public void SetNextEmailHandler(UniversityEmailHandler emailHandler){
        theNextHandlerInTheChain = emailHandler;
    }

    public void ProcessEmailHandler(String emailString){
        
        //Starting Value
        boolean keyWordFound = false;

        //Check for a matching keyword in emailString
        if(keyWords().length == 0)
        {
            keyWordFound = true;
        } 
        else 
        {
            for (String oneKeyWord : keyWords()){
                if(emailString.indexOf(oneKeyWord) >= 0){
                    keyWordFound = true; //Change value if match is found
                    break; //leave the loop
                }
            }
        }

        if(keyWordFound)
        {
            ProcessEmailHandler(emailString);
        }
        else
        {
            //pass along the chain if the email is not processed
            //by the current email handler
            theNextHandlerInTheChain.ProcessEmailHandler(emailString);
        }
    }
    
    public static void HandleEmail(String emailString){
        UniversityEmailHandler academic = new AcademicEmailHandler();
        UniversityEmailHandler alumni = new AlumniEmailHandler();
        UniversityEmailHandler advising = new AdvisingEmailHandler();
        UniversityEmailHandler finance = new FinanceEmailHandler();
        UniversityEmailHandler hr = new HREmailHandler();
        UniversityEmailHandler admin = new AdminEmailHandler();

        //Setup Chain Direction
        academic.SetNextEmailHandler(alumni);
        alumni.SetNextEmailHandler(advising);
        advising.SetNextEmailHandler(finance);
        finance.SetNextEmailHandler(hr);
        hr.SetNextEmailHandler(admin);
        //We do not need to set the next email handler after admin
        //because it is the end of the chain of responsibility

        //this line will start the chain
        academic.ProcessEmailHandler(emailString);
    }

    protected abstract String[] keyWords();
    protected abstract void ProcessEmailFinal(String emailString);

    
}
