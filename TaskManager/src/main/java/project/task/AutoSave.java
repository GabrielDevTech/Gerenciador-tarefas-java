package project.task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AutoSave implements Runnable {

	TaskManager taskManager;
	boolean autoSave = true;
	
	public AutoSave(TaskManager taskManager) {
		this.taskManager = taskManager;
	}
	
	@Override
	public void run() {
		
		while(autoSave) {
			try{
				saveTasksToFile();
				Thread.sleep(10000);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	private void saveTasksToFile() {
        List<Task> tasks = taskManager.getListTask(); // Supondo que TaskManager tenha um método getTasks()
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.txt"))) {
        	writer.write(String.valueOf(taskManager.getIdCounter()));
        	writer.newLine();
        	for (Task task : tasks) {
                writer.write(task.toCsvString());
                writer.newLine();
            System.out.println("dfgdfgdfg");
            }
            //System.out.println("Lista salva com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar as tarefas: " + e.getMessage());
        }
    }
 
}
