package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.FilmeService;
import service.FilmeTO;

public class BuscarFilmesIdioma implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FilmeService ls = new FilmeService();
		String sIdioma = request.getParameter("idioma");
		int iIdioma = Integer.parseInt(sIdioma);
		ArrayList<FilmeTO> filmes = ls.BuscarIdioma(iIdioma);
		
		//enviar para o jsp
		request.setAttribute("filmes", filmes.toArray());
		RequestDispatcher view = 
		request.getRequestDispatcher("ListarFilmes.jsp");
		view.forward(request, response);

	}

}
