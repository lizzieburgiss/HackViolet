import java.util.HashSet;


public class MatchTask {
    private int month;
    private int date;
    private HashSet<Integer> time;
    private HashSet<String> skills;
    private String Category;
    private User Attendee;
    private boolean ClassYearPreffered;


    /**
     * @param month int representation of month of task
     * @param date int representation of date of task
     * @param time int representation of date of task,
     * time is represented by 30 minute intervals starting with 0 for 6:00am
     * and ending with 32 for 10:00pm
     * @param skills Set of String containing skills required for task
     * @param Category String representation of Category
     * @param attendee User class for creator of task
     */
    public MatchTask (int month, int date, HashSet<Integer> time, HashSet<String> skills, String Category, User attendee, boolean ClassYearPreffered){
        this.month = month;
        this.date = date;
        this.time = time;
        this.skills = skills;
        this.Category = Category;
        this.Attendee = attendee;
        this.ClassYearPreffered = ClassYearPreffered; 
    }

    // returns int month

    public int getMonth() {
        return month;
    }

    // returns int date

    public int getDate() {
        return date;
    }

    // returns int time

    public HashSet<Integer> getTime() {
        return time;
    }

    // returns Set skills

    public HashSet<String> getSkills() {
        return skills;
    }

    // returns String of category

    public String getCategory() {
        return Category;
    }

    // return user class of Attendee

    public User getAttendee() {
        return Attendee;
    }

    // returns True if the user prefers working with someone in a similar class, false otherwise.
    
    public boolean getClassYearPreffered(){
        return ClassYearPreffered;
    }
}
