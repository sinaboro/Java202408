package movie;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class AdminMenu extends AbstractMenu{

	private static final AdminMenu instance = new AdminMenu(null);
	
	private static final String ADMIN_MENU_TEXT =  //기본 문구 
			"1: 영화 등록 하기\n" +
			"2: 영화 목록 보기\n" +
			"3: 영화 삭제 하기\n" +
			"b: 메인 메뉴로 이동\n\n" +
			"메뉴를 선택하세요: ";
	
	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}

	public static AdminMenu getInstance() {
		return instance;     //AdminMenu 객체 생성 주소반환(싱글톤패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
			case "1":
				createMovies();
				return this;
			case "2":
				printAllMovies();  //영화 목록 출력
				return this;
			case "b": return prevMenu;
			default : return this;
		}
	}

	private void createMovies() {
		
		System.out.println("제목: ");
		String title = sc.nextLine();  //제목입력
		System.out.println("장르: ");
		String genre = sc.nextLine(); //장르입력
		
		Movie movie = new Movie(title, genre);
		
		try {
			movie.save();
			System.out.println(">> 등록되었습니다.");
		} catch (IOException e) {
			System.out.println(">> 실패하였습니다.");
		}
		
		
	}

	private void printAllMovies() {
		try {
			List<Movie> movies = Movie.findAll();
			System.out.println();
			
			for(Movie movie : movies)
				System.out.printf("%s\n", movie);
		} catch (Exception e) {
			System.out.println("데이터 접근에 실패하였습니다.");
		}
	}
}
















