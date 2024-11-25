package kiosk.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * 메뉴 할목들을 카테고리별로 관리하는 클래스입니다.
 * 버거, 사이드, 음료와 같은 상위 카테고리와 각 카테고리에 속하는 세부 메뉴 항목을 관리합니다.
 */
public class MenuCategory {
    private String categoryName; // 상위 카테고리 이름
    private List<MenuItems> items; // 카테고리에 속한 메뉴 리스트

    /**
     * MenuCategory 객체 생성
     * @param subCategory 상위 카테고리를 선택하면 나오는 하위 카테고리 (예 : "Burgers", "Side", "Drinks")
     */
    public MenuCategory(String subCategory) {
        categoryName = subCategory;
        items = new ArrayList<>();
    }

    /**
     * 카테고리 이름을 반환합니다.
     * @return 카테고리 이름
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 카테고리에 속한 메뉴 항목 리스트를 반환합니다.
     * @return 메뉴 리스트
     */
    public List<MenuItems> getItems() {
        return items;
    }

    /**
     * 하위 메뉴 카테고리인 "Burgers","Side","Drinks"에 들어갈 세부 메뉴 항목을 추가합니다.
     * @param menuDetail 추가할 세부 메뉴 항목
     */
    public void addMenuItems(MenuItems menuDetail) {
        items.add(menuDetail);
    }
}
