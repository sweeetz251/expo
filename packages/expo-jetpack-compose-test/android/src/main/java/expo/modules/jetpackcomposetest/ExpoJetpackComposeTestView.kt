package expo.modules.jetpackcomposetest

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoComposeView


class ExpoJetpackComposeTestView(context: Context, appContext: AppContext) : ExpoComposeView(context, appContext) {
  @Composable
  fun HelloContent() {
    Column(modifier = Modifier.padding(16.dp)) {
      var name by remember { mutableStateOf("") }
      if (name.isNotEmpty()) {
        Text(
          text = "Hello, $name!",
          modifier = Modifier.padding(bottom = 8.dp),
          style = MaterialTheme.typography.bodyMedium
        )
      }
      OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        label = { Text("Name") }
      )
    }
  }


  init {
    setContent({ HelloContent() })
  }
}

