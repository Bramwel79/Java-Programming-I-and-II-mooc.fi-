import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList(){
        tasks = new ArrayList<>();
    }

    public void add(String task){
        tasks.add(task);
    }

    public void print(){
        if(!(tasks.isEmpty())){
            for(int x = 0; x < tasks.size();++x){
                System.out.println((x + 1) + ": " + tasks.get(x));
            }
        }
        
    }

    public void remove(int number){
        tasks.remove(number-1);

    }
    
}
