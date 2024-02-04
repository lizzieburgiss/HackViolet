import java.util.Set;
import java.util.HashSet;

public class MatchmakerMain {


        public static void main(String[] args){

            // Database of users and skills

            HashSet<String> skills1 = new HashSet<>(Set.of("Data Analysis", "Intermediate Java", "Microsoft Excel"));

            HashSet<String> skills2 = new HashSet<>(Set.of("Marketing", "Intermediate python", "Data Analysis"));

            HashSet<String> skills3 = new HashSet<>(Set.of("Image Editing", "Research Experience", "Intermediate Java"));


            User Julian = new User("Julian Grijalva", "Virginia Tech","Computer Science", 2026, skills1);

            User Lizzie = new User("Lizzie Burgis", "Virginia Tech", "Marketing", 2025,skills2);

            User Katherine = new User("Katherine Castagnola", "Virginia Tech", "Computer Science", 2027,skills3);

            //Current Tasks in Database
            
            HashSet<String> JulianSeekingSkills1 = new HashSet<>(Set.of("Data Analysis", "Intermediate Java", "Microsoft Excel"));

            HashSet<String> LizzieSeekingSkills1 = new HashSet<>(Set.of("Marketing", "Intermediate python", "Data Analysis"));

            HashSet<String> KatherineSeekingSkills1 = new HashSet<>(Set.of("Image Editing", "Research Experience", "Intermediate Java"));

            HashSet<Integer> JulianSchedule = new HashSet<>(Set.of(20,21,22));

            HashSet<Integer> LizzieSchedule = new HashSet<>(Set.of(22,23,24));

            HashSet<Integer> KatherineSchedule = new HashSet<>(Set.of(20,21,22));

            MatchTask JulianTask1 = new MatchTask(2, 6, JulianSchedule, JulianSeekingSkills1, "Personal Project", Julian, false);

            MatchTask LizzieTask1 = new MatchTask(2, 6, LizzieSchedule, LizzieSeekingSkills1, "Personal Project", Lizzie, false);

            MatchTask KatherineTask1 = new MatchTask(2, 6, KatherineSchedule, KatherineSeekingSkills1, "Studying", Katherine, false);

            // NEW USER CREATION

            System.out.println("Creating new User:");
            System.out.println("Name: Violet, College: Virginia Tech, Major: Computer Science, Year: 2027, Skills: Intermediate Java, Data Analys, Microsoft Excel, Marketing");

            HashSet<String> skills4 = new HashSet<>(Set.of("Data Analysis", "Intermediate Java", "Microsoft Excel", "Marketing"));

            User Violet = new User("Violet","Virginia Tech","Computer Science",2028,skills4);

            System.out.println("Creating new Task:");
            System.out.println("Date: February 6, 4:00pm to 5:30pm, Personal Project, Seeking skills: Data Analysis Intermediate Java Microsoft Excel Marketing");

            MatchTask VioletTask = new MatchTask(2, 6, JulianSchedule, skills4, "Personal Project", Violet, true);

            System.out.println("Checking Compatibility of new Task with Database:");

            MatchingAlgorithm test1 = new MatchingAlgorithm(VioletTask,JulianTask1);
            System.out.println(test1.ToString());
            MatchingAlgorithm backtest1 = new MatchingAlgorithm(JulianTask1, VioletTask);
            System.out.println(backtest1.ToString());

            MatchingAlgorithm test2 = new MatchingAlgorithm(VioletTask,LizzieTask1);
            System.out.println(test2.ToString());
            MatchingAlgorithm backtest2 = new MatchingAlgorithm(LizzieTask1, VioletTask);
            System.out.println(backtest2.ToString());

            MatchingAlgorithm test3 = new MatchingAlgorithm(VioletTask,KatherineTask1);
            System.out.println(test3.ToString());
            MatchingAlgorithm backtest3 = new MatchingAlgorithm(KatherineTask1, VioletTask);
            System.out.println(backtest3.ToString());


        }
}
