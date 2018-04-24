package Path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 파일명	 	: Path
 * 설명		: Path를 사용하여 경로에 대해 간편하고 쉽게 관리할 수 있습니다. 주로, 서버를 관리하는 작업에서 많이 쓰입니다.
 * @author 100doit
 *
 */


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
