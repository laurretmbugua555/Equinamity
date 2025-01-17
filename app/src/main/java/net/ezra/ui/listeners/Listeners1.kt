package net.ezra.ui.listeners



import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R



@Composable
fun Listeners1Screen(navController: NavHostController,

) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffF8BBD0)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_20),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Our app gives you access to links where you can reach out to qualified free listeners who are ready to give you a listening ear when experiencing mental or emotional instability, you can also register as a listener",

            fontSize = 20.sp,
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,



            )
        Text(text ="1. 7 Cups (https://www.7cups.com/)" )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "2. Buddy Help (https://buddyhelp.org/)")

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "3. Truth Share (https://truthshare.com.ng/free-online-therapist/)")

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "4. By My Side (https://bymyside.support/)")

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_ABOUT) { inclusive = true }
                    }
                },
            text = "Home",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
    }







}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    Listeners1Screen(rememberNavController())
}
