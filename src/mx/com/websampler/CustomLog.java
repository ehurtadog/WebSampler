package mx.com.websampler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CustomLog extends HttpServlet {
	private static final long serialVersionUID = 5281241782943599411L;
	
	private static final Logger LOGGER = LogManager.getLogger(CustomLog.class);
	private static int times = 1;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		LOGGER.debug("DEBUG MESSAGE");
		LOGGER.info("INFO MESSAGE");
		LOGGER.warn("WARN MESSAGE");
		LOGGER.error("ERRRO MESSAGE");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Logger servlet executed (" + times + ") times</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
