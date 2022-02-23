# DualPrevent

## Description

DualPrevent is a library that gives you power over your app when a user clones the app.

## Features

* Know when a user clones an android app
* Control what happens when an app is cloned
* Control what happens when an app is not cloned

## Setup

To get a Git project into your build:

1. Add the JitPack repository to you root build.gradle at the end of repositories for Android Studio before Artic Fox:

```kotlin
allprojects {
    repositories {
	...
	maven { url 'https://jitpack.io' }
    }
}

For Android Studio Artic Fox and later add JitPack repository to you root settings.gradle

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
2. Add the dependency

```kotlin
dependencies {
    implementation 'com.github.gbindinazeez:DualPrevent:v1.0.0'
}
```
## Usage

1. To check for dual app

```kotlin
     CheckCloning.checkAppCloning(context, onAppCloned = { }, onAppNotCloned = { })
```

2. To close the app

```kotlin
     CheckCloning.killProcess(activity)
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.


## License
MIT Licence

Copyright (c) [2022] Abdulazeez Gbindinninuola

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


## Author Info

[@gbindinazeez](https://twitter.com/gbindinazeez)
