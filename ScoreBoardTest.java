
/**
 * Write a description of class ScoreBoardTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScoreBoardTest
{
    // instance variables - replace the example below with your own
   ScoreBoard scoreboard;

    /**
     * Constructor for objects of class ScoreBoardTest
     */
    public ScoreBoardTest()
    {
       scoreboard = new ScoreBoard();  
    }
    
    public void testConstructor(){
    scoreboard.display();
    }
     
    public void testUpdate(){
    scoreboard.setUpGame("home", "away");
    scoreboard.goalScored("h");
    scoreboard.setMinutesPlayed(45);
    scoreboard.display();
    }
    
}
