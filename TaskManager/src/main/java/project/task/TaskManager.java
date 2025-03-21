package project.task;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskManager {

	ArrayList<Task> listTask;
	int idCounter = 0;
	
	public TaskManager() {
		listTask = new ArrayList<Task>();
	}
	
	public void CreateTask(Scanner s) {
		Task task;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("----------------------------------------------------------\n");
		System.out.println("Criando tarefa\n");
		System.out.println("Digite o nome da task\n");
		String title = s.next();
		System.out.println("Digite a descrição da task\n");
		String description = s.next();
		idCounter++;
		int id = idCounter;
		System.out.println("digite a data de vencimento (dd/mm/yyyy):\n");
		String dueDateStr = s.next();
		LocalDate localDate = LocalDate.parse(dueDateStr, formatter);
		LocalDateTime dueDate = localDate.atStartOfDay();
		System.out.println("----------------------------------------------------------\n");
		task = new Task(id, title, description, dueDate);
		listTask.add(task);
		
	}
	
	public void listTask(Scanner s) {
		
		for(Task task: listTask) {
			System.out.println("----------------------------------------------------------\n");
			System.out.println("codigo:"+task.getId()+"\n");
			System.out.println("titúlo:"+task.getTitle()+"\n");
			System.out.println("descrição:"+task.getDescription()+"\n");
			System.out.println("data da criação:"+task.getCreatedAt()+"\n");
			System.out.println("data da atualização:"+task.getUpdatedAt()+"\n");
			System.out.println("data de vencimento:"+task.getDueDate()+"\n");
			System.out.println("----------------------------------------------------------\n");
		}
		System.out.println("Digite o nome da task\n");
	}

	public void updateTask(Scanner s) {
		System.out.println("----------------------------------------------------------\n");
		System.out.println("Criando tarefa\n");
		System.out.println("Digite o código da task: ");
		int id = s.nextInt();
		Task task = new Task();
		for (Task tk : listTask) {
            if (tk.getId() == id) { // Compara o ID atual com o ID desejado
                task=tk;
                break;// Retorna a tarefa encontrada
            }
        }
		boolean exit = false;
		while(!exit) {
			System.out.println("----------------------------------------------------------\n");
			System.out.println("Escolha oque deseja alterar da tarefa: "+task.getTitle()+" id:"+id);
			System.out.println("1. titúlo ");
			System.out.println("2. descriução");
			System.out.println("3. todos");
			System.out.println("4. sair\n");
			int choice = s.nextInt();
			switch(choice) {
			
				case 1:
					System.out.println("Digite o novo titulo:");
					task.setTitle(s.next());
					break;
				case 2:
					System.out.println("Digite a nova descrição:");
					task.setDescription(s.next());
					task.setUpdatedAt();
					break;
					
				case 3:
					System.out.println("Digite o novo titulo:");
					task.setTitle(s.next());
					System.out.println("Digite a nova descrição:");
					task.setDescription(s.next());
					task.setUpdatedAt();
					break;
				case 4:
					exit=true;
					break;
			}
		}
	}
	
	public void deleteTask(Scanner s) {
		System.out.println("----------------------------------------------------------\n");
		System.out.println("Deletando task\n");
		System.out.println("Digite o id da task\n");
		int id=s.nextInt(); 
		Task task = new Task();
		
		for (int i = 0; i < listTask.size(); i++) {
		    Task tk = listTask.get(i);
		    if (tk.getId() == id) { // Compara o ID atual com o ID desejado
		    	listTask.remove(i);
		    	System.out.println("----------------------------------------------------------\n");
		    	System.out.println("id: "+tk.getId()+"  Title: "+tk.getTitle()+" foi removido.\n");
		    	System.out.println("----------------------------------------------------------\n");
                break;// Retorna a tarefa encontrada
            }else if(i-1 == listTask.size()) {
            	System.out.println("----------------------------------------------------------\n");
		    	System.out.println("Id da task não encontrado");
		    	System.out.println("----------------------------------------------------------\n");
            }
		}
		
		
	}
	
	

}
