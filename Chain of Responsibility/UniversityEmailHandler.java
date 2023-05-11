public interface UniversityEmailHandler {

    public void SetNextEmailHandler(UniversityEmailHandler emailHandler);

    public void ProcessEmailHandler(String emailString);
    
}