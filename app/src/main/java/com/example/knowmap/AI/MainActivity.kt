package com.example.knowmap.AI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.primarySurface
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.knowmap.AI.ui.theme.KnowMapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KnowMapTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavigationBar()
                    }
                ) { innerPadding ->
                    // Здесь можно добавить содержимое вашего Scaffold
                }
            }
        }
    }

    @Composable
    fun BottomNavigationBar() {
        BottomNavigation(
            backgroundColor = MaterialTheme.colors.primary, // Используем colorScheme вместо colors
            contentColor = MaterialTheme.colors.onPrimary,
        ) {
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_izbranoe), // Исправлено: imageVector вместо imgaVector
                        contentDescription = "Избранное" // Исправлено: изменено на "Избранное"
                    )
                },
                selected = false,
                onClick = {
                    // Обработка клика
                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_akkaynt), // Исправлено: imageVector вместо imgaVector
                        contentDescription = "Аккаунт" // Исправлено: изменено на "Аккаунт"
                    )
                },
                selected = false,
                onClick = {
                    // Обработка клика
                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_i11), // Исправлено: imageVector вместо imgaVector
                        contentDescription = "Аккаунт" // Исправлено: изменено на "Аккаунт"
                    )
                },
                selected = false,
                onClick = {
                    // Обработка клика
                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_history), // Исправлено: imageVector вместо imgaVector
                        contentDescription = "Аккаунт" // Исправлено: изменено на "Аккаунт"
                    )
                },
                selected = false,
                onClick = {
                    // Обработка клика
                }
            )
        }
    }
}
