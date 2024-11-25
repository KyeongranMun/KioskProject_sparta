package kiosk.assignment;

/**
 * 개별 음식 세부 항목을 관리하는 클래스입니다.
 * 각 메뉴별 이름, 가격, 설명 필드를 갖습니다.
 * 각 필드들을 조회할 수 있는 메서드를 제공합니다.
 */
public class MenuItems {
    private String name;
    private double price;
    private String information;

    /**
     *
     * @param menuName 메뉴의 이름
     * @param menuPrice 메뉴의 가격
     * @param menuInfo 메뉴의 설명
     */

    public MenuItems(String menuName, double menuPrice, String menuInfo) {
        name = menuName;
        price = menuPrice;
        information = menuInfo;
    }

    /**
     * 메뉴의 이름, 가격, 설명을 반환합니다.
     * @return 메뉴이름/가격/설명
     */
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getInformation() {
        return information;
    }

}
