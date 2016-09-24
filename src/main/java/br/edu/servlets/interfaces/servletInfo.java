package br.edu.servlets.interfaces;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletInfo
 */
public class servletInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter(); //Pega o escritor de resposta
		pw.println(getServletContext().getInitParameter("Usuario"));
		pw.println(getServletContext().getInitParameter("Senha"));
		pw.println("Parametro do servlet Info-Inicial: "+getServletConfig().getInitParameter("info-servlet"));
		pw.println("Caminho do Contexto: "+request.getContextPath());
		pw.println("Caminho do Servlet: "+request.getServletPath());
		pw.println("Porta local: "+request.getLocalPort());
		pw.println("Informação do caminho: "+request.getPathInfo());
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
