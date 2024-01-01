package com.uzmbapps.nestedscrollingjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.uzmbapps.nestedscrollingjetpackcompose.ui.theme.NestedScrollingJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedScrollingJetpackComposeTheme {
                NestedInLazyColumn()
//                NestedInColumn()
            }
        }
    }
}

