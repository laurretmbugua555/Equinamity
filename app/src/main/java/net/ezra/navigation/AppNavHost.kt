package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignUpScreen
import net.ezra.ui.dashboard.DashboardScreen
//import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.listeners.Listeners1Screen
import net.ezra.ui.products.AddProductScreen
import net.ezra.ui.products.ProductDetailScreen
import net.ezra.ui.products.ProductListScreen
import net.ezra.ui.selfassessment.CommonScreen
import net.ezra.ui.selfassessment.HomemhScreen
import net.ezra.ui.selfassessment.LinksScreen
import net.ezra.ui.selfassessment.SelftestScreen
import net.ezra.ui.therapist2.AddStudents
import net.ezra.ui.therapist2.Search
import net.ezra.ui.therapist2.Students


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME


) {


    BackHandler {
        navController.popBackStack()

    }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }


        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_VIEW_STUDENTS) {
            Students(navController = navController, viewModel = viewModel() )
        }

        composable(ROUTE_SEARCH) {
            Search(navController)
        }

        composable(ROUTE_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUTE_REGISTER) {
            SignUpScreen(navController = navController) {

            }
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController){}
        }

        composable(ROUTE_ADD_PRODUCT) {
            AddProductScreen(navController = navController){}
        }
        composable(ROUTE_LISTENERS1SCREEN) {
            Listeners1Screen(navController = navController)
        }
        composable(ROUTE_VIEW_PROD) {
            ProductListScreen(navController = navController, products = listOf() )
        }
        composable(ROUTE_SELFTEST) {
            SelftestScreen(navController = navController)
        }
        composable(ROUTE_HOMEMH) {
            HomemhScreen(navController = navController)
        }
        composable(ROUTE_LINKS) {
            LinksScreen(navController = navController)
        }
        composable(ROUTE_COMMONMENTALH) {
            CommonScreen(navController = navController)
        }




        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController, productId)
        }









































    }
}