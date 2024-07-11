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
import net.ezra.navigation.ROUTE_COMMONMENTALH
import net.ezra.navigation.ROUTE_HOMEMH
import net.ezra.navigation.ROUTE_LINKS
import net.ezra.navigation.ROUTE_LISTENERS1SCREEN
import net.ezra.navigation.ROUTE_SELFTEST
import net.ezra.navigation.ROUTE_THERAPISTS1SCREEN


@Composable
fun HomemhScreen(navController: NavHostController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff512E5F)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            modifier = Modifier,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,

            text = "WELCOME TO SELF-ASSESSMENT!"
        )


        Spacer(modifier = Modifier.height(30.dp))


        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_LINKS) {
                        popUpTo(ROUTE_HOMEMH) { inclusive = true }
                    }
                },
            text = "Links to articles on Mental health issues",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.onSurface

        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(
                        ROUTE_COMMONMENTALH
                    ) {
                        popUpTo(ROUTE_HOMEMH) { inclusive = true }
                    }
                },
            text = "Common Mental health issues",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_HOMEMH) { inclusive = true }
                    }
                },
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            text = "Home",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomemhScreen() {
    HomemhScreen(rememberNavController())
}

