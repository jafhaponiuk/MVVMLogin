package com.jafhaponiuk.mvvmlogin.ui.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jafhaponiuk.mvvmlogin.R

@Composable
fun LoginScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Login(Modifier.align(Alignment.Center))
    }
}

@Composable
fun Login(modifier: Modifier) {
    Column(modifier = modifier) {
        HeaderImage()
        Spacer(modifier = Modifier.padding(16.dp))
        EmailField()
    }
}

@Composable
fun EmailField() {
    TODO("Not yet implemented")
}

@Composable
fun HeaderImage() {
    Image(painter = painterResource(id = R.drawable.developer_photo), contentDescription = "Header")
}
