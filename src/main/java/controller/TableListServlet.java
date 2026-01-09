package controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        
        // 時間表示設定(コンソールver)
        // 現在時刻
    	  LocalDateTime now = LocalDateTime.now();
    	  // 日付単位
    	  DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd(E) ");
    	  // 時間単位  
    	  DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    	  // 日付を合わせる(フォーマットする) 
    	  String formattedDate = now.format(dateFormatter);
    	  // 時間を合わせる(フォーマットする)
    	  String formattedTime = now.format(timeFormatter);
    	  // 日付と時間をくっつける
    	  String today = formattedDate + " " + formattedTime;
        
        // 確認用
        System.out.println("viewModel = " + vm);
        System.out.println("NowTime   = " + today);
        System.out.println("==============================");
        
        request.setAttribute("viewModel", vm);
        request.setAttribute("now", today);

        request.getRequestDispatcher("/WEB-INF/view/TableList.jsp").forward(request, response);
    }
}
