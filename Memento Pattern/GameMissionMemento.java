public class GameMissionMemento {
    
    //class variables
    private GameMission gameMission;
    private int copyOfCurrentCompletionProgress;
    private int copyOfPreviousCompletionProgress;

    //constructor
    public GameMissionMemento(GameMission gameMission){
        this.gameMission = gameMission;
        copyOfCurrentCompletionProgress = gameMission.GetPercentageCompleted();
        copyOfPreviousCompletionProgress = gameMission.previousPercentageCompleted;
    }

    public void ResetMissionStatus(){
        gameMission.SetPercentageCompleted(copyOfCurrentCompletionProgress);
        gameMission.previousPercentageCompleted = copyOfPreviousCompletionProgress;
    }

}
