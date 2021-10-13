package service;

import java.io.File;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardDelete implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardDelete");

		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();
		
int board_num = Integer.parseInt(request.getParameter("board_num"));
String page = request.getParameter("page");
String board_pass = request.getParameter("board_pass");

        String path=request.getRealPath("boardupload"); // 첨부파일 경로
        System.out.println("path:"+path);
        
		BoardDAO dao = BoardDAO.getInstance();
		BoardBean old = dao.getDetail(board_num);
		
		// 상세정보를 가져온 old메소드로 비번을 비교한다.
		if(old.getBoard_pass().equals(board_pass)) {   // 비번 일치
			int result = dao.delete(board_num);
			if(result==1) System.out.println("삭제 성공");
			
			// 첨부파일이 있을 경우에 첨부파일 삭제
			if(old.getBoard_file() != "") {
				File file = new File(path);
			    file.mkdir(); 
// 디렉토리를 만들어주는메소드, 지금은 폴더가있어서 없어도 상관없지만 true값을 리턴해준다.
			    
			// boardupload 디렉토리의 모든 첨부파일 구해오기
			File[] f = file.listFiles();
			
			for(int i=0; i<f.length; i++) {
				if(f[i].getName().equals(old.getBoard_file())) {
					f[i].delete();
				}
			}
		}
			
			
		}else {             // 비번 불일치
			out.println("<script>");
			out.println("alert('비번이 일치하지 않습니다');");
			out.println("history.go(-1);");
			out.println("</script>");
	        out.close();
	        
	        return null;  // execute 메소드를 빠져나간다!!
	        
		}
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/BoardListAction.do?page="+page);
		
		
		return forward;
	}

}
