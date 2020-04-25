package example7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {

		try {

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:/iodemo/outputfile.txt"));

			FriendFileOperations schoolFriendsFileOperation = new FriendFileOperations("SCHOOL",
					"E:/iodemo/schoolfriends.txt", bufferedWriter);

			schoolFriendsFileOperation.setName("school friends");

			FriendFileOperations collegeFriendsFileOperation = new FriendFileOperations("COLLEGE",
					"E:/iodemo/collegefriends.txt", bufferedWriter);

			collegeFriendsFileOperation.setName("college friends");

			schoolFriendsFileOperation.start();
			collegeFriendsFileOperation.start();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
