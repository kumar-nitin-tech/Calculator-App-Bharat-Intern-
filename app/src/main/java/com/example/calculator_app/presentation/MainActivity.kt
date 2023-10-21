package com.example.calculator_app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator_app.model.CalcViewModel
import com.example.calculator_app.presentation.ui.theme.Calculator_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculator_AppTheme {
                val viewModel = viewModel<CalcViewModel>()
                val state = viewModel.state
                val buttonSpacing = 20.dp
               Calculator(
                   state = state,
                   buttonSpacing = buttonSpacing,
                   onAction = viewModel::onAction,
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(16.dp)
               )
            }
        }
    }
}


