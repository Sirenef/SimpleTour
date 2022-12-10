package thestrandedfish.simpletour.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import thestrandedfish.simpletour.model.Cart;
import thestrandedfish.simpletour.model.CartItem;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/deletecartitem"})
public class DeleteCartItemController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("cart");
		
		if (obj != null)
		{
			Cart cart =(Cart) obj;
			cart.getCartItems().remove(obj);
		}
	}
}
