package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.service.TableListService;
import viewmodel.TableListViewModel;

@WebServlet("/TableListServlet")
public class TableListServlet extends HttpServlet {

    private TableListService service = new TableListService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        TableListViewModel vm = service.getTableList();
        
        //確認用
        System.out.println("viewModel = " + vm);
        System.out.println("==============================");
        
        request.setAttribute("viewModel", vm);

        request.getRequestDispatcher("/WEB-INF/jsp/TableList.jsp").forward(request, response);
    }
}
