package jp.himeji_cs.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * アノテーションで定義したサーブレット。
 */
@WebServlet("/annotation")
public class ServletByAnnotation extends HttpServlet {

    private static final long serialVersionUID = -8355013285750137575L;

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
        throws ServletException, IOException {

        resp.getWriter().write("<html><body>Hello, servlet by annotation</body></html>");
    }

}
