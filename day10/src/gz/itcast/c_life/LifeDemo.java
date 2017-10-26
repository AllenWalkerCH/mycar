package gz.itcast.c_life;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LifeDemo extends HttpServlet {

	/**
	 * 1.���췽��
	 */
	public LifeDemo(){
		System.out.println("1.servlet���󱻴����ˡ�");
	}

	/**
	 * 2.init����
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("2.init����������");
	}
	
	/**
	 * 3.service����
	 */
	@Override			
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("3.service����������");
	}
	
	/**
	 * 4.destroy����
	 */
	@Override
	public void destroy() {
		System.out.println("4.servlet����������");
	}
	
	
}