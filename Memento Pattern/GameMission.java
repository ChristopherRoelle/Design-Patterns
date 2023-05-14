public class GameMission {
    
    //Class variables
    private int percentageCompleted;
    int previousPercentageCompleted;

    //constructor
    public GameMission(){
        percentageCompleted = 0;
        previousPercentageCompleted = 0;
    }

    //mutator
    public void SetPercentageCompleted(int percentage){

        previousPercentageCompleted = percentageCompleted;
        percentageCompleted = percentage;
    }

    //accessor
    public int GetPercentageCompleted(){
        return percentageCompleted;
    }

}
