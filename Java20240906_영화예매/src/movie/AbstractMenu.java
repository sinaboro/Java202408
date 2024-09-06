package movie;

import java.util.Scanner;

public class AbstractMenu implements Menu {

	protected String menuText; //기본 문구
	protected Menu prevMenu; //이전 메뉴
	protected static final Scanner sc = new Scanner(System.in);
	
	AbstractMenu(String menuText, Menu prevMenu){
		this.menuText = menuText;
		this.prevMenu = prevMenu;
	}	
	
	public void setPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
	}
	
	@Override
	public void print() {
		System.out.print("\n" + menuText);  //메인메뉴 출력
	}

	@Override
	public Menu next() {
		return null;
	}
}
