package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardModifyAction");
		
int board_num = Integer.parseInt(request.getParameter("board_num"));
String page = request.getParameter("page");

     BoardDAO dao = BoardDAO.getInstance();
     BoardBean board = dao.getDetail(board_num); // 상세정보 구하기
     
     // 공유 설정
     request.setAttribute("board", board);
	 request.setAttribute("page", page);	
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);      // dispatcher 방식으로 포워딩해야
                                         // request로 공유한걸 쓸수있다.		
		forward.setPath("./board/qna_board_modify.jsp");
		
		return forward;
	}

	
	
	
	
	
	
	
	
}
