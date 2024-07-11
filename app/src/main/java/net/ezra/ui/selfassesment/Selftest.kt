package net.ezra.ui.selfassessment


import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_COMMONMENTALH
import net.ezra.R



@Composable
fun SelftestScreen(navController: NavHostController) {




    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffD7BDE2)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

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
fun SelftestScreen() {
    SelftestScreen(rememberNavController())
}

