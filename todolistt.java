package todolist;
import java.util.*;
public class todolistt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String[] task=new String[50];
		boolean[] done=new boolean[50];
		int count=0,choice;
		do {
		System.out.println("To Do List");
		System.out.println("1.Add your task");
		System.out.println("2.View your task");
		System.out.println("3.Mark is as done");
		System.out.println("4.Delete your task");
		System.out.println("5.Exit");
		System.out.println("Enter your choice:");
		choice=scan.nextInt();
		scan.nextLine();
		switch(choice) {
		 case 1:
			 if(count<50) {
				 System.out.println("Enter your task:\n");
				 task[count]=scan.nextLine();
				 done[count]=false;
				 count=count+1;
				 System.out.println("Task added successfully");
			 }else {
				 System.out.println("LIst is full");
			 }
		     break;
		 case 2:
			 System.out.println("These are the tasks:");
			 for(int i=0;i<count;i++) {
				 System.out.println((i+1)+"."+task[i]);
				 if(done[i]==true) {
					 System.out.println("This task is marked as done");
				 }}
			 break;
		 case 3:
			 System.out.println("Mark your task as completed or done");
			 int m=scan.nextInt()-1;
			 if(m>=0) {
				 if(m<count) {
					 done[m]=true;
					 System.out.println("Task"+task[m]+" is marked as done");
				 }
				 else {
					 System.out.println("Invalid number");
				 }
			 }
			 else {
				System.out.println("Invalid");
			 }
			 break;
		 case 4:
			 System.out.println("Delete your task by entering number of it");
			 int d=scan.nextInt()-1;
			 if(d>=0) {
				 if(d<count) {
					 for(int i=d;i<count-1;i++) {
					 task[i]=task[i+1];
					 done[i]=done[i+1];
				     }
				 count=count-1;
				 System.out.println("Task deleted successfully");
			     }
			     else {
				 System.out.println("Invalid number");
			     }
			 }
		     else {
		    	 System.out.println("Invalid number");
		     }
			 break;
		 case 5:
			 System.out.println("Exist");
			 break;
	     default:
	    	     System.out.println("Invalid choice");
		}
		}while(choice!=5);
		scan.close();
	}

}
