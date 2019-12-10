/*
 * Copyright (c) 2019 Componize Software
 */
package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nadhem Jemmali
 */
@CrossOrigin(origins = "*")
@RestController
public class LoginController {



/*	@PostMapping(value = "hi")
	public String postHi(@RequestHeader HttpHeaders headers) throws IOException
	{
		String outputFile = "output";

		// try (InputStream inputStream = request.getInputStream();
		// OutputStream outputStream = new FileOutputStream(outputFile);)
		// {
		// int byteRead;
		// while ((byteRead = inputStream.read()) != -1)
		// {
		// outputStream.write(byteRead);
		// }
		// }
		// catch (IOException ex)
		// {
		// throw ex;
		// }

		return headers.get("Content-Length").toString();
	}*/

}
