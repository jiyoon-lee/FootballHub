# FootballHub
## 프로젝트 소개
축구 애호가를 위한 올인원 솔루션. 축구 상품 구매부터 축구 중계일정 조회, 축구 애호가들과의 커뮤니티, 애장품 컬렉션 등 다양한 기능 제공

## 기획 배경
축구에 관심을 가지는 사람들을 위한 사이트 필요성

## 주요 기능
- 회원가입/로그인/로그아웃(+ OAuth2.0)
- 상품 등록/조회/삭제
- 장바구니 등록/조회/삭제
- 주문 추가/조회/취소
- 커뮤니티(게시판)
- 축구 중계 스케줄 확인
- 미니게임
- 실시간 채팅
- 챗봇

## 데이터베이스
### 논리적 모델
<img src="https://github.com/jiyoon-lee/footballHub/assets/59562141/c9a0c0a3-e1ef-417f-81d3-3424f07c2052" width="700" />

### 관계형 모델
<img src="https://github.com/jiyoon-lee/footballHub/assets/59562141/e694b360-d06f-4b35-a642-6b106e9f0e27" width="700" />



---
## 이지윤
### 사용기술
Spring Boot, MySQL, Thymeleaf, h2, lombok, JPA, jQuery, Bootstrap

### 담당 역할
- 데이터베이스 모델링 및 구축
- 메인 페이지 퍼블리싱
- 기능 구현
  - Oauth를 통한 인증인가 구현
  - 카테고리화, 댓글, 평점 기능 구현
    - 댓글, 평점은 ajax를 통한 데이터통신과 DOM조작으로 구현
  - 메인, 로그인, 상세, 주문 페이지 디자인 적용

### UI 캡처
<img src="./UI캡처/1.png" width="600" />
<img src="./UI캡처/7.png" width="600" />
<img src="./UI캡처/2.png" width="600" />
<img src="./UI캡처/3.png" width="600" />
<img src="./UI캡처/4.png" width="600" />
<img src="./UI캡처/5.png" width="600" />
<img src="./UI캡처/6.png" width="600" />
