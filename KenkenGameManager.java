import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class KenkenGameManager{

	public static void main(String[] args) {

		// Fichero del que queremos leer
		//System.out.println("args[0]: " + args[0] + " args[1]: " + args[1] + " args[2]: " + args[2]);
		
		String xml = "";
		if(args[0].equals("-L")) {
			loadGame(args[2]);
		} else if(args[0].equals("-l")) {
			listGames();
		}
		
	}

	public static void listGames() {
		File myDir = new File(".");
		String path = myDir.getPath();

		String files;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for(int i = 0; i< listOfFiles.length; i++) {
			if(listOfFiles[i].isFile()) {
				files = listOfFiles[i].getName();
				if(files.endsWith(".xml") || files.endsWith(".XML")) {
					System.out.print(files + " " + Math.ceil(listOfFiles[i].length()/1024) + "KB-");
				}
			}
		}
	}

	public static void loadGame(String name) {
		BufferedReader br = null;
	
		try {

			String sCurrentLine;

			br = new BufferedReader(new InputStreamReader(new FileInputStream(name),"UTF-8"));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
			
			
			//System.out.print("Content-type:text/html\n\n");
			//System.out.print("Access-Control-Allow-Origin: *\n\n");
			

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} 
		
	}

}
