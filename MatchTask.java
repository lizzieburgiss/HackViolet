import java.util.HashSet;
import User;

public class MatchTask {
    private int month;
    private int date;
    private HashSet<Integer> time;
    private HashSet<String> skills;
    private HashSet<String> major;
    private String Category;
    private User Attendee;
}

    public MatchTask (int month, int date, HashSet<Integer> time, HashSet<String> skills, HashSet<String> major; String Category, User attendee){
        this.month = month;
        this.date = date;
        this.time = time;
        this.skills = skills;
        this.major = major;
        this.Category = Category;
        Attendee = new Attendee();
        this.Attendee = attendee; 
    }

    
}
