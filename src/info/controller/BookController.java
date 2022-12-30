package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.view.*;
import info.vo.*;

public class BookController {

	public static final int CONTINUE = 1;
	public static final int BREAK = 0;

	ArrayList<Integer> isbns = new ArrayList<Integer>();
	ArrayList<String> booknames = new ArrayList<String>();
	ArrayList<String> publishs = new ArrayList<String>();
	ArrayList<String> authors = new ArrayList<String>();
	ArrayList<Integer> prices = new ArrayList<Integer>();
	ArrayList<String> categorys = new ArrayList<String>();

	public void consoleToList() {
//		콘솔에 입력 받기 위해 Scanner 생성
		Scanner scan = new Scanner(System.in);

		int flag = CONTINUE;
		System.out.println("************* 도서 정보 입력 *************");
		while (true) {
			if (flag == CONTINUE) {
				System.out.print("** 도서번호 입력: ");
				isbns.add(scan.nextInt());
				System.out.print("** 도서이름 입력: ");
				booknames.add(scan.next());
				System.out.print("** 출판사 입력: ");
				publishs.add(scan.next());
				System.out.print("** 저자명 입력: ");
				authors.add(scan.next());
				System.out.print("** 가격 입력: ");
				prices.add(scan.nextInt());
				System.out.print("** 분류 입력: ");
				categorys.add(scan.next());
			} else if (flag == BREAK) {
				break;
			}
			System.out.print("계속 학생정보를 입력받으시겠습니까?(계속: 1, 중지: 0): ");
			flag = scan.nextInt();
		}

		scan.close();
	}

	public void voToDAO(BookDAO dao) {
		for (int i = 0; i < isbns.size(); i++) {
			BookVO bvo = new BookVO(isbns.get(i), booknames.get(i), publishs.get(i), authors.get(i), prices.get(i),categorys.get(i));
			dao.insert(bvo);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookController controller = new BookController();
		controller.consoleToList();
		BookDAO dao = new BookDAO();
		controller.voToDAO(dao);
		
		BookView bView = new BookView();
		bView.view(dao.select());
	}

}
