import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
    public static void main(String [] args){
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("=====To Do App=====");
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View task");
            System.out.println("4. Exit");
            System.out.println("Choose an option");
            int chsOpt = sc.nextInt();

            if(chsOpt == 1){
                sc.nextLine();
                System.out.println("Enter the task name to add : ");
                String taskName = sc.nextLine();
                tasks.add(taskName);1
                System.out.println("Task added successfully....");
            }
            else if(chsOpt == 2){
                sc.nextLine();
                System.out.println("Enter the task name to delete : ");
                String taskName = sc.nextLine();
                tasks.remove(taskName);
                System.out.println("Task deleted successfully....");
            }
            else if(chsOpt == 3){
                if(tasks.isEmpty()){
                    System.out.println("No tasks yet!");
                }
                else{
                    for(int i = 0; i<tasks.size(); i++){
                        System.out.println(i+1 + ". " + tasks.get(i));
                    }
                }
            }
            else if(chsOpt == 4){
                System.out.println("GoodBye (' ') ");
                break;
            }

            else{
                System.out.println("Invalid option...");
            }
        }
    }
}
