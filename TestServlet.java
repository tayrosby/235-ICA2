package assignment;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("==========> Test Servlet init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
    @Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("==========> Test Servlet destroy()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("==========> Test Servlet doGet()");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		response.getWriter().append("Hello my name is: ").append(firstname + " " + lastname);
		if(firstname == null || firstname.isEmpty() || lastname == null || lastname.isEmpty() ) {
			
			request.getRequestDispatcher("TestError.jsp").forward(request, response);
		}
		else {
			request.setAttribute("firstname", firstname);
			request.setAttribute("lastname", lastname);
			request.getRequestDispatcher("TestResponse.jsp").forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
