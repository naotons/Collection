package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Chapter5 {

	public static void main(String[] args) {
		// タスクを生成してリストに格納し、日付順に並び替えて表示してください。
        System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊List＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        // タスクリストを作成
        List<Task> tasks = new ArrayList<>();
        
        //情報追加
        tasks.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。"));
        tasks.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談。"));
        tasks.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。"));
        tasks.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。"));
        tasks.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。"));

       //日付をキーにして、ソートを行う
        //メソッド参照 
        tasks.sort(Comparator.comparing(Task::getDate));
        //sortメソッド ラムダ式を使って、リスト内のすべてのTaskオブジェクトを順番に比較し、どの要素が前に来るべきかを判断
       // tasks.sort((t1, t2) -> t1.getDate().compareTo(t2.getDate()));
        // ソートされたタスクを出力 TaskのtoStringをオーバーライドして書式を変更する
        //メソッド参照
        tasks.forEach(System.out::println);
        //ラムダ式
        //tasks.forEach(task -> System.out.println(task));
        // 通常のforループ
        //for (Task task : tasks) {
        //    System.out.println(task);
       // }
        
        System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊Map＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        // 日付をキーにしてタスクを格納するTreeMapを作成 日付自動ソート
        Map<LocalDate, String> tasksMap = new TreeMap<LocalDate, String>();
        // 情報追加
        tasksMap.put(LocalDate.of(2021, 10, 21), "牛乳を買う。");
        tasksMap.put(LocalDate.of(2021, 9, 15), "○○社面談。");
        tasksMap.put(LocalDate.of(2021, 12, 4), "手帳を買う。");
        tasksMap.put(LocalDate.of(2021, 8, 10), "散髪に行く。");
        tasksMap.put(LocalDate.of(2021, 11, 9), "スクールの課題を解く。");
        
	     //Map内のすべてのエントリを繰り返し処理
        tasksMap.forEach((key, value) -> System.out.println(key + ": " + value));
        
        //for (Map.Entry<LocalDate, String> entry : tasksMap.entrySet()) {
        //    System.out.println(entry.getKey() + ": " + entry.getValue());
       // }
	        
	}
}
