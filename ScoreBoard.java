/**
 * represents a football scoreboard
 * 
 * @author jim
 */
public class ScoreBoard {
    private TeamScore home;
    private TeamScore away;
    private int minutesPlayed;
    
    /**
     * constructor for objects of type ScoreBoard
     */
    public ScoreBoard()
    {
        minutesPlayed = 0;
        home = new TeamScore("HOME");
        away = new TeamScore("AWAY");
    }
   
        
    /**
     * set the home team score
     * 
     * @param home  the home team score
     */
    public void setHome(TeamScore home) {
        this.home = home;
    }

    /**
     * set the away team score
     * 
     * @param away  the away team score
     */
    public void setAway(TeamScore away) {
        this.away = away;
    }
   

    /**
     * returns the number of minutes played
     * 
     * @return the number of minutes played
     */
    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    /**
     * sets the number of minutes played
     * 
     * @param minutesPlayed the number of minutes played
     */
    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }
    
    public void goalScored(String c){
    
        if("h".equals(c)){
            home.updateScore();
            
        }else if("a".equals(c)){
            away.updateScore();
           
        }
        
    }
    
    public void display(){
    System.out.format( minutesPlayed
    + "minutes played" + "\n" + "HOME" + 
    home.getScore() + ":" + away.getScore()  +  "AWAY");
    }
    
    public void setUpGame(String homeTeam, String awayTeam ){
    minutesPlayed = 0;
    home.setTeamName("homeTeam");
    home.resetScore();
    away.setTeamName("awayTeam");
    away.resetScore();
    
 
    }
    
    
  
}