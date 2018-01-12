package controller.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    String SIGN_IN_JSP = "/sign_in.jsp";
    String CLIENT_HOME_JSP = "/client_home.jsp";
    String ADMIN_HOME_JSP = "/admin_home.jsp";
    String REGISTRATION_PAGE_JSP = "/registration_page.jsp";
    String APARTMENTS_FOR_ORDER = "/apartmentsForOrder.jsp";

    String execute(HttpServletRequest request, HttpServletResponse response);
}
