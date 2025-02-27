package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.sign

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ) {
        Card(
            modifier = Modifier
                .height(50.dp)
                .align(Alignment.TopEnd)
                .width(120.dp),
            shape = RoundedCornerShape(
                bottomStart = 35.dp
            ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Black
                )
        ){}
        Card(
            modifier = Modifier
                .height(50.dp)
                .align(Alignment.BottomStart)
                .width(120.dp),
            shape = RoundedCornerShape(
                topEnd = 35.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            )
        ){}
        Column (
    modifier = Modifier
        .padding(20.dp)
        .fillMaxSize()
        .background(
            color = Color.Transparent
        ),
            verticalArrangement = Arrangement.Center
        )
        {
            Text(
            text = stringResource(
                br.senai.sp.jandira.mytrips.R.string.login
            ),
                fontSize = 45.sp,
                fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.Start)
        )
            Text(
                text = stringResource(br.senai.sp.jandira.mytrips.R.string.sign ),

                color = Color.Gray,
                modifier = Modifier
                    .align(Alignment.Start)
            )


            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp)
                    .height(200.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(value = "example@email.com",
                    onValueChange ={},
                    modifier = Modifier
                        .fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email
                            , contentDescription = ""
                        )
                    },
                    label = {
                        Text(text =
                        stringResource(
                            br.senai.sp.jandira.mytrips.R.string.email
                        )
                        )

                    },
                )
                OutlinedTextField(value = "password",
                    onValueChange = {},
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "")
                    },
                    label = {
                        Text(text = stringResource(br.senai.sp.jandira.mytrips.R.string.password))
                    }

                )


                }

            }

        }






    }


@Preview
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}