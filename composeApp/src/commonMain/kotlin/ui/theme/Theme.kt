package ui.theme

//import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
//import androidx.compose.runtime.SideEffect
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.luminance
//import androidx.compose.ui.graphics.toArgb
//import androidx.compose.ui.platform.LocalView
//import androidx.core.view.WindowCompat

// TODO: how to deal with it? Can we have compose theme?
@Composable
fun FlowiiTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (useDarkTheme) DarkColors else LightColors

//    val view = LocalView.current
//    if (!view.isInEditMode) {
//        SideEffect {
//            val window = (view.context as Activity).window
//            WindowCompat.setDecorFitsSystemWindows(window, false)
//            window.statusBarColor = Color.Transparent.toArgb()
//            window.navigationBarColor =  Color.Transparent.toArgb()
//            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = colorScheme.background.luminance() > 0.5f
//        }
//    }


    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
        typography = typography(FontFamily())
    )
}