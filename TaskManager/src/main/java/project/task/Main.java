package project.task;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TaskManager taskManager = new TaskManager();
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		 AutoSave autoSave = new AutoSave(taskManager);
	     Thread autoSaveThread = new Thread(autoSave);
	     autoSaveThread.start();
		
		while(running) {
			System.out.println("1. Criar nova tarefa");
			System.out.println("2. Listar tarefas");
			System.out.println("3. Atualizar tarefa");
			System.out.println("4. Excluir tarefa");
			System.out.println("5. Sair");
			System.out.println("Escolha uma opção");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				taskManager.CreateTask(scanner);
				break;
			case 2:
				taskManager.listTask(scanner);
				break;
			case 3:
				taskManager.updateTask(scanner);
				break;
			case 4:
				taskManager.deleteTask(scanner);
				break;
			case 5:
				running = false;
				break;
			case 6:
				System.out.println("Opção invalida.");
				System.out.println("-------------------------------------------------------------");
				break;
			}
		}
		
	}
}
