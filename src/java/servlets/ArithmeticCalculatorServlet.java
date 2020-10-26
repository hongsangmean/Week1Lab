
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 703922
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNum =  request.getParameter("first_number");
        String secondNum = request.getParameter("second_number");
        if(firstNum == null || firstNum.equals("") || secondNum == null || secondNum.equals("") || firstNum.matches("[a-zA-Z -]+") || secondNum.matches("[a-zA-Z -]+")){
            request.setAttribute("message", "Invalid");
           
        }else{
        String operator = request.getParameter("operator");
        int fNum = Integer.parseInt(firstNum);
        int sNum = Integer.parseInt(secondNum);
        switch(operator){
            case ("+"):
                request.setAttribute("message", (fNum + sNum));
                break;
                case ("-"):
                request.setAttribute("message", (fNum - sNum));
                break;
                case ("*"):
                request.setAttribute("message", (fNum * sNum));
                break;
                case ("%"):
                request.setAttribute("message", (fNum % sNum));
                break;
        }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        
    }


}
