package example7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FriendFileOperations extends Thread {

	private String name;
	private List<String> friendsList;
	private BufferedReader bufferedReader;
	private BufferedWriter bufferedWriter;

	public FriendFileOperations(String name, String filename, BufferedWriter bufferedWriter)
			throws FileNotFoundException {
		friendsList = new ArrayList<String>();
		this.name = name;
		bufferedReader = new BufferedReader(new FileReader(filename));
		this.bufferedWriter = bufferedWriter;
	}

	public void run() {
		try {
			read();
			write();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void read() throws IOException {
		String friendName;
		while ((friendName = bufferedReader.readLine()) != null) {
			friendsList.add(friendName);
		}
	}

	public synchronized void write() throws IOException {
		bufferedWriter.write(name);
		bufferedWriter.newLine();
		for (String name : friendsList) {
			bufferedWriter.write(name);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
	}

}
