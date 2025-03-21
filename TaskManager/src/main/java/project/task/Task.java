package project.task;
import java.time.LocalDateTime;

public class Task {

	
	
	 private int id;
	
	 private String title;
	 private String description;
	 //private TaskStatus status;
	 private LocalDateTime createdAt;
	 private LocalDateTime updatedAt;
	 private LocalDateTime dueDate;
	 //private PriorityLevel priority;
	 
	 public Task() {
		 
	 }
	 
	 public Task(int id, String title, String description, LocalDateTime dueDate) {
			this.id = id;
			this.title = title;
			this.description = description;
			this.createdAt = LocalDateTime.now();
			this.updatedAt = LocalDateTime.now();
			this.dueDate = dueDate;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt() {
		this.updatedAt = LocalDateTime.now();
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	 
	  
	
}
