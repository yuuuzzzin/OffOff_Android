# OffOff_Android
👩‍⚕️ 간호사, 간호전공학생들을 위한 커뮤니티 어플리케이션 👨‍⚕️

# [Android] 커뮤니티 기능 및 내부테스트 v1.0.1-beta까지 구현한 내용

## 로그인 및 회원가입
| 로그인 | 자동 로그인 | 회원가입 |
| :------------: | :------------: | :------------: |
|![-스플래시및로그인](https://user-images.githubusercontent.com/57751515/145573892-727d1e85-a2dc-492e-8f8d-ced78ce7dc29.gif)|![자동로그인](https://user-images.githubusercontent.com/57751515/145573911-d1e29bbe-2641-4d0c-ab80-ddc4b07e821e.gif)|![회원가입](https://user-images.githubusercontent.com/57751515/145573973-fa44ce98-55b7-4be3-9340-d9c56ec42997.gif)|

- [Retorofit2](https://square.github.io/retrofit/)를 이용한 서버 통신으로 회원가입, 로그인 구현
- LiveData와 Flow를 통해 
- [Shared Preferences](https://developer.android.com/training/data-storage/shared-preferences)로 키-값 형태로 Bearer token을 저장해 자동 로그인 구현

## 4개의 네비게이션 탭
<img src="https://user-images.githubusercontent.com/57751515/145574417-211e9d17-91e9-4ee9-b8db-73571c685e09.gif"  width="40%">

- [Navigation](https://developer.android.com/guide/navigation)을 통해 바텀 네비게이션 뷰를 이용한 프래그먼트 전환 가능
- 메인 화면과 캘린더 화면은 기능과 디자인을 보완해 추후 업데이트 예정
- 환경설정 탭도 로그아웃 외의 여러 기능을 추가해 업데이트 예정

## 게시판 및 게시글 작성 / 삭제 등의 활동
| 게시판 | 게시글 작성 | 게시글 삭제 |
| :------------: | :------------: | :------------: |
|![게시글리스트](https://user-images.githubusercontent.com/57751515/145574890-4f4e90c8-c44f-48ee-8a38-ab511b8f3fbd.gif)|![글쓰기](https://user-images.githubusercontent.com/57751515/145574902-e4e7e044-f975-4550-8204-68c146a08ea0.gif)|![내게시글경우](https://user-images.githubusercontent.com/57751515/145670444-89b91353-d576-44cf-8172-7a4132c1ce26.gif)|

- 무한 스크롤 -> 스크롤이 최하단에 도달하면 불러온 마지막 게시글 아이디를 기준으로 그 이후의 게시글 리스트를 추가로 불러옴
- 새로운 글을 작성 완료하면 작성된 게시글 Activity 실행 후 뒤로가기 시 게시판 Activity로 돌아가고 onCreate()부터 다시 시작되어 최신 PostList 불러옴
- 글을 삭제하면 게시판 Activity로 돌아가고 onCreate()부터 다시 시작되어 최신 PostList 불러옴

## 게시글 공감 / 스크랩 / 신고 및 댓글
| 게시판 좋아요 / 스크랩 / 신고 | 댓글 작성 및 삭제 / 좋아요 |
| :------------: | :------------: |
|![게시글공감스크랩신고](https://user-images.githubusercontent.com/57751515/145670440-06045d13-441f-47bb-bffa-d9302c5749fa.gif)|![댓글스크롤및좋아요신고](https://user-images.githubusercontent.com/57751515/145670627-a6b0d7b0-d87d-4101-bd3f-b7076efdd7a5.gif)|

- 게시글 또는 댓글 좋아요 시 화면 내 좋아요 숫자 + 1
- 화면 스크롤 조작
```kotlin
object ScrollViewUtils {

    // 해당 뷰까지 스크롤을 부드럽게 이동
    fun NestedScrollView.smoothScrollToView(view: View, marginTop: Int = 0) {
        val y = calculateDistance(view) - marginTop
        ObjectAnimator.ofInt(this, "scrollY", y).apply {
            duration = 1000L
        }.start()
    }

    // 스크롤뷰와 해당 뷰 사이의 거리 계산
    private fun NestedScrollView.calculateDistance(view: View): Int {
        return kotlin.math.abs(
            calculateView(this).top - (this.scrollY + calculateView(
                view
            ).top)
        )
    }

    // 스크린 내의 뷰 절대 좌표 계산
    private fun calculateView(view: View): Rect {
        val location = IntArray(2)
        view.getLocationOnScreen(location)
        return Rect(
            location[0],
            location[1],
            location[0] + view.measuredWidth,
            location[1] + view.measuredHeight
        )
    }
}
```

 - 스크롤 이동 시에는 보이게 하고 싶은 댓글 뷰 위치를 계산해 적절한 위치로 1초 동안 부드럽게 이동
   - 새로운 댓글 작성 시 화면 맨 하단으로 스크롤 이동
   - 대댓글을 달기 위한 댓글 선택 시 선택한 댓글이 키보드 위로 보이도록 스크롤 이동
   - 새로운 대댓글 작성 시 해당 대댓글이 화면에 보이도록 스크롤 이동

## 게시글 검색
| 통합 게시판 검색 | 특정 게시판 검색 |
| :------------: | :------------: |
|![통합게시판검색](https://user-images.githubusercontent.com/57751515/145671125-cbd0e870-a7d7-4e92-96a5-88b70836c6cc.gif)|![특정게시판검색](https://user-images.githubusercontent.com/57751515/145671144-b764ea38-6d6b-4130-84b8-2f3864010d0f.gif)|

- Coroutine과 Job을 이용해 EditTex의 실시간 쿼리를 감지하여 검색하는 Instant Search 구현
   -  모든 쿼리의 변화를 감지해 call을 보내고 return을 받으면 동작이 무거워지고 정확한 쿼리 검색이 이루어지지 않을 수 있어서 rxJava의 debounce와 비슷한 기능을 하도록 0.5초 딜레이를 주어 동작 수행
- 차후 검색 결과가 없을 시 안내 문구나 이미지 삽입 예정

## 사용자 게시글 활동
<img src="https://user-images.githubusercontent.com/57751515/145671445-d73b7773-a174-4c54-bbe4-b9c157769e54.gif"  width="40%">

- 내가 쓴 글 / 댓글 남긴 글 / 스크랩한 글 확인 가능

## 환경설정 - 로그아웃
<img src="https://user-images.githubusercontent.com/57751515/145671525-50078bad-d1f5-4ef1-b5d0-e6cb239e8afb.gif"  width="40%">

- 환경설정 다른 기능 추가 구현 예정
