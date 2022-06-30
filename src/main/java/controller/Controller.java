package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/controller", "/main", "/novo-contato","/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// testing db connection
	DAO dao = new DAO();
//	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		if (path.equals("/main"))
			contatos(request, response);

		if (path.equals("/novo-contato"))
				novoContato(request, response);
		
		if(path.equals("/insert"))
			insertContact(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		{

		}
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("agenda.jsp");
	}

	protected void novoContato(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("novo-contato.jsp");
	}
	
	protected void insertContact(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		//Inserindo os dados fo formulário na classe JavaBeans
		JavaBeans contato = new JavaBeans();
		contato.setName(request.getParameter("nome"));
		contato.setFone(request.getParameter("fone"));
		contato.setEmail(request.getParameter("email"));
		
		//Enviando o objeto contato para a classe DAO
		dao.createContact(contato);
		
		response.sendRedirect("agenda.jsp");
		
		System.out.println("Dados salvos com sucesso!");
	}

}
