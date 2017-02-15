package f.niosecond;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PathsAndFiles {
	public static void main(String args[]) {
		PathsAndFiles sample = new PathsAndFiles();
		String dir = "C:\\basicjava\\nio\\nio2";
		sample.checkPath(dir);
		// String dir2 = "C:\\WINDOWS";
		// sample.checkPath2(dir, dir2);
		// String fileName="AboutThisBook.txt";
		// sample.writeAndRead(fileName);

	}

	public void checkPath(String dir) {
		Path path = Paths.get(dir);
		System.out.println(path.toString());
		System.out.println("getFileName():" + path.getFileName());
		System.out.println("getNameCount():" + path.getNameCount());
		System.out.println("getParent():" + path.getParent());
		System.out.println("getRoot():" + path.getRoot());
	}

	public void checkPath2(String dir1, String dir2) {
		Path path = Paths.get(dir1);
		Path path2 = Paths.get(dir2);
		Path relativized = path.relativize(path2);
		System.out.println("relativized path=" + relativized);
		Path absolute = relativized.toAbsolutePath();
		System.out.println("toAbsolutePath path=" + absolute);
		Path normalized = absolute.normalize();
		System.out.println("normalized path=" + normalized);

		Path resolved = path.resolve("basicjava");
		System.out.println("resolved path=" + resolved);
	}

	public ArrayList<String> getContents() {
		ArrayList<String> contents = new ArrayList<String>();
		contents.add("�� å�� ������ 5��° å�Դϴ�.");
		contents.add("������ ���Ⱓ�� �ڹ� ������ �������� ���ʵǾ����ϴ�.");
		contents.add("���� �е鿡�� ������ �Ǹ� ���ڽ��ϴ�.");
		contents.add("å�� ���� ������ javatuning@gmail.com ���� ���� �ֽñ� �ٶ��ϴ�.");
		contents.add("Current Date=" + new Date());
		return contents;
	}

	public Path writeFile(Path path) throws Exception {
		Charset charset = Charset.forName("EUC-KR");
		ArrayList<String> contents = getContents();
		StandardOpenOption openOption = StandardOpenOption.CREATE;
		return Files.write(path, contents, charset, openOption);
	}

	public void readFile(Path path) throws Exception {
		Charset charset = Charset.forName("EUC-KR");
		System.out.println("Path=" + path);
		List<String> fileContents = Files.readAllLines(path, charset);
		for (String tempContents : fileContents) {
			System.out.println(tempContents);
		}
		System.out.println();
	}

	public Path writeAndRead(String fileName) {
		Path returnPath = null;
		try {
			Path path = Paths.get(fileName);
			// Write a text file
			returnPath = writeFile(path);
			// Read written file
			System.out.println("***** Created file contents *****");
			readFile(returnPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnPath;
	}

	public void copyMoveDelete(Path fromPath, String fileName) {
		try {
			Path toPath = fromPath.toAbsolutePath().getParent();

			// Make a directory if it is not exist.
			Path copyPath = toPath.resolve("copied");
			if (!Files.exists(copyPath)) {
				Files.createDirectories(copyPath);
			}
			// Copy file
			Path copiedFilePath = copyPath.resolve(fileName);
			StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
			Files.copy(fromPath, copiedFilePath, copyOption);

			// Read copied file
			System.out.println("***** Copied file contents *****");
			readFile(copiedFilePath);

			// Move file
			Path movedFilePath = Files.move(copiedFilePath, copyPath.resolve("moved.txt"), copyOption);

			// Delete files
			Files.delete(movedFilePath);
			Files.delete(copyPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
