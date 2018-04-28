package it.dan;

import java.io.File;

import it.dan.model.Item;
import it.dan.service.ItemFileManager;

public class AppRunner {

	public static void main(String[] args) {

		// String appDir = "C:\\temp"
		// System.getProperty("user.dir");

		String sep = System.getProperty("file.separator");

		String filePath = "C:" + sep + "temp" + sep + "test.txt";

		String fileSource = "C:" + sep + "temp" + sep + "pic.jpg";

		Item item = new Item("artid1", "MyFavorite item", 3000, new File(fileSource));

		// ItemFileManager itemFileManager = new ItemFileManager();
		ItemFileManager.saveItemToFile(item, filePath);
	}
}
