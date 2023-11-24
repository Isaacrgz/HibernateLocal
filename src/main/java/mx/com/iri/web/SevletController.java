package mx.com.iri.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;
import mx.com.iri.domain.Person;
import mx.com.iri.service.PeopleService;

@WebServlet("/SevletController")
public class SevletController extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        PeopleService peopleService = new PeopleService();
        
        List<Person> people = peopleService.listaPeople();
        
        request.setAttribute("people", people);
        
        try {
            request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
