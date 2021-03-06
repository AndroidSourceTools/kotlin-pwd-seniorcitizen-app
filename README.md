# PWD/SENIOR CITIZEN MOBILE APP

Development of pwd/senior citizen id and card

- [x] Kotlin

### Prerequisites

[`This project requires Android Studio version 3.6 or higher.`] 

## Getting Started

There are a few ways to open this project.

### Android Studio

1. Android Studio -> File -> New -> From Version control -> Git
2. Enter `https://github.com/blackchalk/kotlin-pwd-seniorcitizen-app.git` into URL field

# Highlights

1. Create/Read/Update User(PWD/Seniors) 
2. Scan QR code receipt generated by pos
3. Record and View transaction history
4. View individual transactions

#### The app has following packages:
1. **data**: It contains all the data accessing and manipulating components.
2. **di**: Dependency providing classes using Dagger2.
3. **ui**: View classes along with their corresponding ViewModel.
4. **utils**: Utility classes.

The whole application is built based on the MVVM architectural pattern.

# Application Architecture
![alt text](https://cdn-images-1.medium.com/max/1600/1*OqeNRtyjgWZzeUifrQT-NA.png)

The main advatage of using MVVM, there is no two way dependency between ViewModel and Model unlike MVP. Here the view can observe the datachanges in the viewmodel as we are using LiveData which is lifecycle aware. The viewmodel to view communication is achieved through observer pattern (basically observing the state changes of the data in the viewmodel).


## Libraries, tools used

* [Architecture Components](https://developer.android.com/topic/libraries/architecture/index.html) ([LiveData](https://developer.android.com/topic/libraries/architecture/livedata.html), [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel.html), [Android Navigation Component](https://developer.android.com/guide/navigation) based navigation, [Room Persistence](https://developer.android.com/topic/libraries/architecture/room.html))
* [Android Data Binding](https://developer.android.com/topic/libraries/data-binding/index.html)
* [Dagger2](https://github.com/google/dagger) for dependency injection
* [RxJava](https://github.com/ReactiveX/RxJava) & [RxAndroid](https://github.com/ReactiveX/RxAndroid) for composing asynchronous and event-based programming
* [Retrofit](https://github.com/square/retrofit) for a type-safe HTTP client
* [OkHttp](https://github.com/square/okhttp) for HTTP & HTTP/2 client
* [GSON](https://github.com/google/gson) for JSON Serialization
* [Stetho](https://github.com/facebook/stetho) for network inspection
* [LeakCanary](https://github.com/square/leakcanary) for memory leak detection
* [Qrcodereaderview](https://github.com/dlazaro66/Qrcodereaderview) for QR code decoding

## Screen shots
Unavailable
