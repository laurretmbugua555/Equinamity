package net.ezra.ui.about

import android.content.res.Configuration
import android.widget.Spinner
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_THERAPISTS1SCREEN


@Composable
fun AboutScreen(navController: NavHostController) {




    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffD7BDE2)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.logo1),
            contentDescription = null,

            modifier = Modifier
                .size(100.dp)

        )
        Text(
            modifier = Modifier,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,

            text = "About our Application ;)")

Text(
modifier = Modifier,
    fontSize = 10.sp,
    fontWeight = FontWeight.Bold,

    text = "Equanimity is a comprehensive mental health app designed to support your emotional and mental well-being. With features like access to personalized cognitive-behavioral therapy exercises, Equanimity empowers you to manage stress, anxiety, and depression effectively. Connect with licensed therapists for virtual counseling sessions,free listeners, join supportive communities, and access a library of self-help resources to nurture your mental health anytime, anywhere. Your path to a healthier mind starts with us."
        )

        Spacer(modifier = Modifier.width(50.dp))

        Text(
            modifier = Modifier,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,

            text = "Our Values ;)")


        LazyRow(){
     item {
         Row {
             Column(
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center
                 ) {
                 Image(
                     painter = painterResource(id = R.drawable.img_9),
                     contentDescription = null,

                     modifier = Modifier
                         .size(100.dp)

                 )
                 Text(
                     modifier = Modifier,
                     text = "Togetherness",
                     textAlign = TextAlign.Center,
                     fontWeight = FontWeight.Bold,
                     color = MaterialTheme.colorScheme.onSurface
                 )
             }
             Column(
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center
             ) {
                 Image(
                     painter = painterResource(id = R.drawable.img_21),
                     contentDescription = null,

                     modifier = Modifier
                         .size(100.dp)

                 )
                 Text(
                     modifier = Modifier,
                     text = "Empathy",
                     textAlign = TextAlign.Center,
                     fontWeight = FontWeight.Bold,
                     color = MaterialTheme.colorScheme.onSurface
                 )
             }
             Column(
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center
             ) {
                 Image(
                     painter = painterResource(id = R.drawable.img_22),
                     contentDescription = null,

                     modifier = Modifier
                         .size(100.dp)

                 )
                 Text(
                     modifier = Modifier,
                     text = "Understanding",
                     textAlign = TextAlign.Center,
                     fontWeight = FontWeight.Bold,
                     color = MaterialTheme.colorScheme.onSurface
                 )
             }


         }
     }
 }

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
            color = Color.Black,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold
        )

    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

