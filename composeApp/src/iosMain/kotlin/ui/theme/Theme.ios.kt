package ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import platform.Foundation.NSLog

@Composable
actual fun setupSystemParams(colorScheme: ColorScheme) {
    NSLog("iOS setup system params")
}