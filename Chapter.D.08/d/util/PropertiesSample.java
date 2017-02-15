package d.util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesSample {

	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
		sample.storeAndLoadd();
	}

	public void storeAndLoadd() {
		Properties prop = new Properties();
		try {
			prop.setProperty("Key1", "Key1-Value");
			String fileName = "C:\\basicjava\\test.properties";
			FileWriter writer = new FileWriter(new File(fileName));
			prop.store(writer, "Sample");
			writer.close();

			FileReader reader = new FileReader(new File(fileName));
			Properties loadProp = new Properties();
			loadProp.load(reader);
			reader.close();
			System.out.println(loadProp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
