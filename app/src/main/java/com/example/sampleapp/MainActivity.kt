package com.example.sampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sampleapp.redux.action.UpdateTimeAction
import com.example.sampleapp.redux.reducer.Reducer
import com.example.sampleapp.redux.state.TimeStamp
import com.example.sampleapp.redux.store.Store

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val store = Store(
                initialState = TimeStamp(lastUpdated = System.currentTimeMillis()),
                reducer = ::Reducer
            )
            TimeScreen(store)
        }
    }
}

@Composable
fun TimeScreen(store: Store) {

    val uiState by store.state.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Last Updated:${uiState.lastUpdated}")
        Button(onClick = {
            store.dispatch(UpdateTimeAction.UpdateMessage("Update time"))
        }) {
            Text("update time")
        }
        Button(onClick = { store.dispatch(UpdateTimeAction.ClearMessage) }) {
            Text("Clear Time")
        }
    }

}




