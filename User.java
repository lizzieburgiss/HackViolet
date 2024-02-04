import java.util.HashSet;

public class User {
    private String name;
    private String college;
    private String major;
    private int year;
    private HashSet<String> skills;

    public User (String name,String college,String major,int year,HashSet<String> skills){
        this.name = name;
        this.college = college;
        this.major = major;
        this.year = year;
        this.skills = skills;

    }

    public HashSet<String> getskills(){
        return this.skills;
    }
    public String getName() {
        return name;
    }
    public String getCollege() {
        return college;
    }
    public String getMajor() {
        return major;
    }
    public int getYear() {
        return year;
    }
    public HashSet<String> getSkills() {
        return skills;
    }

}
