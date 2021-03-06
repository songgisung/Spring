# 01스프링 프레임워크


## 스프링 프레임워크
스프링을 이용해서 어플리케이션을 개발할 때 기반이 되는 프레임워크이다.
스프링의 핵심 기능 DI와 AOP를 제공한다.웹 어플이케이션을 개발할때 사용하는 스프링MVC,스프링ORM 등의 기능도 스프링 프레임워크에 포함되어 있다.

### 스프링의 주용 모듈 목록

### 스프링 데이타
데이터 연동을 위한 단일 API를 제공하며,이 API를 기반으로 JPA,mongoDB,Neo4j,Redis등 RDBMS와 NoSQL과 연동을 적은 양의 코드로 처리할수 있도록 해준다.
### 스프링 시큐리티
인증과 허가에 대한 기반 프레임워크 및 관련 모듈을 제공한다 웹 어플리케이션을 위한 보안을 간단한 설정과 약간의 코드 구현으로 처리 할수 있다.
### 스프링 배치
배치 처를 위한 기반 프레임워크를 제공해준다. 데이터 처리, 흐름 제어 실패 재처리 등 배치 처리 어플리케이션이 필요로 하는 기능을 제공으로 한다.
### 스프링 인터그레이션
시스템간의 연동을 위한 메시징 프레임워크를 제공한다.
### 스프링 소셜
트위터, 페이스북 등 소셜 네트워트 연동을 위한 기능 제공한다.

## 설치 및 주용  모듈
자바를 이용해서 어플리케이션을 개발할때 메이븐이나 그래들과 같은 빌드 도구를 사용하게 되는데, 이런 빌드 도구들의 주요 특징중 하는 하나는 의존 모듈 (jar파일)관리에 있다.
예를 들어 메이븐의 경우 중안 리파지터리(central repository)라고 불리는 서버로 부터 필요한 jar 파일을 다운로드 받아 의존 모듈을 관리한다.

스프링 팅은 메이븐 중앙 리포지토리를 통해서 스프링 프레임워크 모듈 (jar파일)을 배포하고 있다.
스프링 프레임워크의 기본적인 DI기능을 사용할때에는 메이븐의 pom.xml파일에 추가 해주면 된다.

Maven 기초 사용법 : https://javacan.tistory.com/entry/MavenBasic

# 2.1 스프링 프레임워크의 주요 모듈
스프링의 주요 모듈 목록

### spring-beans
스프링 컨테이너를 이용해서 객체를 생성하는 기본 기능을 제공한다.
### spring-context
객체 생성, 라이프 사이클 처리, 스키마 확장등의 기능을 제공한다. 
### spring-aop
AOP(Aspect Oriented Programming)기능을 제공한다.
### spring-web
REST 클라이언트, 데이터 변환 처리, 서블릿 필터,  파일 업로드 지원등 웹 개발에 필요한 기반 기능을 제공한다.
### spring-webmvc
스프링 기반 MVC 프레임워크이다. 웹 어플리케이션을 개발하는데 필요한 컨트롤러, 뷰 구현한다.
### spring-websocket
스프링 MVC에서 웹 소켓 연동을 처리할수 있도록 한다.
### spring-oxm
XML과 자바 객체간의 매핑을 처리하기 위한 API를 제공한다.
### spring-tx
트랜잭션 처리를 위한 추상 레이어를 제공한다.
### spring-jdbc
JDBC 프로그래밍 보다 쉽게 할수 있는 템플릿을 제공한다.
### spring-orm
하이버네이트, JPA, MyBatis등과 연동을 지원한다.
### spring-jms
JMS 서버와 메세지를 쉽게 주고 받을수 있도록 하기 위한 템플릿, 애노테이션들을 제공한다.
###  spring-context-support
스케줄링, 메일발송, 캐시 연동, 벨로시티 등 부가 기능으로 제공한다.

# 3 첫 번째 스프링프로그램
### 메이븐이란
- 메이븐은 내가 사용할 라이브러리뿐만 아니라 해당 라이브러리가 작동하는 데 필요한 다른 라이브러리들까지 관리하여 네트워크를 통해서 자동으로 다운받아준다.
- 필요한 라이블러리를 특정 문서(pom.xml)에 정의해 놓으면 네트워크 통해서 라이브러리들을 자동으로 다운 받아준다.
- 따라서 메이븐을 사용하면 pom.xml에 필요한 것을 명시해 놓으면 라이브러리를 아주 쉽게 관리할수 있다.
- 메이븐은 프로젝트의 전체적인 라이프 사이클을 관리하는 도구이며 최근에는 메이븐과 같은 라이브러리 관리 프로그램인Gradle이 많이 사용되고 있다.

## 3.6 스프링으로 객체 조립하기: 스르링 설정 만들기
스프링이 생성하는 객체를 '스프링 빈(bean)' 객체 또는 짧게 빈 객체라고 부른다.

## 3.7 스프링으로 객체 조립하기:스프링을 이용한 객체 생성 및 사용
- 스프링은 설정 정보로부터 생성한 스프링 빈 객체를 생성/조립/관리하는 기능을 제공하는데 이 기능을 제공하는 객체를 컨테이너라고 부른다.
- xml 설정 파일로부터 스프링 컨테이너를 생성 할 때에는 GenericXmlApplicationContext 클래스를 사용하면 된다. 이 클래스를 사용해서 컨테이너를 생성하고 컨테이너를 보관된 스프링 빈 객체를 가져와 사용할수 있다.

