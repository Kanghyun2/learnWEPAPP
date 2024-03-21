package app09;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 2, initParams = 
{@WebInitParam(name = "paramName", value = "paramValue")
	, @WebInitParam(name ="na1", value = "va1")
	})
public class TestInitAnno extends HttpServlet {
	
	
}
