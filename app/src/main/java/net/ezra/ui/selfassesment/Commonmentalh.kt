package net.ezra.ui.selfassessment

import android.content.ClipData.Item
import android.content.res.Configuration
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
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.navigation.ROUTE_HOMEMH


@Composable
fun CommonScreen(navController: NavHostController) {

    LazyRow(

        modifier = Modifier

            .background(Color(0xffD98880))
            .fillMaxSize(),
    ) {
        item {
            Column (modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffD98880))
            ){

                Row {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_10),
                            contentDescription = null,
                            modifier = Modifier
                                .size(200.dp)

                        )
                        Text(text = "Anxiety Disorder")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_10),
                            contentDescription = null,
                            modifier = Modifier
                                .size(200.dp)

                        )
                        Text(text = "Borderline Personality Disorder")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_12),
                            contentDescription = null,
                            modifier = Modifier
                                .size(200.dp)

                        )
                        Text(text = "Bipolar Disorder")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_13),
                            contentDescription = null,
                            modifier = Modifier
                                .size(200.dp)

                        )
                        Text(text = "Attention Deficit")


                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = null,
                            modifier = Modifier
                                .size(200.dp)

                        )
                        Text(text = "Schizophrenia")
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }
            }
            Row {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_15),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                    )
                    Text(text = "Obsessive compulsive Disorder ")

                }
                Spacer(modifier = Modifier.width(10.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_16),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                    )
                    Text(text = "Dementia")
                    Spacer(modifier = Modifier.width(10.dp))
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_17),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                    )
                    Text(text = "Post Traumatic Disorder")

                }
                Spacer(modifier = Modifier.width(10.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_18),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                    )
                    Text(text = "Clinical Depression")



                }
                Spacer(modifier = Modifier.width(10.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_19),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                    )
                    Text(text = "Autism")



                }
                Spacer(modifier = Modifier.width(10.dp))
            }
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

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun CommonScreen() {
    CommonScreen(rememberNavController())
}


