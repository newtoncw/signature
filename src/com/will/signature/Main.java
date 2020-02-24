package com.will.signature;

import java.awt.FontFormatException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, FontFormatException, URISyntaxException {
		byte[] b = Signature.getSignature("Nome Teste", Signature.SignFont.SCRIPTINA);
		
		FileOutputStream file = new FileOutputStream("sign.png");
		file.write(b);
		file.flush();
		file.close();
		
		System.out.println("OK");
	}

}
