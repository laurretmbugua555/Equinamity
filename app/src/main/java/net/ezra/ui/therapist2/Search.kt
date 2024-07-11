package net.ezra.ui.therapist2


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.ui.graphics.Color
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SEARCH


data class YourDataClass(

    val id: String? = "",

    val imageUrl: String? = "",
    val therapistName: String? = "",
    val therapistSpecialization: String? = "",
    val phone: String? = "",
    val location: String? = ""

)


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(navController: NavHostController) {
    var searchText by remember { mutableStateOf(TextFieldValue()) }
    var filteredData by remember { mutableStateOf(emptyList<YourDataClass>()) }

    // Firestore reference
    val firestore = Firebase.firestore

    DisposableEffect(searchText.text) {
        val query = firestore.collection("Therapists")
            .whereGreaterThanOrEqualTo("TherapistName", searchText.text)
            .whereLessThanOrEqualTo("TherapistName", searchText.text + "\uf8ff")


        val listener = query.addSnapshotListener { snapshot, error ->
            if (error != null) {
                // Handle error
                return@addSnapshotListener
            }

            snapshot?.let {
                val data = it.toObjects(YourDataClass::class.java)
                filteredData = data
            }
        }

        onDispose {
            listener.remove()
        }
    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Search for registered therapists")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_HOME) {
                            popUpTo(ROUTE_SEARCH) { inclusive = true }
                        }
                    }) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            "backIcon",
                            tint = Color.Black
                        )
                    }
                },



                colors = topAppBarColors(
        containerColor = Color(0xff512E5F),


        titleContentColor = Color.Black,
    ),
            )
        },

        content = {
            Column(

                modifier = Modifier
                    .background(Color(0xffF8BBD0))
                    .fillMaxSize()

            ) {

                Spacer(modifier = Modifier.height(55.dp))

                TextField(
                    value = searchText,
                    onValueChange = { searchText = it },
                    placeholder = { Text("Search by therapist's name..") },
                    modifier = Modifier.fillMaxWidth(),
                    trailingIcon = {
                        Icon(imageVector = Icons.Default.Search,
                            contentDescription = "emailIcon"
                        ) },

                )

                Spacer(modifier = Modifier.height(5.dp))


    LazyVerticalGrid(columns = GridCells.Fixed(2),) {

    items(filteredData) { item ->

        Column (
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                ,
            horizontalAlignment = Alignment.CenterHorizontally

        ){

            SubcomposeAsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(item.imageUrl)
                    .crossfade(true)
                    .build(),
                loading = {
                    CircularProgressIndicator()
                },
                contentDescription = item.therapistName,
                modifier = Modifier
                    .clip(RoundedCornerShape(10))
                    .size(150.dp)

            )

            item.therapistName?.let { Text(text = it) }
            item.phone?.let { Text(text = it) }












        }

    }

}

            }
        },


        )



}

