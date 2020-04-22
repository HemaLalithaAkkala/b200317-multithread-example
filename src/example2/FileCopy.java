package example2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy implements Runnable {

	private String source;
	private String destination;

	public FileCopy(String source, String destination) {
		this.source = source;
		this.destination = destination;
	}

	public void run() {
		perform();
	}

	public void perform() {

		System.out.println("executed");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination));) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
