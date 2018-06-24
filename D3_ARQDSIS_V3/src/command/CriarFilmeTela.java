package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IdiomaDAO;
import service.IdiomaTO;

public class CriarFilmeTela implements Command {

	@Override
	public void executar(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
			
			
		//instanciar o service
		IdiomaDAO ls = new IdiomaDAO();
		ArrayList<IdiomaTO> idiomas = ls.listar();
		
		//enviar para o jsp
		request.setAttribute("idiomas", idiomas);
		RequestDispatcher view = 
		request.getRequestDispatcher("CriarFilme.jsp");
		view.forward(request, response);
			
	}

}
