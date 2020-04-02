package jp.himeji_cs.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * {@code web.xml}で定義したサーブレット。
 */
public class ServletByXml extends HttpServlet {

    private static final long serialVersionUID = -2326122017492978290L;

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
        throws ServletException, IOException {

        resp.getWriter().write("<html><body>Hello, servlet by xml</body></html>");
    }
}
