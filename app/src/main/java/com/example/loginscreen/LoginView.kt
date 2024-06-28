package com.example.loginscreen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginView()
{
    var emailID by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.loginimg),
            contentDescription = "Login Image",
            modifier = Modifier.size(200.dp)
        )

        Text(text = "Welcome", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = emailID, onValueChange = {
            emailID = it
        }, label = { Text(text = "Email") })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = { Text(text = "Password") }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential", "Email : $emailID Password: $password")
        }) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Forgot Password?", modifier = Modifier.clickable { })

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Or sign in with")

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = R.drawable.fblogo),
                contentDescription = "fb logo",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Facebook clicked
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.googlelogo),
                contentDescription = "google logo",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Facebook clicked
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.linkedinlogo),
                contentDescription = "linkedin logo",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Facebook clicked
                    }
            )

        }
    }
}