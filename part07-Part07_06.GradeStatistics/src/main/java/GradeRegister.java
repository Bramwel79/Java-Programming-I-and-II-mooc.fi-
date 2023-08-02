import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }
    
    public double passingPercent(){
        double percent = 0.00;
        int x = 0;
 
        if(points.isEmpty()){
           return -1;
        }else{
         for(int p : points){
            if(p >= 50){
                x += 1;
            }
         }
        }
        percent =  (1.0 * x) / points.size() * 100;
 
        return percent;
    }
    public double averageOfPointsPassing(){
        double avg = 0.00;
        int total = 0;
        int x = 0;
 
        if(points.isEmpty()){
           return -1;
        }else{
         for(int p : points){
            if(p >= 50){
                total += p;
                x += 1;
            }
         }
        }
        avg = (1.0 * total) / x;
 
        return avg;
 
    }

    public double averageOfPoints(){
       double avg = 0.00;
       int total = 0;

       if(points.isEmpty()){
          return -1;
       }else{
        for(int p : points){
            total += p;
        }
       }
       avg = (1.0 * total) / points.size();

       return avg;

    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        double avg = 0.00;
        int total = 0;
        if(grades.isEmpty()){
            return -1;
        }else{
            for(int grade : grades){
                total += grade;
            }

        }
        avg = (1.0 * total) / grades.size();

        return avg;
    }
}
