package HW01.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MirrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("key")!=null){
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().println(req.getParameter("key"));
        }
        else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }

    }
}
