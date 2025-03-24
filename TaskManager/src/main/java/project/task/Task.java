package project.task;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
	
	public String toCsvString() {
        return id + ";" +
               title + ";" +
               description + ";" +
               createdAt + ";" +
               updatedAt + ";" +
               dueDate;
    }
	
	public void fromCsvString(String csvString) {
	    
	    String[] fields = csvString.split(";");

	    
	    if (fields.length != 6) {
	        throw new IllegalArgumentException("O formato da string CSV é inválido.");
	    }

	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	    
	    this.id = Integer.parseInt(fields[0]);
	    this.title = fields[1];
	    this.description = fields[2];

	   
	    this.createdAt = validateAndParseDate(fields[3]);
	    this.updatedAt = validateAndParseDate(fields[4]);
	    this.dueDate = validateAndParseDate(fields[5]);
	}

	
	private LocalDateTime validateAndParseDate(String dateStr) {
	    try {
	        if (dateStr != null && !dateStr.isBlank()) {  
	            return LocalDateTime.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	        }
	    } catch (DateTimeParseException e) {
	        System.err.println("Data inválida: " + dateStr);
	    }
	    
	    return LocalDateTime.of(1, 1, 1, 0, 0);
	}

	  
	
}
