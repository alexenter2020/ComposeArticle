package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleImage(
                        title = stringResource(R.string.title_jetpack_compose_tutorial),
                        text1 = stringResource(R.string.compose_short_desc),
                        text2 = stringResource(R.string.compose_long_desc)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "My Preview")
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        ArticleImage(
            title = "Jetpack Compose tutorial",
            text1 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose " +
                    "simplifies and accelerates UI development on Android with less code, powerful " +
                    "tools, and intuitive Kotlin APIs.",
            text2 = "In this tutorial, you build a simple UI component with declarative functions. " +
                    "You call Compose functions to say what elements you want and the Compose " +
                    "compiler does the rest. Compose is built around Composable functions. " +
                    "These functions let you define your app\\'s UI programmatically because they " +
                    "let you describe how it should look and provide data dependencies, rather than " +
                    "focus on the process of the UI\\'s construction, such as initializing an " +
                    "element and then attaching it to a parent. To create a Composable function, " +
                    "you add the @Composable annotation to the function name."
        )
    }
}

@Composable
fun ArticleImage(title: String, text1: String, text2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier,
        verticalArrangement = Arrangement.Top) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = text1,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = text2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

