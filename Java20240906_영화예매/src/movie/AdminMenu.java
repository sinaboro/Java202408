package movie;

public class AdminMenu extends AbstractMenu{

	private static final AdminMenu instance = new AdminMenu(null);
	
	private static final String ADMIN_MENU_TEXT =  //기본 문구 
			"1: 영화 등록 하기\n" +
			"2: 영화 목록 보기\n" +
			"3: 영화 삭제 하기\n" +
			"b: 메인 메뉴로 이동\n\n" +
			"메뉴를 선택하세요: ";
	
	AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}

	public static AdminMenu getInstance() {
		return instance;     //AdminMenu 객체 생성 주소반환(싱글톤패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
			case "b": return prevMenu;
			default : return this;
		}
	}
}
