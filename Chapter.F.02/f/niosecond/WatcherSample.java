package f.niosecond;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class WatcherSample extends Thread {
	public static void main(String args[]) {
		String dirName = "C:\\basicjava";
		WatcherSample sample = new WatcherSample(dirName);
		sample.start();

		sample.fileWrite();
	}

	String dirName;

	public WatcherSample(String dirName) {
		this.dirName = dirName;
	}

	public void run() {
		System.out.println("### Watcher thread is started ### ");
		System.out.format("Dir=%s\n", dirName);
		addWatcher();
	}

	public void addWatcher() {
		try {
			Path dir = Paths.get(dirName);

			WatchService watcher = FileSystems.getDefault().newWatchService();
			WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

			for (int loop = 0; loop < 3; loop++) {
				key = watcher.take();
				List<WatchEvent<?>> eventList = key.pollEvents();
				for (WatchEvent<?> event : eventList) {
					Path name = (Path) event.context();
					if (event.kind() == ENTRY_CREATE) {
						System.out.format("%s created%n", name);
					} else if (event.kind() == ENTRY_DELETE) {
						System.out.format("%s deleted%n", name);
					} else if (event.kind() == ENTRY_MODIFY) {
						System.out.format("%s modified%n", name);
					}
				}
				key.reset();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fileWrite() {
		PathsAndFiles fileWriter = new PathsAndFiles();
		String fileName = "C:\\basicjava\\AboutThisBookWatch.txt";
		try {
			Path writeFile = Paths.get(fileName);
			for (int loop = 0; loop < 5; loop++) {
				Thread.sleep(2000);
				fileWriter.writeFile(writeFile);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
