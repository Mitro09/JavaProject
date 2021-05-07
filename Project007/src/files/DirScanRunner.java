package files;

import java.io.File;

public class DirScanRunner {

	public static void main(String[] args) {

		File[] files = new File("./src/files").listFiles();
		
		for(File file : files) {
			
			System.out.println(file);
		}
		
		
	}

}
