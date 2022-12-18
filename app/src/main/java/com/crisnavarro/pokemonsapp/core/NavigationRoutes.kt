package com.crisnavarro.pokemonsapp.core

sealed class NavigationRoutes(val route: String) {
    object RoutePokemonListScreen: NavigationRoutes("PokemonListScreen")
}