package kiosk.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 키오스크의 메인 로직을 담당하는 클래스입니다.
 * 메뉴 출력, 주문 관리, 사용자 입력 처리 등의 기능을 제공합니다.
 */
public class Kiosk {
    private final List<MenuCategory> categories; //상위 메뉴 카테고리 categories 리스트
    private final Order order; // 주문 관리 객체
    private final Scanner sc; // 사용자 입력 처리

    /**
     * Kiosk 객체 생성 및 초기화
     */
    public Kiosk() {
        categories = new ArrayList<>();
        order = new Order();
        sc = new Scanner(System.in);
        initMenu(); //메뉴 초기화
    }

    /**
     * 메뉴를 초기화합니다. (하위 카테고리와 각 카테고리에 해당하는 세부 메뉴 항목 추가)
     */
    private void initMenu() {
        MenuCategory burgers = new MenuCategory("Burgers");
        burgers.addMenuItems(new MenuItems("TheRealNewYorkBurger", 13.5, "6시간 수비드한 목살을 숯불에 구워 특제 바베큐소스를 곁들인 수제 버거"));
        burgers.addMenuItems(new MenuItems("PiggyCreamBurger", 14.5, "숯불로 구운 소고기 패티에 부드러운 어니언크림을 듬뿍 끼얹은 수제 버거"));
        burgers.addMenuItems(new MenuItems("CheeseVolcanoBurger", 16.5, "콜치즈,슈레드치즈,치즈소스 치즈와 패티로만 이루어진 치즈러버의 버거"));
        burgers.addMenuItems(new MenuItems("MacNCheeseBurger", 14.5, "숯불에 구운 소고기패티, 해쉬브라운, 치즈에 버무린 맥엔치즈가 듬뿍 들어간 수제 버거"));
        burgers.addMenuItems(new MenuItems("DevilHotBurger", 14.5, "악마도 먹다 울고가는 특제 핫소스를 소고기 패티에 곁들인 매콤한 수제 버거"));
        categories.add(burgers);

        MenuCategory side = new MenuCategory("Side");
        side.addMenuItems(new MenuItems("TexasBarbeque", 49.0, "텍사스 갔다온 사장님이 가져온 바베큐"));
        side.addMenuItems(new MenuItems("ChiliCheeseFries", 14.5, "미트칠리와 치즈가 얹어진 감자튀김"));
        side.addMenuItems(new MenuItems("OnionRing", 12.5, "바삭한 어니언링"));
        side.addMenuItems(new MenuItems("OreoMilkShake", 6.5, "오레오 쉐이크"));
        side.addMenuItems(new MenuItems("CornSalad", 3.5, "콘 샐러드"));
        categories.add(side);

        MenuCategory drinks = new MenuCategory("Drinks");
        drinks.addMenuItems(new MenuItems("펩시제로라임", 3.5, "콜라는 역시 펩시"));
        drinks.addMenuItems(new MenuItems("코카콜라", 3.5, "오리지널 코카콜라"));
        drinks.addMenuItems(new MenuItems("스프라이트", 3.5, "시원한 청량감"));
        categories.add(drinks);
    }

    /**
     * 전체 메뉴를 출력하고 주문 항목을 선택합니다.
     */
    private void showMenu() {
        System.out.println("[ 전체 메뉴 ]");
        int insertNum = 1;
        for (MenuCategory category : categories) {
            System.out.println(category.getCategoryName() + " 메뉴");
            for (MenuItems items : category.getItems()) {
                System.out.printf("%d. %s | W %.2f | %s%n", insertNum++, items.getName(), items.getPrice(), items.getInformation());
            }
        }
        System.out.println("이전 화면으로 되돌아가려면 0을 입력하세요.");
        System.out.print("메뉴를 선택하세요 : ");
        int menuChoice = sc.nextInt();

        if (menuChoice == 0 ) {
            System.out.println("이전 화면으로 돌아갑니다.");
            return;
        }
        insertNum = 1;
        for (MenuCategory category : categories) {
            for (MenuItems items : category.getItems()) {
                if (menuChoice == insertNum++) {
                    order.addItem(items);
                    return;
                }
            }
        }
        System.out.println("잘못된 선택입니다. 다시 선택하세요.");
    }

    /**
     * 키오스크 프로그램의 메인 루프를 시작합니다.
     */
    public void start() {
        while (true) {
            System.out.println("========== 1. 주문 | 2. 주문 취소 | 3. 주문 내역 | 0. 홈(종료)==========");
            System.out.println("번호를 입력하세요 : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> showMenu();
                case 2 -> order.clearOrder();
                case 3 -> order.showOrder();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}

