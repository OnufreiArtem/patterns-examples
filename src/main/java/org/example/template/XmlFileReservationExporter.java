package org.example.template;

import java.io.FileWriter;

public class XmlFileReservationExporter extends XmlReservationExporter {

	@Override
	public void output(String content) {
		try {
			FileWriter fw = new FileWriter("output.xml");
			fw.write(content);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

