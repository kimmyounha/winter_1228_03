package info.view;

import java.util.*;
import info.vo.BookVO;

public class BookView {
	public void view (ArrayList<BookVO> bvoList) {
		for(BookVO bvo : bvoList) {
			
			System.out.print("===============");
			System.out.print("\n도서번호 :\t"+bvo.getIsbn());
			System.out.print("\n도서이름 :\t"+bvo.getBookName());
			System.out.print("\n출판사 :\t"+bvo.getPublish());
			System.out.print("\n저자명 :\t"+bvo.getAuthor());
			System.out.print("\n가격 :\t"+bvo.getPrice());
			System.out.print("\n분류 :\t"+bvo.getCategory());
			System.out.print("\n===============");
		}
	}
}
