package com.crisnavarro.pokemonsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.crisnavarro.pokemonsapp.core.NavigationRoutes.*
import com.crisnavarro.pokemonsapp.ui.theme.PokemonsAppTheme
import com.crisnavarro.pokemonsapp.ui.theme.screens.PokemonListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokemonsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = RoutePokemonListScreen.route
                    ) {
                        composable(route = RoutePokemonListScreen.route) { PokemonListScreen() }
                    }
                }
            }
        }
    }
}