package info.vo;

import java.util.*;

public class BookDAO {
	ArrayList<BookVO> bvoList = new ArrayList<BookVO>();
	
	public void insert(BookVO bvo) {
		bvoList.add(bvo);
	}
	
	public ArrayList<BookVO> select(){
		return bvoList;
	}
}