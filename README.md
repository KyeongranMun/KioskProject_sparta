## 📜 목차
### 1. 프로그램의 목적과 주요 기능
### 2. 구현 계획
### 3. 기능 엿보기
### 4. 소셜 링크

<br>


## 클래스 다이어그램

![image](https://github.com/user-attachments/assets/64482948-9e75-4348-b009-7cc92bc88466)


   
<br>

## 🔧프로그램의 목적과 주요 기능
### *<목적>*
- 사용자가 키오스크를 이용할 때 어떠한 흐름과 경험을 가져갈 지 예측할 수 있다.
- 키오스크를 만들 때 어떠한 기능이 필요한 지 명확히 하고, 그에 따른 설계를 구상할 수 있다.
- 데이터 흐름이 어떻게 이루어질 지 이해할 수 있다.
- 객체 지향 설계를 적용해 메뉴와 순서 제어를 클래스로 관리할 수 있다.
- 객체 지향 개념을 학습하고, 데이터를 구조적으로 관리할 수 있다.

### *<기능>*
- 사용자가 원하는 메뉴를 선택해 주문을 추가할 수 있다.
- 사용자가 주문을 취소하고, 주문 내역을 확인할 수 있다.
- 특정 조건을 입력하면 이전 화면으로 돌아가 다시 메뉴를 선택할 수 있다.
- 상위 카테고리에서 하위 카테고리로 들어가 세부 메뉴를 확인할 수 있다.

## ⚙️ 구현계획  
<프로그램 설계>
1. 프로그램 시작 시 기본 메뉴가 출력되고, 기본 메뉴 선택 시 하위 카테고리에서 메뉴를 확인할 수 있다.
2. 사용자가 메뉴를 고르면 리스트에 저장되어 주문 내역에서 조회할 수 있다. 
3. 0 버튼으로 이전 화면으로 돌아가거나 프로그램을 종료할 수 있다.
4. 사용자가 프로그램을 종료하거나 에러가 나지 않으면 자동으로 프로그램이 계속 구동된다.

<클래스 구상>
- MenuItems : 개별 메뉴 세부 항목(음식 이름, 가격, 설명)을 관리하는 클래스 
- MenuCategory : 메뉴 카테고리(버거, 사이드, 음료)를 관리하며, 각 카테고리마다 세부 메뉴 리스트를 포함한다.
- Order : 사용자가 주문한 메뉴 항목 리스트를 관리한다. 주문 추가, 취소, 내역 조회 등의 기능을 제공한다.
- Kiosk : 키오스크 프로그램의 중심 클래스로 사용자 입력에 따라 메뉴 출력, 주문 추가, 주문 취소 등의 기능을 관리한다.
- KioskApp : 프로그램의 시작점으로 Kiosk 객체를 생성해 프로그램을 실행한다.

<br>

## 🛠 기능 엿보기   
<br>

![캡처](https://github.com/user-attachments/assets/c911be46-231f-48bb-a1e0-2f15f6e5e14c)



<br>
   
## Link   
### General link
- [🚗 Visit My Repo](https://github.com/KyeongranMun?tab=repositories)   
- [🙋‍♂️ Visit My Blog](https://austindynasty.tistory.com/)


