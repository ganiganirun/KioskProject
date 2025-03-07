# KioskProject

1. 프로젝트 소개
    - 본 키오스크 프로젝트를 통해 기초적인 흐름 제어 및 객체 지향 설계 개념을 복습하고 연습하도록 한다. 키오스크인 이유는 클래스 설계를 쉽게 머리속에 그릴 수 있어서 접근성이 좋다는 점과 이로 인한 좋은 학습 과정 때문이다. 프로젝트를 진행하면서 주의해야 할 점은 단순한 구현사항에만 집중하는 것을 지양하고 객체지향 설계에 대해 고민해보는 것을 추천한다.
2. 요구사항 분석
    - 클래스는 Main, MenuItem, Kiosk, Menu 로 분류하도록 한다.
    - Main class는 시작 지점이 되는 클래스다.
    - MenuItem class는 세부 메뉴 속성을 가지는 클래스로 햄버거 이름, 가격, 설명 등을 정의한다.
    - Kiosk class는 프로그램의 순서 및 흐름을 제어하는 클래스이다.
    - Menu class는 MenuItem class를 관리하는 클래스이다.
    - level3
      - kiosk 클래스를 생성하여 프로그램의 메뉴를 관리하고 사용자 입력을 처리하도록 한다.
      - MenuItem을 관리하는 리스트가 필드로 존재한다.
      - Main함수에서 관리하던 입력과 반복문 로직을 start 함수로 만들어 관리한다.
      - lists는 kiosk 클래스 생성자를 통해 값을 할당한다.
3. 설계