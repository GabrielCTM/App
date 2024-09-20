package com.example.project1

import android.annotation.SuppressLint
import android.graphics.Picture
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.project1.R
import com.example.project1.ui.theme.Project1Theme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project1.ui.screens.HomeScreen
import com.example.project1.ui.screens.MenuScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Switch

//import androidx.navigation.compose.NavHostController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            GuitarTunerApp()

               // ComposeMultiScreenApp()
        }
    }//
}//
/*Column(
    //LA columna pasa a tener el tamaño maximo de la pantalla
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
) {
    CustomText()
    Picture()
    Content1()
    Content2()
    //Text(text = "Simple text")
    //ModifierExample()
    //ModifierExample2()
    //ModifierExample3()
}
//Layout
/*Column {
    Text(text = "First Row")
    Text(text = "Second Row")
    Text(text = "Third Row")
    Row {
        Text(text = "Among OS")
        Text(text = " Among OS 2")
        Text(text = " Among OS 3: The revenge")
        Text(text = " Among OS 4: The end game")
    }
    Box {
        Text(text = "Label 1")
        Text(text = "Label 2")
    }
    Greeting(name = "World")
}
Column {
    Row {
        Text(text = "Hola")
    }
}*/
/*Project1Theme {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Greeting(
            name = "Android",
            modifier = Modifier.padding(innerPadding)
        )
    }
}*/
}
}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
Text(
text = "Hello $name!",
modifier = modifier
)
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
Project1Theme {
Greeting("Gabriel")
}
}

//@Preview(showBackground = true)
@Composable
fun ModifierExample() {
Column(
modifier = Modifier
.padding(24.dp)
) {
Text(text = "Hello world")
}
}

/*@Preview(showBackground = true)
@Composable //Comopasble es de diseño solamente
fun ModifierExample2() {
Column(
modifier = Modifier
.padding(24.dp)
.fillMaxWidth()
.clickable(onClick = { clickAction() })
) {
Text(text = "Hello world")
}
}*/

@Preview(showBackground = true)
@Composable //Comopasble es de diseño solamente
fun ModifierExample3() {
Column(
modifier = Modifier
.fillMaxHeight()
.padding(16.dp)
.background(Color.Magenta)
.border(width = 2.dp, color = Color.Blue)
.width(200.dp),
horizontalAlignment = Alignment.CenterHorizontally,
verticalArrangement = Arrangement.SpaceEvenly
) {
Text(text = "Item 1")
Text(text = "Item 2")
Text(text = "Item 3")
Text(text = "Item 4")
Text(text = "Item 5")
}
}

@Preview(showBackground = true)
@Composable
fun CustomText() {
Column {
Text(
stringResource(R.string.hello_world_text),
color = colorResource(R.color.teal_700),
fontSize = 28.sp,
fontStyle = FontStyle.Italic,
fontWeight = FontWeight.Thin
)
val gradientColors = listOf(Cyan, Blue)
Text(
stringResource(R.string.hello_world_text),
style = TextStyle(brush = Brush.linearGradient(colors = gradientColors))
)
}
}

//@Preview(showBackground = true)
@Composable
fun Picture() {
Column(
modifier = Modifier
.fillMaxHeight()
.background(Color.Black)
) {
Image(
modifier = Modifier
    .fillMaxWidth(),
painter = painterResource(R.drawable.android_logo),
contentDescription = "Android logo",
contentScale = ContentScale.Crop
)
}
}

//@Preview(showBackground = true)
@Composable
fun Content1(){
Card(modifier = Modifier
.background(Color.LightGray)
.fillMaxWidth()
.padding(5.dp)
){
Text(text = "This is a title",
fontSize = 24.sp,
fontWeight = FontWeight.Bold,
modifier = Modifier
    .padding(10.dp)
)
Image(
modifier = Modifier
    .fillMaxWidth()
    .height(200.dp),
painter = painterResource(id = R.drawable.android_logo),
contentDescription = "Android Logo",
contentScale = ContentScale.Crop
)
Text(
stringResource(R.string.text_card),
textAlign = TextAlign.Justify,
lineHeight = 10.sp,
modifier = Modifier
    .padding(10.dp)
)
}
}

@Preview(showBackground = true)
@Composable
fun Content2(){
Card(modifier = Modifier
.background(Color.LightGray)
.fillMaxWidth()
.padding(5.dp)) {

Column {

Row {
    Image(modifier = Modifier
        //.fillMaxWidth()
        .height(150.dp),
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = "Android Logo",
        contentScale = ContentScale.Crop)
    Column {
        Text(text = "This is a title",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)
        )
        Text(stringResource(R.string.text_card),
            textAlign = TextAlign.Justify,
            lineHeight = 10.sp,
            modifier = Modifier
                .padding(10.dp))
    }
}
}
}
}

@Preview(showBackground = true)
@Composable
fun BoxExample1() {
Box(
modifier = Modifier
.background(Color.DarkGray)
.fillMaxWidth()
.padding(5.dp)
){
Image(painterResource(R.drawable.android_logo),
contentDescription = "Android Logo",
contentScale = ContentScale.FillBounds
)
Row(
modifier = Modifier
    .fillMaxWidth()
    .padding(0.dp, 150.dp),
horizontalArrangement = Arrangement.Center
){
Icon(
    Icons.Filled.AccountCircle,
    contentDescription = "Icon Account"
)
Text(text = "Text",

    )
}

}
}

@Preview(showBackground = true)
@Composable
fun BoxExample2(){
Box(modifier = Modifier
.background(Color.Magenta)
.padding(5.dp)
.size(250.dp)
){
Text(text = "TopStart", Modifier.align(Alignment.TopStart))
Text(text = "TopEnd", Modifier.align(Alignment.TopEnd))
Text(text = "CenterStart", Modifier.align(Alignment.CenterStart))
Text(text = "Center", Modifier.align(Alignment.Center))
Text(text = "CenterEnd", Modifier.align(Alignment.CenterEnd))
Text(text = "BottomStart", Modifier.align(Alignment.BottomStart))
Text(text = "BottomEnd", Modifier.align(Alignment.BottomEnd))
}
}

fun clickAction() {
println("Column clicked")
}*/

/*@Composable
fun ComposeMultiScreenApp(){
    val navController = rememberNavController()
    Surface(color = Color.White) {
        SetupNavGraph(navController = navController)
    }
}

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") { MenuScreen(navController) }
        composable("home") { HomeScreen(navController) }
    }
}*/



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun GuitarTunerApp() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Canciones", "Herramientas", "Afinar", "Aprendizaje", "Configuración")

    val icons = listOf(
        Icons.Default.PlayArrow,
        Icons.Default.Build,
        Icons.Default.Favorite,
        Icons.Default.Home,
        Icons.Default.Settings
    )

    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = colorResource(id = R.color.geras),
                //.background(color = colorResource(id = R.color.uriel)) //
                //.background(Color(0xFF1B1C1E))
                tonalElevation = 8.dp
            ) {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = {
                            Icon(icons[index], contentDescription = item)
                        },
                        label = { Text(item) },
                        selected = selectedItem == index,
                        onClick = { selectedItem = index },
                        alwaysShowLabel = true
                    )
                }
            }
        }
    ) { innerPadding ->

        Box(

            modifier = Modifier
                .fillMaxSize()
                //.background(color = colorResource(id = R.color.uriel)) //
                .background(Color(0xFF1B1C1E))
                .padding(innerPadding)
        ) {

            Image(
                painter = painterResource(id = R.drawable.guitar_head_image),
                contentDescription = null,
                modifier = Modifier
                    .size(
                        width = 400.dp,
                        height = 700.dp
                    )
                    //.width(400.dp)
                    //.height(610.dp)
                    //.aspectRatio(1f)
                    .align(Alignment.BottomEnd),
                contentScale = ContentScale.FillBounds
            )

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "guitarTuna",
                            color = Color.Green,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Guitarra 6 cuerdas >",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                        Text(
                            text = "Estándar",
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "AUTOM.",
                            color = Color.Gray,
                            fontSize = 14.sp,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Switch(
                            checked = true,
                            onCheckedChange = {},
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color.White,
                                uncheckedThumbColor = Color.Green
                            )
                        )
                    }
                }

            }
        }
    }
}
