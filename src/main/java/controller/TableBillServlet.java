package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.OrderDTO;
import model.dto.TableInfoDTO;
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

      List<OrderDTO> orders = service.getOrdersByTable(tableNo);
      TableInfoDTO tableInfo = service.getTableInfo(tableNo, orders);

      TableBillViewModel vm = new TableBillViewModel();
      vm.set卓情報(tableInfo);
      vm.set注文一覧(orders);

      request.setAttribute("viewModel", vm);

      request.getRequestDispatcher("/WEB-INF/jsp/TableBill.jsp").forward(request, response);
  }

}
