# OffOff_Android
๐ฉโโ๏ธ ๊ฐํธ์ฌ, ๊ฐํธ์ ๊ณตํ์๋ค์ ์ํ ์ปค๋ฎค๋ํฐ ์ดํ๋ฆฌ์ผ์ด์ ๐จโโ๏ธ

# ๐ Function
[Android] ์ปค๋ฎค๋ํฐ ๊ธฐ๋ฅ ๋ฐ ๋ด๋ถํ์คํธ v1.0.1-beta๊น์ง ๊ตฌํํ ๋ด์ฉ

## ๋ก๊ทธ์ธ ๋ฐ ํ์๊ฐ์
| ๋ก๊ทธ์ธ | ์๋ ๋ก๊ทธ์ธ | ํ์๊ฐ์ |
| :------------: | :------------: | :------------: |
|![-์คํ๋์๋ฐ๋ก๊ทธ์ธ](https://user-images.githubusercontent.com/57751515/145573892-727d1e85-a2dc-492e-8f8d-ced78ce7dc29.gif)|![์๋๋ก๊ทธ์ธ](https://user-images.githubusercontent.com/57751515/145573911-d1e29bbe-2641-4d0c-ab80-ddc4b07e821e.gif)|![ํ์๊ฐ์](https://user-images.githubusercontent.com/57751515/145573973-fa44ce98-55b7-4be3-9340-d9c56ec42997.gif)|

- [Retorofit2](https://square.github.io/retrofit/)๋ฅผ ์ด์ฉํ ์๋ฒ ํต์ ์ผ๋ก ํ์๊ฐ์, ๋ก๊ทธ์ธ ๊ตฌํ
- Coroutine, LiveData, Flow๋ฅผ ์ด์ฉํ ๋ฐ์ํ UI 
- [Shared Preferences](https://developer.android.com/training/data-storage/shared-preferences)๋ก ํค-๊ฐ ํํ๋ก Bearer token์ ์ ์ฅํด ์๋ ๋ก๊ทธ์ธ

## 4๊ฐ์ ๋ค๋น๊ฒ์ด์ ํญ
<img src="https://user-images.githubusercontent.com/57751515/145574417-211e9d17-91e9-4ee9-b8db-73571c685e09.gif"  width="40%">

- [Navigation](https://developer.android.com/guide/navigation)์ ํตํด ๋ฐํ ๋ค๋น๊ฒ์ด์ ๋ทฐ๋ฅผ ์ด์ฉํ ํ๋๊ทธ๋จผํธ ์ ํ ๊ฐ๋ฅ
- ๋ฉ์ธ ํ๋ฉด๊ณผ ์บ๋ฆฐ๋ ํ๋ฉด์ ๊ธฐ๋ฅ๊ณผ ๋์์ธ์ ๋ณด์ํด ์ถํ ์๋ฐ์ดํธ ์์ 
- ํ๊ฒฝ์ค์  ํญ๋ ๋ก๊ทธ์์ ์ธ์ ์ฌ๋ฌ ๊ธฐ๋ฅ์ ์ถ๊ฐํด ์๋ฐ์ดํธ ์์ 

## ๊ฒ์ํ ๋ฐ ๊ฒ์๊ธ ์์ฑ / ์ญ์  ๋ฑ์ ํ๋
| ๊ฒ์ํ | ๊ฒ์๊ธ ์์ฑ | ๊ฒ์๊ธ ์ญ์  |
| :------------: | :------------: | :------------: |
|![๊ฒ์๊ธ๋ฆฌ์คํธ](https://user-images.githubusercontent.com/57751515/145574890-4f4e90c8-c44f-48ee-8a38-ab511b8f3fbd.gif)|![๊ธ์ฐ๊ธฐ](https://user-images.githubusercontent.com/57751515/145574902-e4e7e044-f975-4550-8204-68c146a08ea0.gif)|![๋ด๊ฒ์๊ธ๊ฒฝ์ฐ](https://user-images.githubusercontent.com/57751515/145670444-89b91353-d576-44cf-8172-7a4132c1ce26.gif)|

- SwipeRefreshLayout์ ํตํด swipe์ ์๋ฒ์์ ์ต์  ๋ฆฌ์คํธ๋ฅผ ์๋ก ๋ถ๋ฌ์ ์ถ๋ ฅ
- ๋ฌดํ ์คํฌ๋กค -> ์คํฌ๋กค์ด ์ตํ๋จ์ ๋๋ฌํ๋ฉด ๋ถ๋ฌ์จ ๋ง์ง๋ง ๊ฒ์๊ธ ์์ด๋๋ฅผ ๊ธฐ์ค์ผ๋ก ๊ทธ ์ดํ์ ๊ฒ์๊ธ ๋ฆฌ์คํธ๋ฅผ ์ถ๊ฐ๋ก ๋ถ๋ฌ์ด
- ์๋ฒ์์ ํต์  ์ฑ๊ณต ์๋ต์ ๋ฐ๊ธฐ ์ ๊น์ง ProgressBar๋ฅผ ํฌํจํ ๋ ์ด์์์ includeํ๊ฑฐ๋ ๋ค์ด์ผ๋ก๊ทธ๋ฅผ ๋์ ๋ก๋ฉ ํ๋ฉด ๊ตฌํ

## ๊ฒ์๊ธ ๊ณต๊ฐ / ์คํฌ๋ฉ / ์ ๊ณ  ๋ฐ ๋๊ธ
| ๊ฒ์ํ ์ข์์ / ์คํฌ๋ฉ / ์ ๊ณ  | ๋๊ธ ์์ฑ ๋ฐ ์ญ์  / ์ข์์ |
| :------------: | :------------: |
|![๊ฒ์๊ธ๊ณต๊ฐ์คํฌ๋ฉ์ ๊ณ ](https://user-images.githubusercontent.com/57751515/145670440-06045d13-441f-47bb-bffa-d9302c5749fa.gif)|![๋๊ธ์คํฌ๋กค๋ฐ์ข์์์ ๊ณ ](https://user-images.githubusercontent.com/57751515/145670627-a6b0d7b0-d87d-4101-bd3f-b7076efdd7a5.gif)|

- ๊ฒ์๊ธ ๋๋ ๋๊ธ ์ข์์ ์ ํ๋ฉด ๋ด ์ข์์ ์ซ์ + 1
- ํ๋ฉด ์คํฌ๋กค ์กฐ์
```kotlin
object ScrollViewUtils {

    // ํด๋น ๋ทฐ๊น์ง ์คํฌ๋กค์ ๋ถ๋๋ฝ๊ฒ ์ด๋
    fun NestedScrollView.smoothScrollToView(view: View, marginTop: Int = 0) {
        val y = calculateDistance(view) - marginTop
        ObjectAnimator.ofInt(this, "scrollY", y).apply {
            duration = 1000L
        }.start()
    }

    // ์คํฌ๋กค๋ทฐ์ ํด๋น ๋ทฐ ์ฌ์ด์ ๊ฑฐ๋ฆฌ ๊ณ์ฐ
    private fun NestedScrollView.calculateDistance(view: View): Int {
        return kotlin.math.abs(
            calculateView(this).top - (this.scrollY + calculateView(
                view
            ).top)
        )
    }

    // ์คํฌ๋ฆฐ ๋ด์ ๋ทฐ ์ ๋ ์ขํ ๊ณ์ฐ
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

 - ์คํฌ๋กค ์ด๋ ์์๋ ๋ณด์ด๊ฒ ํ๊ณ  ์ถ์ ๋๊ธ ๋ทฐ ์์น๋ฅผ ๊ณ์ฐํด ์ ์ ํ ์์น๋ก 1์ด ๋์ ๋ถ๋๋ฝ๊ฒ ์ด๋
   - ์๋ก์ด ๋๊ธ ์์ฑ ์ ํ๋ฉด ๋งจ ํ๋จ์ผ๋ก ์คํฌ๋กค ์ด๋
   - ๋๋๊ธ์ ๋ฌ๊ธฐ ์ํ ๋๊ธ ์ ํ ์ ์ ํํ ๋๊ธ์ด ํค๋ณด๋ ์๋ก ๋ณด์ด๋๋ก ์คํฌ๋กค ์ด๋
   - ์๋ก์ด ๋๋๊ธ ์์ฑ ์ ํด๋น ๋๋๊ธ์ด ํ๋ฉด์ ๋ณด์ด๋๋ก ์คํฌ๋กค ์ด๋

## ๊ฒ์๊ธ ๊ฒ์ ๋ฐ ์ด๋ฏธ์ง ์๋ณธ ๋ณด๊ธฐ
| ๊ฒ์๊ธ ๊ฒ์ | ์ด๋ฏธ์ง ์๋ณธ ๋ณด๊ธฐ |
| :------------: | :------------: |
|![๊ฒ์๊ธ ๊ฒ์ ](https://user-images.githubusercontent.com/57751515/152991035-7497ccfd-f27a-4757-8bab-daa3fcc2cfe7.gif)|![์ด๋ฏธ์ง ์๋ณธ ๋ณด๊ธฐ](https://user-images.githubusercontent.com/57751515/152997533-1e51372a-a363-4657-8601-8613ff8a75db.gif)|

- Coroutine๊ณผ Job์ ์ด์ฉํด EditTex์ ์ค์๊ฐ ์ฟผ๋ฆฌ๋ฅผ ๊ฐ์งํ์ฌ ๊ฒ์ํ๋ Instant Search ๊ตฌํ
   -  ๋ชจ๋  ์ฟผ๋ฆฌ์ ๋ณํ๋ฅผ ๊ฐ์งํด call์ ๋ณด๋ด๊ณ  return์ ๋ฐ์ผ๋ฉด ๋์์ด ๋ฌด๊ฑฐ์์ง๊ณ  ์ ํํ ์ฟผ๋ฆฌ ๊ฒ์์ด ์ด๋ฃจ์ด์ง์ง ์์ ์ ์์ด์ rxJava์ debounce์ ๋น์ทํ ๊ธฐ๋ฅ์ ํ๋๋ก 0.5์ด ๋๋ ์ด๋ฅผ ์ฃผ์ด ๋์ ์ํ
- [ViewPager2](https://developer.android.com/jetpack/androidx/releases/viewpager2)๋ฅผ ์ด์ฉํด ๊ฒ์๊ธ ์ด๋ฏธ์ง์ ์๋ณธ ์ด๋ฏธ์ง๋ฅผ ์ฌ๋ผ์ด๋ ํํ๋ก ์กฐํ ๊ตฌํ
## ์ฌ์ฉ์ ๊ฒ์๊ธ ํ๋
<img src="https://user-images.githubusercontent.com/57751515/145671445-d73b7773-a174-4c54-bbe4-b9c157769e54.gif"  width="40%">

- ๋ด๊ฐ ์ด ๊ธ / ๋๊ธ ๋จ๊ธด ๊ธ / ์คํฌ๋ฉํ ๊ธ ํ์ธ ๊ฐ๋ฅ

## ํ๊ฒฝ์ค์  - ๋ก๊ทธ์์
<img src="https://user-images.githubusercontent.com/57751515/145671525-50078bad-d1f5-4ef1-b5d0-e6cb239e8afb.gif"  width="40%">

- ํ๊ฒฝ์ค์  ๋ค๋ฅธ ๊ธฐ๋ฅ ์ถ๊ฐ ๊ตฌํ ์์ 
  
## +) ์บ๋ฆฐ๋ (๋์์ธ ์์  ํ์)
| ์ค์ผ์ค ์กฐํ | ๊ทผ๋ฌด ํ์ ์ถ๊ฐ | ์ค์ผ์ค ํธ์ง ๋ชจ๋ |
| :------------: | :------------: | :------------: |
|![์บ๋ฆฐ๋ ์กฐํ](https://user-images.githubusercontent.com/57751515/135029443-f2cf2bd8-a6fe-4a5e-88b6-f32492813743.png)|![๊ทผ๋ฌด ํ์ ์ถ๊ฐ](https://user-images.githubusercontent.com/57751515/135030945-7a1771d4-40b0-40fa-9a70-17a709c7925a.gif)|![์ค์ผ์ค ํธ์ง ๋ชจ๋](https://user-images.githubusercontent.com/57751515/135030150-b1be08c6-d9f0-4af2-848c-77db52cf4b33.gif)|

- [Realm](https://github.com/realm)์ ์ฌ์ฉํด ๋ก์ปฌ DB ๊ตฌ์ฑ
- [CalendarViewPager](https://github.com/kuluna/CalendarViewPager)๋ก ์บ๋ฆฐ๋ ํ๋ฉด ๊ตฌ์ฑ
- ๊ทผ๋ฌด ํ์ ์ถ๊ฐ ์, ๊ทผ๋ฌด ํ์ ํ์ดํ๊ณผ ์๊ฐ์ ์ฌ์ฉ์๊ฐ ์๋ ฅํ๋ฉด DB์ Shift๊ฐ ์ ์ฅ๋๊ณ  ๋ฐ๋ก ๋ฆฌ์ฌ์ดํด๋ฌ ๋ทฐ์ ๋ฐ์
- ์ค์ผ์ค ํธ์ง ๋ชจ๋์์๋ ํ๋จ ๊ทผ๋ฌด ํธ์ง ๋ค์ด์ผ๋ก๊ทธ๋ฅผ ํตํด ์ฐ์์ผ๋ก ์ค์ผ์ค ์ถ๊ฐ๊ฐ ๊ฐ๋ฅ

## ๐ง App Version

targetSdkVersion 30 / minSdkVersion 21 

# ๐ถ Tech Stack

## ๐๏ธ Architecture

- MVVM

## ๐ Libraries

- Android Jetpack
  - [Navigation](https://developer.android.com/jetpack/androidx/releases/navigation)
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
  - [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle)
  - [DataBinding](https://developer.android.com/topic/libraries/data-binding)
  - [ViewPager2](https://developer.android.com/jetpack/androidx/releases/viewpager2)
- [Retrofit2](https://square.github.io/retrofit/) : ๋คํธ์ํน
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) : ๋น๋๊ธฐ ์ฒ๋ฆฌ
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-jetpack) : ์์กด์ฑ ์ฃผ์
- [Realm](https://github.com/realm) : ๋ฐ์ดํฐ๋ฒ ์ด์ค
