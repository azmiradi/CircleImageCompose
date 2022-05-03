package com.azmithabet.circleimageviewcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.azmithabet.circleimageviewcompose.ui.theme.CircleImageViewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CircleImageViewComposeTheme {
                 Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CircleImageViewExample()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun CircleImageViewExample() {
    CircleImageViewComposeTheme {
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

    }
}