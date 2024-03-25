package app12.person;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.json.JsonMapper;

import static app12.ServletUtil.*;

@WebServlet(name = "PersonAPIServlet"
		, urlPatterns = "/api/person")
public class PeronAPIServlet extends HttpServlet {
	private PersonService service = new PersonService();
	private JsonMapper mapper = new JsonMapper();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Person> list = service.getAll();
		String json = mapper.writeValueAsString(list);
		
		resp.setContentType("application/json; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		writer.println(json);
		writer.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String body = readBody(req);
		
		Person p = mapper.readValue(body, Person.class);
		
		int result = service.insert(p);
		
		if (result == 1) {
			resp.setStatus(201);
		}
	}
}









