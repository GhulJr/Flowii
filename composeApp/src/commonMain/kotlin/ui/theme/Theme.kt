package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun FlowiiTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (useDarkTheme) DarkColors else LightColors

    setupSystemParams(colorScheme)

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
        typography = typography(FontFamily())
    )
}

@Composable
expect fun setupSystemParams(colorScheme: ColorScheme)