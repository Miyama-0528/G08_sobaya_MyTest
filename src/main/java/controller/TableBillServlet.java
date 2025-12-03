package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.service.OrderService;
import viewmodel.TableBillViewModel;

/**
 * Servlet implementation class TableBillServlet
 */
@WebServlet("/TableBillServlet")
public class TableBillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

      int tableNo = Integer.parseInt(request.getParameter("tableNo"));

      OrderService service = new OrderService();
      TableBillViewModel vm = service.createViewModel(tableNo);
      
      request.setAttribute("viewModel", vm);

      request.getRequestDispatcher("/WEB-INF/jsp/TableBill.jsp").forward(request, response);
  }

}
