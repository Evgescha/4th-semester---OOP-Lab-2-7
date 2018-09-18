package Laba7;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchSchetWord  implements Runnable {
	String FileName;
		
	SearchSchetWord(String file) {
		FileName = file;			
	}

	@Override
	public void run() {
		FileReader fr;
		try {
			fr = new FileReader(FileName);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			
			while((line = br.readLine())!=null) {
			for(String words:line.split(" "))
				if(words.length()%2==0)
			System.out.println("Ôאיכ " +FileName+ ", קועםמו סכמגמ: " +words);
			
			}
			br.close();
		} catch (Exception e) {
			
			System.out.println("FATAL ERORR ןנט נאבמעו ס פאיכמל: "+ FileName);
		}
	}
	
}
