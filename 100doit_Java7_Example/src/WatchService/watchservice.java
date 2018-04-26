package WatchService;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.*;


/**
 * 파일명	 	: watch service
 * 설명		: Watch Service를 사용해서, 기록을 남기는 서비스 예제입니다. 서버에서 어떤 이벤트가 실행되는지 알아볼 때 사용할 수 있습니다.
 * @author 100doit
 *
 */

public class watchservice {
	private Path path = null;
	private WatchService watchService = null;

	private void init() {
		path = Paths.get("C:\\Temp");																	// 이 경로에 이벤트 생성, 수정 및 삭제
		try {
			watchService = FileSystems.getDefault().newWatchService();
			path.register(watchService, ENTRY_CREATE, ENTRY_DELETE,
					ENTRY_MODIFY);
		} catch (IOException e) {
			System.out.println("IOException "+ e.getMessage());
		}
	}
/**
 * The police will start making rounds 
 */
	private void doRounds() {
		WatchKey key = null;
		while(true) {
			try {
				key = watchService.take();																// watchKey를 받음
				for (WatchEvent<?> event : key.pollEvents()) {
					Kind<?> kind = event.kind();
					System.out.println("Event on " + event.context().toString() + " is " + kind);		//이벤트 기록 출력
				}
			} catch (InterruptedException e) {
				System.out.println("InterruptedException: "+e.getMessage());
			}
			boolean reset = key.reset();
			if(!reset)
				break;
		}
	}

	public static void main(String[] args) {
		watchservice police = new watchservice();
		police.init();
		police.doRounds();
	}
}

