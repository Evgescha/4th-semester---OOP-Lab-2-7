package Laba7;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchPotoc implements Runnable {
	String FileName;
	String StringSearch;
	int LineCount;
	
	SearchPotoc(String str, String file) {
		StringSearch = str;
		FileName = file;
		LineCount = 1;		
	}

	@Override
	public void run() {
		FileReader fr;
		try {
			fr = new FileReader(FileName);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			
			while((line = br.readLine())!=null) {
				if(line.contains(StringSearch))
					System.out.println("Файл " +FileName+ ",строка: " + LineCount + ", точка вхождения " +line.indexOf(StringSearch));
			LineCount++;
			}
			br.close();
		} catch (Exception e) {
			
			System.out.println("FATAL ERORR при работе с файлом: "+ FileName);
		}
	}
	
}
