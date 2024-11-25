package kiosk.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * 주문 내역을 관리하는 클래스입니다.
 * 리스트에 주문 추가, 주문 취소, 주문한 내역을 조회하는 기능을 제공합니다.
 */
public class Order {
    private List<MenuItems> orderedItems; // 주문된 메뉴 항목 리스트

    /**
     * Order 객체 생성, orderedItems 리스트로 주문 항목 관리
     */
    public Order() {
        orderedItems = new ArrayList<>();
    }

    /**
     * 사용자가 선택한 메뉴를 items 리스트에 추가합니다.
     * getName() 메서드로 추가된 메뉴를 출력합니다.
     * @param items 추가할 메뉴 항목
     */
    public void addItem(MenuItems items) {
        orderedItems.add(items);
        System.out.println(items.getName() + "이/가 주문에 추가되었습니다.");
    }

    /**
     * orderedItems 리스트의 모든 항목을 clear() 메서드를 이용해 취소합니다.
     */
    public void clearOrder() {
        orderedItems.clear();
        System.out.println("주문이 모두 취소되었습니다.");
    }

    /**
     * 현재 주문 내역을 출력합니다.
     * 주문이 없을 경우 안내 메세지를 출력합니다.
     */
    public void showOrder() {
        if (orderedItems.isEmpty()) {
            System.out.println("현재 주문 내역이 없습니다.");
        } else {
            System.out.println("주문 내역 : ");
            for (MenuItems orderHistory : orderedItems) {
                System.out.printf("- %s | W %.2f%n", orderHistory.getName(), orderHistory.getPrice());
            }
        }
    }
}

