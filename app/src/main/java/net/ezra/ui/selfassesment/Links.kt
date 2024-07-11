package net.ezra.ui.selfassessment



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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.ui.theme.defaultTextStyle


@Composable
fun LinksScreen(navController: NavHostController) {




    Column (
        modifier = Modifier
            .background(Color(0xffD98880))
            .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ){
        Image(
            painter = painterResource(id = R.drawable.img_20),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)

        )
        Spacer(modifier = Modifier.height(50.dp))

Text(
    modifier = Modifier,
    textAlign = TextAlign.Center,
    text = "Here are some links to Web pages that will give you access to more information about Mental health")
        Spacer(modifier = Modifier.height(50.dp))

        Text("1. Harvard Health (https://www.health.harvard.edu/topics/mental-health/all) ")

        Spacer(modifier = Modifier.height(50.dp))
        
        Text(text = "2. SAMSHA (https://www.samhsa.gov/mental-health)")

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_ABOUT) { inclusive = true }
                    }
                },
            text = "Home",
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = MaterialTheme.colorScheme.onSurface
        )
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LinksScreen() {
    LinksScreen(rememberNavController())
}

