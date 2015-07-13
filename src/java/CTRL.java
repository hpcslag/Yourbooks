
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CTRL extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        
        HttpSession session = req.getSession();

        System.out.println("Session ID: "+session);
        
        String color = req.getParameter("color");
        res.setContentType("text/html");
        req.setAttribute("color", color);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req,res);
    }
}
