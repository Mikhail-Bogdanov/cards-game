package com.template.appdestinations

class AppDestinations {
    private enum class Destinations {
        Loading, Menu, Game, Settings
    }

    companion object {
        val Loading = Destinations.Loading.name
        val Menu = Destinations.Menu.name
        val Game = Destinations.Game.name
        val Settings = Destinations.Settings.name
    }
}