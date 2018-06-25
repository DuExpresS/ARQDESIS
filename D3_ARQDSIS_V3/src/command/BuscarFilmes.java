package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IdiomaDAO;
import service.FilmeService;
import service.FilmeTO;
import service.IdiomaTO;

public class BuscarFilmes implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//instanciar o service
				FilmeService ls = new FilmeService();
				ArrayList<FilmeTO> filmes = ls.BuscarTodos();
				
				IdiomaDAO ldao = new IdiomaDAO();
				ArrayList<IdiomaTO> idiomas = ldao.listar();
				
				//enviar para o jsp
				request.setAttribute("idiomas", idiomas);

				request.setAttribute("filmes", filmes.toArray());
				RequestDispatcher view = 
				request.getRequestDispatcher("ListarFilmes.jsp");
				view.forward(request, response);
	}

}
