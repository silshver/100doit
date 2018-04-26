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
 * ���ϸ�	 	: watch service
 * ����		: Watch Service�� ����ؼ�, ����� ����� ���� �����Դϴ�. �������� � �̺�Ʈ�� ����Ǵ��� �˾ƺ� �� ����� �� �ֽ��ϴ�.
 * @author 100doit
 *
 */

public class watchservice {
	private Path path = null;
	private WatchService watchService = null;

	private void init() {
		path = Paths.get("C:\\Temp");																	// �� ��ο� �̺�Ʈ ����, ���� �� ����
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
				key = watchService.take();																// watchKey�� ����
				for (WatchEvent<?> event : key.pollEvents()) {
					Kind<?> kind = event.kind();
					System.out.println("Event on " + event.context().toString() + " is " + kind);		//�̺�Ʈ ��� ���
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

