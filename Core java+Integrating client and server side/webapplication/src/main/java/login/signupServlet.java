package login;

import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/signupServlet")

public class signupServlet extends HttpServlet {

private static final long serialVersionUID = 1L;   

    public signupServlet() {

        super();

       

    }

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub

		response.getWriter().append("Served at: ").append(request.getContextPath());

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException         {

		

		

		String email=request.getParameter("email");

		String pass=request.getParameter("pass");

		PreparedStatement stmt;


		Connection con;

		RequestDispatcher rd;

		try 

		{

			Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost/web","root","Ap9820121295");

			String sql="insert into webapp(username,password) values(?,?)";

			stmt=con.prepareStatement(sql);

			stmt.setString(1,email);

			stmt.setString(2,pass);

			int row=stmt.executeUpdate();

			if(row>0)

			{

				request.setAttribute("status","Successfully Signed up... Now you can Login.");

				rd=request.getRequestDispatcher("Login.jsp");

				rd.forward(request, response);

			}		

			else

			{

				request.setAttribute("status","Failed to sign up....! Please Try again.");

				rd=request.getRequestDispatcher("signup.jsp");

				rd.forward(request, response);		

			}

		} 

		catch (Exception e) 

		{

			e.printStackTrace();

		}

	}


}