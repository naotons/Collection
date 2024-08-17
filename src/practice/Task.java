package practice;
import java.time.LocalDate;

public class Task {
	private LocalDate date;
	private String TaskDetail;
	
  //日付（LocalDate型）とタスク内容（String型）を持つTaskクラスを作成
	//コンストラクタ
	public Task(LocalDate date, String  TaskDetail) {
		this.date = date;
		this.TaskDetail = TaskDetail;
		
	}
    public LocalDate getDate() {
        return date;
    }
	
    @Override
    public String toString() {
        return date + ": " + TaskDetail;
   }
}
