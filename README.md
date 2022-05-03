# CircleImageCompose [![](https://jitpack.io/v/azmiradi/CircleImageCompose.svg)](https://jitpack.io/#azmiradi/CircleImageCompose)
A simple library for create circular image in Jetpack Compose to use it for profile image or any other use

## Screenshot Picture -

<p align="center">
  <img src="https://github.com/azmiradi/CircleImageCompose/blob/master/screenshot.png" width="350" title="Screen mobile"> 
</p>


## Usage

#### Step 1

Add the JitPack repository to your `build.gradle ` file:

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

#### Step 2

Add the dependency:

```gradle
dependencies {
    	   implementation 'com.github.azmiradi:CircleImageCompose:0.1.0'
}
```

 
#### Step 3

Use `CircularImage` in your Compose Function: can use it with border or without, can make it clickable or not

        val context= LocalContext.current
        Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
             CircleImage(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "", size = 150.dp,
                borderStroke = BorderStroke(5.dp, Color.Red),
                )

            CircleImage(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "", size = 150.dp
            )

            CircleImage(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "", size = 150.dp,
                clickable = true,
                onClickImage = {
                   Toast.makeText(context,"Hi From Circle Image",Toast.LENGTH_SHORT).show()
                },
            )
        }
        
#### Parameters 
- painter -> set your image
- size -> set circler size by dp unit 
- borderStroke -> set border strok if you need to add border to image or not 
- clickable -> make circler is clickable or not if clickable set true else set false
- onClickImage -> function that return clickable listiner

Take a look at the [sample app](https://github.com/azmiradi/CircleImageCompose/tree/master/app) to see the library working.

## Contributing

If you find any issues or you have any questions, ideas... feel free to [open an issue](https://github.com/azmiradi/CircleImageCompose/issues/new).
Pull request are very appreciated.

## License

Copyright (c) 2020 Azmi Radi Azmi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
