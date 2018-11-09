import java.util.ArrayList;
import java.util.List;
public class TodoListItem {
	private String item;
	private int priority;
	int thing = 0;
	

	public TodoListItem(String item, int priority) {
		List toDoList = new ArrayList<TodoListItem>();
	}

	public String getDescription() {
		this.item = "Walk the dog";
		toDoList.add(item);
		return this.item;
	}

	public int getPriority() {
		this.priority = 3;
		return this.priority;
	}

	public boolean isDone() {
		if (thing == 1) {
			return true;
		}else {
			return false;
		}
	}

	public void markDone() {
		thing = 1;
		
	}

}
