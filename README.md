# OffOff_Android
👩‍⚕️ 간호사, 간호전공학생들을 위한 커뮤니티 어플리케이션 👨‍⚕️

# 🔎 Function
[Android] 커뮤니티 기능 및 내부테스트 v1.0.1-beta까지 구현한 내용

## 로그인 및 회원가입
| 로그인 | 자동 로그인 | 회원가입 |
| :------------: | :------------: | :------------: |
|![-스플래시및로그인](https://user-images.githubusercontent.com/57751515/145573892-727d1e85-a2dc-492e-8f8d-ced78ce7dc29.gif)|![자동로그인](https://user-images.githubusercontent.com/57751515/145573911-d1e29bbe-2641-4d0c-ab80-ddc4b07e821e.gif)|![회원가입](https://user-images.githubusercontent.com/57751515/145573973-fa44ce98-55b7-4be3-9340-d9c56ec42997.gif)|

- [Retorofit2](https://square.github.io/retrofit/)를 이용한 서버 통신으로 회원가입, 로그인 구현
- Coroutine, LiveData, Flow를 이용한 반응형 UI 
- [Shared Preferences](https://developer.android.com/training/data-storage/shared-preferences)로 키-값 형태로 Bearer token을 저장해 자동 로그인

## 4개의 네비게이션 탭
<img src="https://user-images.githubusercontent.com/57751515/145574417-211e9d17-91e9-4ee9-b8db-73571c685e09.gif"  width="40%">

- [Navigation](https://developer.android.com/guide/navigation)을 통해 바텀 네비게이션 뷰를 이용한 프래그먼트 전환 가능
- 메인 화면과 캘린더 화면은 기능과 디자인을 보완해 추후 업데이트 예정
- 환경설정 탭도 로그아웃 외의 여러 기능을 추가해 업데이트 예정

## 게시판 및 게시글 작성 / 삭제 등의 활동
| 게시판 | 게시글 작성 | 게시글 삭제 |
| :------------: | :------------: | :------------: |
|![게시글리스트](https://user-images.githubusercontent.com/57751515/145574890-4f4e90c8-c44f-48ee-8a38-ab511b8f3fbd.gif)|![글쓰기](https://user-images.githubusercontent.com/57751515/145574902-e4e7e044-f975-4550-8204-68c146a08ea0.gif)|![내게시글경우](https://user-images.githubusercontent.com/57751515/145670444-89b91353-d576-44cf-8172-7a4132c1ce26.gif)|

- SwipeRefreshLayout을 통해 swipe시 서버에서 최신 리스트를 새로 불러와 출력
- 무한 스크롤 -> 스크롤이 최하단에 도달하면 불러온 마지막 게시글 아이디를 기준으로 그 이후의 게시글 리스트를 추가로 불러옴
- 서버와의 통신 성공 응답을 받기 전까지 ProgressBar를 포함한 레이아웃을 include하거나 다이얼로그를 띄워 로딩 화면 구현

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

## 게시글 검색 및 이미지 원본 보기
| 게시글 검색 | 이미지 원본 보기 |
| :------------: | :------------: |
|![게시글 검색 ](https://user-images.githubusercontent.com/57751515/152991035-7497ccfd-f27a-4757-8bab-daa3fcc2cfe7.gif)|![이미지 원본 보기](https://user-images.githubusercontent.com/57751515/152997533-1e51372a-a363-4657-8601-8613ff8a75db.gif)|

- Coroutine과 Job을 이용해 EditTex의 실시간 쿼리를 감지하여 검색하는 Instant Search 구현
   -  모든 쿼리의 변화를 감지해 call을 보내고 return을 받으면 동작이 무거워지고 정확한 쿼리 검색이 이루어지지 않을 수 있어서 rxJava의 debounce와 비슷한 기능을 하도록 0.5초 딜레이를 주어 동작 수행
- [ViewPager2](https://developer.android.com/jetpack/androidx/releases/viewpager2)를 이용해 게시글 이미지의 원본 이미지를 슬라이드 형태로 조회 구현
## 사용자 게시글 활동
<img src="https://user-images.githubusercontent.com/57751515/145671445-d73b7773-a174-4c54-bbe4-b9c157769e54.gif"  width="40%">

- 내가 쓴 글 / 댓글 남긴 글 / 스크랩한 글 확인 가능

## 환경설정 - 로그아웃
<img src="https://user-images.githubusercontent.com/57751515/145671525-50078bad-d1f5-4ef1-b5d0-e6cb239e8afb.gif"  width="40%">

- 환경설정 다른 기능 추가 구현 예정
  
## +) 캘린더 (디자인 수정 필요)
| 스케줄 조회 | 근무 타입 추가 | 스케줄 편집 모드 |
| :------------: | :------------: | :------------: |
|![캘린더 조회](https://user-images.githubusercontent.com/57751515/135029443-f2cf2bd8-a6fe-4a5e-88b6-f32492813743.png)|![근무 타입 추가](https://user-images.githubusercontent.com/57751515/135030945-7a1771d4-40b0-40fa-9a70-17a709c7925a.gif)|![스케줄 편집 모드](https://user-images.githubusercontent.com/57751515/135030150-b1be08c6-d9f0-4af2-848c-77db52cf4b33.gif)|

- [Realm](https://github.com/realm)을 사용해 로컬 DB 구성
- [CalendarViewPager](https://github.com/kuluna/CalendarViewPager)로 캘린더 화면 구성
- 근무 타입 추가 시, 근무 타입 타이틀과 시간을 사용자가 입력하면 DB에 Shift가 저장되고 바로 리사이클러 뷰에 반영
- 스케줄 편집 모드에서는 하단 근무 편집 다이얼로그를 통해 연속으로 스케줄 추가가 가능

## 🔧 App Version

targetSdkVersion 30 / minSdkVersion 21 

# 🛶 Tech Stack

## 🏛️ Architecture

- MVVM

## 📚 Libraries

- Android Jetpack
  - [Navigation](https://developer.android.com/jetpack/androidx/releases/navigation)
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
  - [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle)
  - [DataBinding](https://developer.android.com/topic/libraries/data-binding)
  - [ViewPager2](https://developer.android.com/jetpack/androidx/releases/viewpager2)
- [Retrofit2](https://square.github.io/retrofit/) : 네트워킹
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) : 비동기 처리
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-jetpack) : 의존성 주입
- [Realm](https://github.com/realm) : 데이터베이스
