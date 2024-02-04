

public class MatchingAlgorithm {

    private int positive = 0;
    private int negative = 0;

    private MatchTask task1;
    private MatchTask task2;

    /**
     * @param task1 task of first user used to evaluate second user.
     * @param task2 task of second user used to be evaluated by task1's parameters
     */
    public MatchingAlgorithm(MatchTask task1, MatchTask task2){
        this.task1 = task1;
        this.task2 = task2;
    }


    public double score(){

        for (String skill: task1.getSkills()){
            if (task2.getAttendee().getskills().contains(skill)){
                positive++;
            }
            else{
                negative++;
            }
        }

        double current = this.positive / (this.positive + this.negative);


        if (task1.getClassYearPreffered()){
            int yeardifference = Math.abs(task1.getAttendee().getYear() - task2.getAttendee().getYear());
            if (yeardifference <= 4){
                current = current * 0.6;
            }
            else if (yeardifference <= 3){
                current = current * 0.85;
            }
        }

        return current;

    }
    
    public String ToString(){
        return task2.getAttendee().getName() + "'s compatibility for " + task2.getAttendee().getName() + "'s project is " + score() + "%";
    }
}
