package com.template.entrypoint.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val darkColorScheme = darkColorScheme(

)

private val lightColorScheme = lightColorScheme(

)

@Composable
fun MainAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when (darkTheme) {
        true -> darkColorScheme
        false -> lightColorScheme
    }

    val controller = rememberSystemUiController()

    SideEffect {

    }

    MaterialTheme(
        content = content,
        colorScheme = colorScheme,
        typography = typography,
        shapes = shapes
    )
}