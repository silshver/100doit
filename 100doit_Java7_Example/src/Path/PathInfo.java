package Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("c:/Temp/temp");
		System.out.println("Number of Nodes:" + path.getNameCount());
		// Number of Nodes:2
		System.out.println("File Name:" + path.getFileName());
		// File Name:temp.txt
		System.out.println("File Root:" + path.getRoot());
		// File Root:c:
		System.out.println("File Parent:" + path.getParent());
		// File Parent:c:Temp
	}
}
