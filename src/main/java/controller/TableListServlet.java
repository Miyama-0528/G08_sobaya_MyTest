package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.service.TableService;
import viewmodel.TableListViewModel;

@WebServlet("/TableListServlet")
public class TableListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Service 呼び出し
        TableService service = new TableService();

        // 画面表示用の ViewModel を作成
        TableListViewModel vm = service.getTableList();

        // JSP に渡す
        request.setAttribute("viewModel", vm);

        // 画面遷移
        request.getRequestDispatcher("/view/Table.jsp").forward(request, response);
    }
}
